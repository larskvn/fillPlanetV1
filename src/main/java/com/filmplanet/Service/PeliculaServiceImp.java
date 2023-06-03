/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmplanet.Service;

import com.filmplanet.Entity.PeliculaEntity;
import com.filmplanet.Repository.PeliculaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImp implements PeliculaService{

    
    @Autowired
    private PeliculaRepository pelicularepositorio;
    
    @Override
    public List<PeliculaEntity> findAll() {
        return pelicularepositorio.findAll();
    }

    @Override
    public List<PeliculaEntity> findAllCustom() {
        return pelicularepositorio.findAllCustom();
    }

    @Override
    public Optional<PeliculaEntity> findById(long id) {
        return pelicularepositorio.findById(id);
    }

    @Override
    public PeliculaEntity add(PeliculaEntity p) {
        return pelicularepositorio.save(p);
    }

    @Override
    public PeliculaEntity update(PeliculaEntity p) {
        PeliculaEntity objpelicula = pelicularepositorio.getById(p.getId());
        BeanUtils.copyProperties(p, objpelicula);
        return pelicularepositorio.save(objpelicula);
    }

    @Override
    public PeliculaEntity delete(PeliculaEntity p) {
        PeliculaEntity objpelicula =pelicularepositorio.getById(p.getId());
        objpelicula.setEstado(false);
        return pelicularepositorio.save(objpelicula);
    }
    
}
