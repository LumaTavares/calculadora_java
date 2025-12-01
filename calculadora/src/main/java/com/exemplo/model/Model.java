package com.exemplo.model;

public class Model {
   public double somar(int a, int b) { 
        return a + b;
    }
    public double subtrair(int a, int b) {
         return a - b; 
    }
    public double dividir(int a, int b) { 
        return b != 0 ? a / b : Double.NaN; 
    }
    public double multiplicar(int a, int b) {
         return a * b; 
    }
}