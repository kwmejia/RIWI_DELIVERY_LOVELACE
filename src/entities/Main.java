package entities;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // iniciar sesion
        //Registrarse
        //cerrar sesion

        JOptionPane.showMessageDialog(null, "********* BIENVENIDO A RIWI DELEVERY **********");

        String opcion = "";

        do {
            opcion= JOptionPane.showInputDialog(null, """
                    1. Iniciar sesion
                    2. Registrarse
                    3. Salir
                    
                    Ingrese la opcion:
                    """);

            switch (opcion) {
                case "1":
                    // Logica Iniciar sesion
                    break;
                case "2":
                    // Logica Registrarse
                    break;
            }

        } while (!opcion.equals("3"));









    }

}