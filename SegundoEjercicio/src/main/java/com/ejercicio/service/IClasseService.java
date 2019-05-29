package com.ejercicio.service;


import java.util.List;

import com.ejercicio.entity.Classe;


public interface IClasseService {
  public Classe get (int classId );
  public List<Classe>getAll();
  public Classe post(Classe classe);
  public void put (Classe classe, int classId);
  public void delete(int classeId);
   
}
