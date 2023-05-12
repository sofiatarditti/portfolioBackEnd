
package com.sofiatarditti.SpringBoot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreE;
    private String descripcionE;

    public Experiencia() {
    }

    public Experiencia(long id, String nombreE, String descripcionE) {
        this.id = id;
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public Experiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public long getId() {
        return id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

 
    
}
