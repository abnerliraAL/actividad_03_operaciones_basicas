package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.CalculatorModel;
import views.CalculatorView;

public final class ControllerCalculadora {
    public CalculatorView calculatorView;
    public CalculatorModel calculatorModel;
       
    public ControllerCalculadora(CalculatorView calculatorView, CalculatorModel calculatorModel){
        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;
        this.startView();
        
       this.calculatorView.jb_mas.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                masButton(e);
            }
        });
       
       this.calculatorView.jb_menos.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                menosButton(e);
            }
        });
       
       this.calculatorView.jb_multiplicar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                multiplicarButton(e);
            }
        });
       
       this.calculatorView.jb_dividir.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                dividirButton(e);
            }
        });
       
    }
    
    public void masButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_numero1.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_numero2.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.mas());
    }
    
    public void menosButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_numero1.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_numero2.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.menos());
    }
    
    public void multiplicarButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_numero1.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_numero2.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.multiplicar());
    }
    
    public void dividirButton(ActionEvent e){
        double firstValue = Double.parseDouble(this.calculatorView.jtx_numero1.getText());
        double secondValue = Double.parseDouble(this.calculatorView.jtx_numero2.getText());
        this.calculatorModel.setValues(firstValue, secondValue);
        this.calculatorView.jtx_result.setText(""+this.calculatorModel.dividir());
    }
    
    public void startView(){
        this.calculatorView.setTitle("Calculadora");
        this.calculatorView.setLocationRelativeTo(null);
        this.calculatorView.setVisible(true);
    }
}

