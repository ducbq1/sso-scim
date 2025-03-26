package com.viettel.authsync.service.implement;

import com.viettel.authsync.repository.BaseRepository;
import com.viettel.authsync.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T, ID> implements BaseService<T, ID> {

    private final BaseRepository<T, ID> repository;  // Inject repository để tái sử dụng CRUD
    public BaseServiceImpl(BaseRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T update(T entity) {
        if (entity != null) {
            return repository.save(entity); // Dùng save() để update nếu tồn tại
        }
        throw new IllegalArgumentException("Entity must not be null!");
    }

    @Override
    public Boolean existsById(ID id) {
        return repository.existsById(id);
    }
}
