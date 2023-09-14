package com.example.pr_pw_api_ab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pr_pw_api_ab.repository.IProfesorRepository;
import com.example.pr_pw_api_ab.repository.entitty.Profesor;
import com.example.pr_pw_api_ab.service.to.ProfesorTo;

@Service
public class ProfesorServiceImpl implements IProfesorServiceImpl {


    @Autowired
    private IProfesorRepository profesorRepository;

    @Override
    public void insertar(Profesor p) {
        this.profesorRepository.insertar(p);
    }

    @Override
    public List<ProfesorTo> consultarTodos() {

        var ls =     profesorRepository.consultarTodos();
        List <ProfesorTo> lsProfTo = new ArrayList<>();
        for (Profesor profesor : ls) {
              
            lsProfTo.add(convertir(profesor));
        }
        return  lsProfTo;

    }


    public ProfesorTo convertir(Profesor p){

        ProfesorTo pto = new ProfesorTo();

        pto.setCedula(p.getCedula());
        pto.setNombre(p.getNombre());
        pto.setId(p.getId());
    

        return pto;


    }

    @Override
    public void eliminar(Integer id) {
       this.profesorRepository.eliminar(id);
    }

    @Override
    public ProfesorTo buscarPorId(Integer id) {
        return convertir(this.profesorRepository.buscarPorId(id));
    }




    
}
