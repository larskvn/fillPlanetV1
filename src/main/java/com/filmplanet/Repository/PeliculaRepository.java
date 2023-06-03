/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.filmplanet.Repository;

import com.filmplanet.Entity.PeliculaEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Long> {
     @Query(value = "SELECT * FROM PeliculaEntity WHERE estado = '1'", nativeQuery = true)
     List<PeliculaEntity> findAllCustom();
}
