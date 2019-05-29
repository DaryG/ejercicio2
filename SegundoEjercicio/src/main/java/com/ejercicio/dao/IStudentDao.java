package com.ejercicio.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejercicio.entity.Student;

public interface IStudentDao extends CrudRepository<Student, Integer>{

}
