package com.example.services;

import java.util.List;

import com.example.entities.Estudiante;
import com.example.entities.Telefono;

public interface TelefonoService {
    List<Telefono> findAll();
    Telefono findById(int idTelefono);
    void save(Telefono telefono);
    void deleteById(int idTelefono);
    void deleteByEstudiante(Estudiante estudiante);
    List<Telefono> findByEstudiante(Estudiante estudiante);
}
