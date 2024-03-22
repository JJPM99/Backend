package com.microservice.celulares1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.celulares1.entity.Celular;

@Service
public interface CelularService {
	
	public List<Celular> findAll();
	
	public Celular findById(Long id);
	
	public void deleteById(Long id);
	
	public Celular save(Celular instance);
	
	public boolean existsById(Long id);

	
}
