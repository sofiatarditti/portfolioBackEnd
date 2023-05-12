
package com.sofiatarditti.SpringBoot.repository;

import com.sofiatarditti.SpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
       
}
