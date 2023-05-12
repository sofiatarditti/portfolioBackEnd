
package com.sofiatarditti.SpringBoot.service;

import com.sofiatarditti.SpringBoot.model.Experiencia;
import java.util.List;
import java.util.Optional;

public interface IExperienciaService {
    
    public List<Experiencia> list();
    public Optional<Experiencia> getOne(Long id);
    public void save(Experiencia expe);
    public void delete(Long id);
    public boolean existsById(Long id);
    
 
}
