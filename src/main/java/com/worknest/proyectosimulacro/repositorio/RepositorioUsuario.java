/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.worknest.proyectosimulacro.repositorio;

import com.worknest.proyectosimulacro.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author WorkNest7
 */
@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
    Usuario findByNombre(String nombre);
    Usuario findByUsuario(String usuario);
}
