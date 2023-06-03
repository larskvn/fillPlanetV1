/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmplanet.Controller;

import com.filmplanet.Entity.PeliculaEntity;
import com.filmplanet.Service.PeliculaService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaservicio;


    @GetMapping
    public List<PeliculaEntity> findAll() {
        return peliculaservicio.findAll();
    }

    @GetMapping("/Custom")
    public List<PeliculaEntity> findAllCustom() {
        return peliculaservicio.findAllCustom();
    }
    @GetMapping("/{id}")
    public  Optional<PeliculaEntity> findById(@PathVariable long id){
        return peliculaservicio.findById(id);
    }
    @PostMapping
    public PeliculaEntity add(@RequestBody PeliculaEntity p){
        return peliculaservicio.add(p);
    }
     @PutMapping("/{id}")
     public PeliculaEntity update(@PathVariable Long id, @RequestBody PeliculaEntity p) {
        p.setId(id);
        return peliculaservicio.update(p);
    }
     
      @DeleteMapping("/{id}")
     public PeliculaEntity delete(@PathVariable long id) {
        PeliculaEntity objarticulo = new PeliculaEntity();
        objarticulo.setEstado(false);
        return peliculaservicio.delete(PeliculaEntity.builder().id(id).build());
    }
}
