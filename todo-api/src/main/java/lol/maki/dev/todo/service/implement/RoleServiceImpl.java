package lol.maki.dev.todo.service.implement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import lol.maki.dev.todo.domain.Role;
import lol.maki.dev.todo.dto.request.SearchRequest;
import jakarta.persistence.criteria.Predicate;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lol.maki.dev.todo.dto.request.RoleRequest;
import lol.maki.dev.todo.dto.response.RoleResponse;
import lol.maki.dev.todo.repository.PermissionRepository;
import lol.maki.dev.todo.repository.RoleRepository;
import lol.maki.dev.todo.service.RoleService;
import lol.maki.dev.todo.service.mapper.RoleMapper;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    RoleRepository roleRepository;
    PermissionRepository permissionRepository;
    RoleMapper roleMapper;

    public RoleResponse create(RoleRequest request) {
        var role = roleMapper.toRole(request);

        role = roleRepository.save(role);
        return roleMapper.toRoleResponse(role);
    }

    public List<RoleResponse> getAll() {
        return roleRepository.findAll().stream().map(roleMapper::toRoleResponse).toList();
    }

    public void delete(String role) {
        roleRepository.deleteById(role);
    }

    public Page<RoleResponse> dynamicSearch(SearchRequest searchRequest) {
        Sort sort = parseSort(searchRequest.getSort());
        Pageable pageable = PageRequest.of(searchRequest.getPage(), searchRequest.getSize(), sort);

        Specification<Role> spec = buildSpecification(searchRequest.getFilters());
        Page<Role> results = roleRepository.findAll(spec, pageable);

        return results.map(roleMapper::toRoleResponse);
    }

    private Specification<Role> buildSpecification(Map<String, String> filters) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            filters.forEach((key, value) -> {
                if (value != null && !value.isEmpty()) {
                    switch (key) {
                        case "name":
                            predicates.add(cb.like(cb.lower(root.get("name")), "%" + value.toLowerCase() + "%"));
                            break;
                        case "department":
                            predicates.add(cb.equal(root.get("department"), value));
                            break;
                        case "status":
                            predicates.add(cb.equal(root.get("status"), value));
                            break;
                        case "fromDate":
                            predicates.add(cb.greaterThanOrEqualTo(root.get("createdAt"), LocalDate.parse(value)));
                            break;
                        case "toDate":
                            predicates.add(cb.lessThanOrEqualTo(root.get("createdAt"), LocalDate.parse(value)));
                            break;
                        // Add more fields here
                    }
                }
            });

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }

    private Sort parseSort(String sortStr) {
        if (sortStr == null || sortStr.isEmpty()) {
            return Sort.unsorted();
        }

        // Ví dụ: sortStr = "name,asc;createdAt,desc"
        String[] orders = sortStr.split(";");
        List<Sort.Order> sortOrders = new ArrayList<>();

        for (String orderStr : orders) {
            String[] parts = orderStr.split(",");
            if (parts.length == 2) {
                String property = parts[0];
                String direction = parts[1];

                Sort.Order order = direction.equalsIgnoreCase("desc") ?
                        Sort.Order.desc(property) : Sort.Order.asc(property);

                sortOrders.add(order);
            }
        }

        return Sort.by(sortOrders);
    }

}
