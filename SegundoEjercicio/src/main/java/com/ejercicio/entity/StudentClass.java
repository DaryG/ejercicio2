package com.ejercicio.entity;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import java.util.Date;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
* clase Entity Parent, desarrollamos la estructura de nuestra entidad parents, y las relaciones
* con las otras entidades.
* @author Dary Gonzales Cervera
*
*/
@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table(name = "StudentClasses")
public class StudentClass {

@ManyToOne
@MapsId("student_id")
@JoinColumn(name = "student_id")
Student student;

@ManyToOne
@MapsId("class_id")
@JoinColumn(name = "class_id")
Classe classe;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "date_from")
private int dateFrom;

@Column(name = "date_to")
private String dateTo;
}