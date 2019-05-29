package com.ejercicio.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejercicio.entity.Subject;

public interface ISubjectDao extends CrudRepository<Subject, Integer>{

}
