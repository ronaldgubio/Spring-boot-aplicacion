package com.ltg.appconfigurator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltg.appconfigurator.entity.AfAutorizacionMovimiento;
import com.ltg.appconfigurator.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	public List<AfAutorizacionMovimiento> findAll() {
		return (List<AfAutorizacionMovimiento>) loginRepository.findAll();
	}
}
