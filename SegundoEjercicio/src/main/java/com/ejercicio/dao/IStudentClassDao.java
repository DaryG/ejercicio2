package com.ejercicio.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejercicio.entity.StudentClass;

public interface IStudentClassDao extends CrudRepository<StudentClass, Integer>{

}
