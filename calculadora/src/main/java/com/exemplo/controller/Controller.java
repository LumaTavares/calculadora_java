package com.exemplo.controller;
import com.exemplo.model.Model;
import java.lang.reflect.*;

public class Controller {
    
  public void executar(int opcao, int a, int b) {
        try {
            Class<?> clazz = Model.class;
            Object modelObj = clazz.getDeclaredConstructor().newInstance(); //  instância do model

            Method[] methods = clazz.getDeclaredMethods();

            Method metodoSelecionado = methods[opcao - 1];
            Object resultado = metodoSelecionado.invoke(modelObj, a, b);
            System.out.println("resultado: " + resultado);
        } catch (Exception e) {
            System.err.println("Erro ao executar operação");
        }
    }
}