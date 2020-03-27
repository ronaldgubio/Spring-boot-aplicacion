package com.ltg.appconfigurator.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ltg.appconfigurator.entity.AfAutorizacionMovimiento;

@Repository
public class LoginRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<AfAutorizacionMovimiento> findAll() {
		return jdbcTemplate.query("select * from AF_PARAMETRO aa where aa.PARA_CODIGO like '5.%' order by para_codigo",
				new BeanPropertyRowMapper<AfAutorizacionMovimiento>(AfAutorizacionMovimiento.class));
	}
}
