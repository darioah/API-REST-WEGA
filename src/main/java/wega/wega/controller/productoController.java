/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wega.wega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import antlr.collections.List;
import wega.wega.entity.producto;
import wega.wega.service.productoService;
/**
 *
 * @author dario 
 */

@RestController
@RequestMapping("/api") 
public class productoController {
    
    @Autowired
    private productoService productoService;

    @GetMapping("/productos") 
    public List<producto> allProductos() {
        return productoService.ListaProductos();
    }
    
    @PostMapping("/producto")
     public producto crearProducto(@RequestBody producto producto) {
        return productoService.save(producto.getTipo_de_vehiculo(), producto.getMarca(), producto.getModelo(), producto.getEquivalencia(), producto.getMotor(), producto.getAnio(), producto.getFiltro_de_aire(), producto.getFiltro_de_aceite(), producto.getFiltro_de_combustible(), producto.getFiltro_de_habitaculo());

}
