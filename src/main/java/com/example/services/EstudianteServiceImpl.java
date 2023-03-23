package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EstudianteDao;
import com.example.entities.Estudiante;

import jakarta.transaction.Transactional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteDao estudianteDao;
    
    @Override
    public List<Estudiante> findAll() {
        return estudianteDao.findAll();
    }

    @Override
    public Estudiante findById(int idEstudiante) {
        return estudianteDao.findById(idEstudiante).get();
    }

    @Override
    @Transactional
    public void save(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }

    @Override
    @Transactional
    public void deleteById(int idEstudiante) {
        estudianteDao.deleteById(idEstudiante);
    }

    @Override
    @Transactional
    public void delete(Estudiante estudiante) {
        estudianteDao.delete(estudiante);
    }
    
}
