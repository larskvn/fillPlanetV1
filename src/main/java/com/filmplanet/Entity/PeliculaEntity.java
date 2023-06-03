/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.filmplanet.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="PeliculaEntity")
@Table(name = "pelicula")
public class PeliculaEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "publicacion")
    private LocalDate publicacion;
    
    @Column(name = "descripcion")
    private  String descripcion;
    
    @Column(name = "video")
    private String video;
    
    @ManyToOne
    @JoinColumn(name = "cat_id",nullable = false)
    private CategoriaEntity cat_id;
    
    @Column(name = "estado")
    private Boolean estado;
    
    
}
