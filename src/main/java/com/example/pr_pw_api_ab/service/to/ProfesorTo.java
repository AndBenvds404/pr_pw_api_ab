package com.example.pr_pw_api_ab.service.to;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Column;

public class ProfesorTo  extends RepresentationModel<ProfesorTo> implements Serializable{

    private static final Long  SerializableUI= 1L;

    private Integer id;

    
    private String nombre;


    
    private String cedula;



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getCedula() {
        return cedula;
    }



    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    


   
    
    
}
