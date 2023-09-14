package com.example.pr_pw_api_ab.repository.entitty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {

    @Id
    @Column(name = "prof_id")
      @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prof_seq_id")
    @SequenceGenerator(name = "prof_seq_id", sequenceName = "prof_seq_id", allocationSize = 1)

    private Integer id;

    @Column(name = "prof_nombre")
    private String nombre;


    @Column(name = "prof_apellido")
    private String apellido;

    @Column(name = "prof_cedula")
    private String cedula;


    @Column(name = "prof_fecha")

    private String fecha;


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


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    
}
