package com.ejercicio.entity;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
//import java.util.List;
import java.util.Set;

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
import javax.persistence.OneToMany;
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
@Table(name = "Classes")
public class Classe {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "class_id")
private int classId;

@ManyToOne
@JoinColumn(name = "subject_id")
private Subject subject;

@ManyToOne
@JoinColumn(name = "teacher_id")
private Teacher teacher;

@Column(name = "class_code")
private String classCode;

@Column(name = "class_name")
private String className;

@Column(name = "date_from")
private Date dateFrom;

@Column(name = "date_to")
private String dateTo;

@OneToMany(mappedBy = "classe")
private Set<StudentClass> studentclass;

}