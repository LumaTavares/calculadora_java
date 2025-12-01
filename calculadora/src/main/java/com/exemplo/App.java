package com.exemplo;
import com.exemplo.model.Model;
import com.exemplo.view.View;
import com.exemplo.controller.Controller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller();
        View view = new View();

        int[] valores = view.Listar_metodos();

        
        if (valores != null) {
            controller.executar(valores[0], valores[1], valores[2]);
        }
    }
}