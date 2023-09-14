package com.example.pr_pw_api_ab.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pr_pw_api_ab.repository.entitty.Profesor;
import com.example.pr_pw_api_ab.service.IProfesorServiceImpl;
import com.example.pr_pw_api_ab.service.to.ProfesorTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
	import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RequestMapping("profesores")
@RestController
@CrossOrigin
public class ProfesorControllerResful {


    @Autowired
    private IProfesorServiceImpl profesorServiceImpl;




    @PostMapping()
    public void insertar(@RequestBody Profesor p){
        System.out.println(p.getCedula());
        this.profesorServiceImpl.insertar(p);
    }




    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity< List<ProfesorTo>> buscarTodos(){
        List<ProfesorTo> lsProfeTo = this.profesorServiceImpl.consultarTodos();

        for (ProfesorTo profesorTo : lsProfeTo) {
            
            Link mLink = linkTo(methodOn(ProfesorControllerResful.class).
            buscarPorId(profesorTo.getId())).withSelfRel();
            profesorTo.add(mLink);
        
        }

        return new  ResponseEntity<>(lsProfeTo, null,200);

    }




    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProfesorTo buscarPorId(@PathVariable Integer id){

        return this.profesorServiceImpl.buscarPorId(id);

    }

    
    @DeleteMapping(path = "/{id}")
        public void borrar(@PathVariable Integer id) {
            this.profesorServiceImpl.eliminar(id);
        }

    
}
