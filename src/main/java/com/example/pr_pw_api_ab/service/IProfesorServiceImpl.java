package com.example.pr_pw_api_ab.service;

import java.util.List;

import com.example.pr_pw_api_ab.repository.entitty.Profesor;
import com.example.pr_pw_api_ab.service.to.ProfesorTo;

public interface IProfesorServiceImpl {

    public void insertar(Profesor p);

    public List<ProfesorTo> consultarTodos();

    public void eliminar(Integer id);


    public ProfesorTo buscarPorId (Integer id);
}
