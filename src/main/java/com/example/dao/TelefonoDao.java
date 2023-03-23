package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Estudiante;
import com.example.entities.Telefono;


public interface TelefonoDao extends JpaRepository<Telefono, Integer> {

    //Query(value= "delete from telfonos where estudiante_id = :idEstudiante", nativeQuery = true)
    // public void deleteByEstudiante(@Param("idEstudiante") Integer idEstudiante);

    //o

    //Query(value= "delete from telfonos where estudiante_id = ?", nativeQuery = true)
    // public void deleteByEstudiante(Integer idEstudiante);

    long deleteByEstudiante(Estudiante estudiante);

    List<Telefono> findByEstudiante(Estudiante estudiante);
    
    
}
