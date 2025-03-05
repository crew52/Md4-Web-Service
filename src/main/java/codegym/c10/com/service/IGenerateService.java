package codegym.c10.com.service;

import codegym.c10.com.model.Computer;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();

    T save(T T);

    Optional<T> findById(Long id);

    void remove(Long id);
}
