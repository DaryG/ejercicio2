package com.ejercicio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "Teachers")
public class Teacher {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "teacher_id")
  private int teacherId;
  
  @Column(name = "school_name")
  private String schoolName;
  
  @Column(name = "gender")
  private String gender;
  
  @Column(name = "first_name")
  private String firstName;
  
  @Column(name = "middle_name")
  private String middleName;
  
  @Column(name = "last_name")
  private String lastName;
  
  @Column(name = "other_teacher_details")
  private String otherTeacherDetails;
  /**
   * Relación muchos a muchos con la entidad parents.
   */
  @JsonIgnore
  @OneToMany(mappedBy = "teacher")
  private Set<Classe>classes;
}

  
