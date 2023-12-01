package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.CarreraEntity;
import com.example.demo.repository.CarreraRepository;
import com.example.demo.service.CarreraService;


@Service
public class CarreraServiceImpl implements CarreraService {

	@Autowired
	private CarreraRepository carreraRepository;
	
	@Override
	public CarreraEntity create(CarreraEntity car) {
		// TODO Auto-generated method stub
		return carreraRepository.save(car);
	}

	@Override
	public List<CarreraEntity> readAll() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}

	@Override
	public CarreraEntity update(CarreraEntity car) {
		// TODO Auto-generated method stub
		return carreraRepository.save(car);
	}

	@Override
	public void delete(Long id) {
		carreraRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public CarreraEntity read(Long id) {
		// TODO Auto-generated method stub
		return carreraRepository.findById(id).get();
	}
}
