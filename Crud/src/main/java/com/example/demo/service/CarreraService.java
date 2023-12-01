package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CarreraEntity;


public interface CarreraService {
	CarreraEntity create (CarreraEntity car);
	CarreraEntity update(CarreraEntity car);
	void delete(Long id);
	CarreraEntity read(Long id);
	List<CarreraEntity> readAll();
}
