package com.ltg.appconfigurator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ltg.appconfigurator.entity.AfAutorizacionMovimiento;

@Repository
public interface LoginRepository extends CrudRepository<AfAutorizacionMovimiento, String> {

}
