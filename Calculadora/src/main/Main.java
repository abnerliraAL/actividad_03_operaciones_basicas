package main;
import views.CalculatorView;
import models.CalculatorModel;
import controllers.ControllerCalculadora;

public class Main {
    private CalculatorView view;
    private CalculatorModel model;
    private ControllerCalculadora controller;
    
    public static void main(String[] args) {
             CalculatorView view = new CalculatorView();
             CalculatorModel model = new CalculatorModel();
             ControllerCalculadora controllerCalculadora = new ControllerCalculadora(view, model);
       
    }
}
