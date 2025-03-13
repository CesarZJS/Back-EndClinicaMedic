package com.citasmedicas.controller;


import com.citasmedicas.model.CitaMedica;
import com.citasmedicas.service.CitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaMedicaController {

    @Autowired
    private CitaMedicaService service;

    @GetMapping
    public List<CitaMedica> listarCitas() {
        return service.listarCitas();
    }

    @PostMapping
    public CitaMedica guardarCita(@RequestBody CitaMedica cita) {
        return service.guardarCita(cita);
    }

    @DeleteMapping("/{id}")
    public void eliminarCita(@PathVariable Long id) {
        service.eliminarCita(id);
    }
}