package com.microservice.celulares1.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.celulares1.entity.Celular;

public interface CelularDao extends CrudRepository<Celular, Long>{

}
