/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototipocalculadora.Calculadora;

/**
 *
 * @author João Vitor
 */
public class Calculadora {

    private final double n1, n2;
    private double resultado;
    private final String op;
  
   public Calculadora(double n1, double n2,String op){
      this.n1 = n1;
      this.n2 = n2;
      this.op = op;
      
  }
    public double Resultado() {
    
        switch(op) {
            case "+" -> resultado = n1 +n2;
            case "-" -> {
                System.out.println("Subtração");
                resultado = n1 - n2;
            }
            case "/" -> {
                System.out.println("Divisão");
                resultado = n1 / n2;
            }
            case "*" -> resultado = n1 * n2;
        }
        return resultado;
    }
   
}
