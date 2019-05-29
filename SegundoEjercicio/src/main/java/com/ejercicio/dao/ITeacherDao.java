package com.ejercicio.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejercicio.entity.Teacher;

public interface ITeacherDao extends CrudRepository<Teacher, Integer>{

}
