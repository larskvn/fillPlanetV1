/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmplanet.Service;

import com.filmplanet.Entity.PeliculaEntity;
import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    public List<PeliculaEntity> findAll();

    public List<PeliculaEntity> findAllCustom();

    public Optional<PeliculaEntity> findById(long id);

    public PeliculaEntity add(PeliculaEntity p);

    public PeliculaEntity update(PeliculaEntity p);

    public PeliculaEntity delete(PeliculaEntity p);

}
