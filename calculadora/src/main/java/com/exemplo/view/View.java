package com.exemplo.view;
import java.lang.reflect.*;
import com.exemplo.model.Model;
import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public int[] Listar_metodos() {
        System.out.println("operações disponiveis");
        Class<?> clazz = Model.class;
        int i = 1;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(i + "-> " + m.getName());
            i++;
        }

        System.out.println("Escolha uma opcção");
        
        int opcao = sc.nextInt();
        if (opcao >= 1 && opcao <= methods.length){
            System.err.println("digite o primeiro valor:");
            int a = sc.nextInt();
            System.err.println("digite o segundo valor:");  
            int b = sc.nextInt();
            return new int[]{opcao,a, b};
            
        } else {
            System.out.println("operacao nao existe.");
            return null;
        }
    }
}