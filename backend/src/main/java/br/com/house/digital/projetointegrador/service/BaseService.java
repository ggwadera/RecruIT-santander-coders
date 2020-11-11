package br.com.house.digital.projetointegrador.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<T, PK> {

    T save(T entity);

    T update(T entity);

    T patch(T entity);

    T findById(PK id);

    List<T> findAll();

    Page<T> findAll(Pageable pageable);

    void deleteById(PK id);

    T convertToEntity(Object dto);

    <D> D convertFromEntity(T entity, Class<D> destinationType);

}
