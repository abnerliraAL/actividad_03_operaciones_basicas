/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PC-6
 */
public class Model {
     private int numero1=0;
     private int numero2=0;
     private int total = 0;
    /**
     * @return the value
     */
    public int getnumero1() {
        return numero1;
    }

    /**
     * @param value the value to set
     */
    public void setnumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public int getnumero2() {
        return numero2;
    }

    /**
     * @param value the value to set
     */
    public void setnumero2(int numero2) {
        this.numero2 = numero2;
    }
    public int sumar(){
         this.total =  this.numero1 + this.numero2;
         return this.total;
     }
 
    
 
    public int resta(){
        this.total =  this.numero1 - this.numero2;
         return this.total;
     }

    public int multiplicacion(){
      this.total =  this.numero1 * this.numero2;
       return this.total;
    }
    public double porcentaje(){
        this.total =  this.numero1 % (this.numero2 );
         return this.total;
    }
    public int division(){
        this.total =  this.numero1 / this.numero2;
        return this.total; 
      }
    public double get_total(){
        return this.total;
    }
    }


