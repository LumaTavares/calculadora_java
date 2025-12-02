package com.exemplo.controller;

import com.exemplo.model.Model;
import com.exemplo.view.View;

import java.lang.reflect.*;

public class Controller {
    private Model model;
    private View view;

    public Controller() {
        this.model = new Model();
        this.view = new View();
    }

    public void iniciar() {
        int[] valores = view.Listar_metodos();
        if (valores != null){
            executar(valores[0], valores[1], valores[2]);
        }
        
    }

    public void executar(int opcao, int a, int b) {
        try {
            Class<?> clazz = Model.class;
            Object modelObj = clazz.getDeclaredConstructor().newInstance(); // instância do model

            Method[] methods = clazz.getDeclaredMethods();

            Method metodoSelecionado = methods[opcao - 1];
            if (b==0 && metodoSelecionado.getName().equals("dividir")) {
                System.out.println("divisão por zero.");
                return;
            }
            Object resultado = metodoSelecionado.invoke(modelObj, a, b);
            System.out.println("resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro ao executar operação");
        }
    }
}