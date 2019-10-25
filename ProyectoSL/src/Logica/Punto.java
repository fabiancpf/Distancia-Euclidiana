/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Dell
 */
public class Punto {
    
    public Punto() {
    }
    
    public double CalcularDistancia(Vector v1, Vector v2){
     double distancia;     
     
     distancia = Math.sqrt(Math.pow((v2.getX()-v1.getX()), 2) + Math.pow((v2.getY()-v1.getY()), 2));
      
    return distancia;
    }
    
    
    
}
