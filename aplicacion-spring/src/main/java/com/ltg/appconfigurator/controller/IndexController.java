package com.ltg.appconfigurator.controller;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.ltg.appconfigurator.entity.AfAutorizacionMovimiento;
import com.ltg.appconfigurator.service.LoginService;


@ManagedBean(value = "indexController")
@ViewScoped
public class IndexController {

	@Autowired
	private LoginService loginService;

	private List<AfAutorizacionMovimiento> listaPrueba;

	private String usuario;

	private String password;
	
	@PostConstruct
	public void iniciar() {
		listaPrueba=loginService.findAll();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AfAutorizacionMovimiento> getListaPrueba() {
		return listaPrueba;
	}

	public void setListaPrueba(List<AfAutorizacionMovimiento> listaPrueba) {
		this.listaPrueba = listaPrueba;
	}

	public void login() {
		System.out.println(usuario + password);
	}

}
