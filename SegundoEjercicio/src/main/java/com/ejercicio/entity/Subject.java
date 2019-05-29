package com.ejercicio.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "Subjects")
public class Subject {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="subject_id")
  private int subjectId;
  @Column(name = "subject_name")
  private String subjectName;
  
  /**
   * Relación muchos a muchos con la entidad parents.
   */
  @JsonIgnore
  @OneToMany(mappedBy = "subject")
  private Set<Classe>classes;
}