/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wega.wega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wega.wega.entity.producto;

/**
 *
 * @author sebastian
 */
public interface productoRepository extends JpaRepository <producto,String> {
    
}
