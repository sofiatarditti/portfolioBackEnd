
package com.sofiatarditti.SpringBoot.Controller;

import com.sofiatarditti.SpringBoot.dto.DtoExperiencia;
import com.sofiatarditti.SpringBoot.model.Experiencia;
import com.sofiatarditti.SpringBoot.security.controller.Mensaje;
import com.sofiatarditti.SpringBoot.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin (origins = {"https://portfolio-sofiatarditti.web.app/","http://localhost:4200"})
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expeService;
    
    @GetMapping("/listaExpe")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = expeService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
        @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") Long id){
        if(!expeService.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = expeService.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    @PostMapping("/nuevaExpe")
    public ResponseEntity<?> create(@RequestBody DtoExperiencia dtoexpe){
        Experiencia experiencia = new Experiencia(dtoexpe.getNombreE(), dtoexpe.getDescripcionE());
        expeService.save(experiencia);
        
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @PutMapping("/updateExpe/{id}")
    public ResponseEntity<?> update(@PathVariable ("id") Long id, @RequestBody DtoExperiencia dtoexpe){
        
        if(!expeService.existsById(id))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = expeService.getOne(id).get();
        experiencia.setNombreE(dtoexpe.getNombreE());
        experiencia.setDescripcionE(dtoexpe.getDescripcionE());
        expeService.save(experiencia);
        
        return new ResponseEntity(HttpStatus.OK);
    }
    
    @DeleteMapping ("/deleteExpe/{id}")
    public ResponseEntity<?> delete(@PathVariable ("id") Long id){
        
        if(!expeService.existsById(id))
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        
        expeService.delete(id);
        
        return new ResponseEntity(HttpStatus.OK);
    }
}
