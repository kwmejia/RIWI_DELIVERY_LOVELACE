package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import entities.Client;
import entities.DeliveryMan;
import entities.Account;

public class AuthController
{
    private ArrayList<Client> clients;
    private ArrayList<DeliveryMan> deliveryMans;

    public AuthController()
    {
        clients = new ArrayList<>();
        deliveryMans = new ArrayList<>();
    }

    public void register()
    {
        int typeUser =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de usuario ( Delivery: 1 / Client: 2)"));
        int id = 0;

        if (typeUser == 1)
        {

            String emailRegister = JOptionPane.showInputDialog("Ingrese el email a registrar");
            String passwordRegister = JOptionPane.showInputDialog("Ingrese la contraseña");

            String name = JOptionPane.showInputDialog("Ingrese su nombre");
            double document = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su documento"));
            String phoneNumber = JOptionPane.showInputDialog("Ingrese su telefono");

            String vehicleType = JOptionPane.showInputDialog("Que tipo de vehiculo manejará?");
            String vehiclePlate = JOptionPane.showInputDialog("Que tipo de vehiculo manejará?");

            boolean status = true;
            id++;

            DeliveryMan deliveryMan = new DeliveryMan(vehicleType, vehiclePlate, id, emailRegister, passwordRegister, typeUser, phoneNumber, name, document, status);
            deliveryMans.add(deliveryMan);

            JOptionPane.showMessageDialog(null,"REGISTRO EXITOSO DEL DELIVERY!!");
        }

        if (typeUser == 2)
        {
            String emailRegister = JOptionPane.showInputDialog("Ingrese el email a registrar");
            String passwordRegister = JOptionPane.showInputDialog("Ingrese la contraseña");

            String name = JOptionPane.showInputDialog("Ingrese su nombre");
            String phoneNumber = JOptionPane.showInputDialog("Ingrese su telefono");
            String address = JOptionPane.showInputDialog("Ingrese su direccion");

            id++;

            Client client = new Client(id, emailRegister, passwordRegister, typeUser, phoneNumber, name, address);
            clients.add(client);

            JOptionPane.showMessageDialog(null,"REGISTRO EXITOSO DEL CLIENTE!!");
        }
    }

    public void login()
    {
        int typeUser =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de usuario ( Delivery: 1 / Client: 2)"));

        if (typeUser == 1)
        {
            String emailLogin = JOptionPane.showInputDialog("Ingrese su email registrado ");
            String passwordLogin = JOptionPane.showInputDialog("Ingrese su contraseña");

            for (DeliveryMan account : this.deliveryMans)
            {
                if (account.getEmail().equalsIgnoreCase(emailLogin) && account.getPassword().equals(passwordLogin))
                {
                    JOptionPane.showMessageDialog(null,"Inicio de sesion exitoso");

                    interfaz(typeUser);
                    break;
                }
            }
        }
        else if (typeUser == 2)
        {
            String emailLogin = JOptionPane.showInputDialog("Ingrese su email registrado ");
            String passwordLogin = JOptionPane.showInputDialog("Ingrese su contraseña");

            for (Client account : this.clients)
            {
                if (account.getEmail().equalsIgnoreCase(emailLogin) && account.getPassword().equals(passwordLogin))
                {
                    JOptionPane.showMessageDialog(null,"Inicio de sesion exitoso");

                    interfaz(typeUser);
                    break;
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nombre de usuario o contraseña incorrectos.");
        }
    }

    public boolean logOut()
    {
        //False para cancelar ciclos de menus o interfaces
        JOptionPane.showMessageDialog(null, "Sesion cerrada correctamente");
        return false;

    }

    public void interfaz(int role)
    {
        if (role == 1)
        {
            JOptionPane.showMessageDialog(null,"Interfaz para clientes...");

            //Retorna un false para utilizar saber si se sigue mostrando el menu correspondiente o no, terminar un ciclo de la interfaz
            logOut();
        }
        else if (role == 2)
        {
            JOptionPane.showMessageDialog(null,"Interfaz para delivery...");

            //Retorna un false para utilizar saber si se sigue mostrando el menu correspondiente o no, terminar un ciclo de la interfaz
            logOut();

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error en el tipo de rol");
        }
    }
}
