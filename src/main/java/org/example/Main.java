package org.example;


import org.example.Controladores.ControladorAfiliado;
import org.example.Controladores.ControladorEmpresaCultural;
import org.example.Controladores.ControladorNoAfiliado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControladorAfiliado controladorAfiliado = new ControladorAfiliado();
        ControladorNoAfiliado controladorNoAfiliado = new ControladorNoAfiliado();
        ControladorEmpresaCultural controladorEmpresaCultural = new ControladorEmpresaCultural();
        //metodo para guardar afiliado
        //controladorAfiliado.registrarAfiliado("AlexisMartinez", "12345", "a@gmail.com", 1);
        //metodo para guardar no afiliado
        //controladorNoAfiliado.registrarNoAfiliado("122355555", "KarinaGuerro",
          //      "ka@gmail.com",2,100000);

        controladorEmpresaCultural.registrarEmpresaCultural("1237777777", "Mundial Café", 1, "Empresa de café", "Corp Calidad", "Llevar el café a todo el mundo", "ac@gmail.com", 4223312);






    }
}