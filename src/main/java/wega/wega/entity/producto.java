/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wega.wega.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
id	
tipo_de_vehiculo
Marca
Modelo
Equivalencia
motor	
año
filtro_aire
filtro_aceite
filtro_combustible
habitaculo
 */
 
@Entity
public class producto implements Serializable {
       @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    protected String id ; 
    
    protected String tipo_de_vehiculo ; 
     protected String marca  ; 
      protected String modelo ; 
       protected String equivalencia ; 
        protected String motor ; 
         protected String anio ; 
         protected String filtro_de_aire ; 
          protected String filtro_de_aceite ; 
           protected String filtro_de_combustible ;
           protected String filtro_de_habitaculo; 

    public producto() {
    }

    public producto(String id, String tipo_de_vehiculo, String marca, String modelo, String equivalencia, String motor, String anio, String filtro_de_aire, String filtro_de_aceite, String filtro_de_combustible, String filtro_de_habitaculo) {
        this.id = id;
        this.tipo_de_vehiculo = tipo_de_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.equivalencia = equivalencia;
        this.motor = motor;
        this.anio = anio;
        this.filtro_de_aire = filtro_de_aire;
        this.filtro_de_aceite = filtro_de_aceite;
        this.filtro_de_combustible = filtro_de_combustible;
        this.filtro_de_habitaculo = filtro_de_habitaculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo_de_vehiculo() {
        return tipo_de_vehiculo;
    }

    public void setTipo_de_vehiculo(String tipo_de_vehiculo) {
        this.tipo_de_vehiculo = tipo_de_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEquivalencia() {
        return equivalencia;
    }

    public void setEquivalencia(String equivalencia) {
        this.equivalencia = equivalencia;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getFiltro_de_aire() {
        return filtro_de_aire;
    }

    public void setFiltro_de_aire(String filtro_de_aire) {
        this.filtro_de_aire = filtro_de_aire;
    }

    public String getFiltro_de_aceite() {
        return filtro_de_aceite;
    }

    public void setFiltro_de_aceite(String filtro_de_aceite) {
        this.filtro_de_aceite = filtro_de_aceite;
    }

    public String getFiltro_de_combustible() {
        return filtro_de_combustible;
    }

    public void setFiltro_de_combustible(String filtro_de_combustible) {
        this.filtro_de_combustible = filtro_de_combustible;
    }

    public String getFiltro_de_habitaculo() {
        return filtro_de_habitaculo;
    }

    public void setFiltro_de_habitaculo(String filtro_de_habitaculo) {
        this.filtro_de_habitaculo = filtro_de_habitaculo;
    }
         
}
