
package models;

public class CalculatorModel {
    
    float numero1= 0;
    float numero2 = 0;
    
    public float getFirstValue(){
        return numero1;
    }
    
    public double getSecondValue(){
        return numero2;
    }
    
    public void setValues(double numero1, double numero2){
        this.numero1 = (float) numero1;
        this.numero2 = (float) numero2;
    }
    
    public double mas(){
       return this.numero1 + this.numero2;
    }
    
    public double menos(){
        return this.numero1 - this.numero2;
    }
    
    public double multiplicar(){
        return this.numero1* this.numero2;
    }
    
    public double dividir(){
        return this.numero1 / this.numero2;
    }
    
    public double getmas(){
        return this.mas();   
    }
    
    public double getmenos(){
        return this.menos();
    }
    
    public double getMultiplicar(){
        return this.multiplicar();
    }
    
    public double getDividir(){
        return this.dividir();
    }
}
