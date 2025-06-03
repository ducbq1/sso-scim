package lol.maki.dev.todo.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {

    T save(T entity);

    void deleteById(ID id);

    Optional<T> findById(ID id);

    List<T> findAll();

    T update(T entity);

    Boolean existsById(ID id);
}
