package com.example.pr_pw_api_ab.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.pr_pw_api_ab.repository.entitty.Profesor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class ProfesorRepositoryImpl implements IProfesorRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Profesor p) {
        
        this.entityManager.persist(p);
    }

    @Override
    public List<Profesor> consultarTodos() {
        
        return this.entityManager.createQuery("SELECT p FROM Profesor p", Profesor.class).getResultList();
    }

    @Override
    public void eliminar(Integer id) {
       
        this.entityManager.remove(this.buscarPorId(id));
    }

    @Override
    public Profesor buscarPorId(Integer id) {
        return this.entityManager.find(Profesor.class,id);

    }
    
}
