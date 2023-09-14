package com.example.pr_pw_api_ab.repository;

import java.util.List;

import com.example.pr_pw_api_ab.repository.entitty.Profesor;

public interface IProfesorRepository {
    
    public void insertar(Profesor p);

    public List<Profesor> consultarTodos();

    public void eliminar(Integer id);

    public Profesor buscarPorId(Integer id);
}
