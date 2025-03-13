package com.citasmedicas.service;


import com.citasmedicas.model.CitaMedica;
import com.citasmedicas.repository.CitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaMedicaService {

    @Autowired
    private CitaMedicaRepository repository;

    public List<CitaMedica> listarCitas() {
        return repository.findAll();
    }

    public CitaMedica guardarCita(CitaMedica cita) {
        return repository.save(cita);
    }

    public void eliminarCita(Long id) {
        repository.deleteById(id);
    }
}