
package com.sofiatarditti.SpringBoot.repository;

import com.sofiatarditti.SpringBoot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Long> {
    
 
}
