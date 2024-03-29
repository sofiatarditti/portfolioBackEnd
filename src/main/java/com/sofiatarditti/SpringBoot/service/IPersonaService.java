
package com.sofiatarditti.SpringBoot.service;

import com.sofiatarditti.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas();
    public void crearPersona (Persona pers);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    
}
