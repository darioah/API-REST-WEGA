/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wega.wega.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import wega.wega.entity.producto;
import wega.wega.repository.productoRepository;
import java.arraylist;
import java.util.List;

/**
 *
CRUD GUARDAR ELIMNAR EDITAR CREAR 
 */


@Service
public class productoService {
    
    @Autowired
   private producto producto ;
   @Autowired
    private productoRepository productoRepository;
    

    @Transactional
    public producto save(String tipo_de_vehiculo, String marca, String modelo, String equivalencia, String motor, String anio, String filtro_de_aire, String filtro_de_aceite, String filtro_de_combustible, String filtro_de_habitaculo){


        producto producto = new producto( );

        producto.setTipo_de_vehiculo(tipo_de_vehiculo);
        producto.setMarca( marca);
        producto.setModelo(modelo);
        producto.setEquivalencia(equivalencia);
        producto.setMotor(motor);
        producto.setAnio(anio);
        producto.setFiltro_de_aire( filtro_de_aire);
        producto.setFiltro_de_aceite( filtro_de_aceite);
        producto.setFiltro_de_combustible( filtro_de_combustible);
        producto.setFiltro_de_habitaculo(filtro_de_habitaculo);

        



        return productoRepository.save(producto);
        
       
    }
    public producto Update(String id, String tipo_de_vehiculo, String marca, String modelo, String equivalencia, String motor, String anio, String filtro_de_aire, String filtro_de_aceite, String filtro_de_combustible, String filtro_de_habitaculo){
       producto producto = productoRepository.getById(id);
       
        producto.setTipo_de_vehiculo(tipo_de_vehiculo);
        producto.setMarca(marca);
        producto.setModelo(modelo);
        producto.setEquivalencia(equivalencia);
        producto.setMotor(motor);
        producto.setAnio(anio);
        producto.setFiltro_de_aire(filtro_de_aire);
        producto.setFiltro_de_aceite(filtro_de_aceite);
        producto.setFiltro_de_combustible(filtro_de_combustible);
        producto.setFiltro_de_habitaculo(filtro_de_habitaculo);
        


        return productoRepository.save(producto);
    }
    @Transactional
    public void detele(String id){
        producto producto = productoRepository.getOne(id);
        productoRepository.delete(producto);
        
    }
    @Transactional
    public producto getOne(String id){
        return productoRepository.getOne(id);
    }
    @Transactional
    public Iterable<producto> getAll(){
        return productoRepository.findAll();
    }

    @Transactional
     public List<producto>ListaProducto(){

        return productoRepository.findAll();
}
