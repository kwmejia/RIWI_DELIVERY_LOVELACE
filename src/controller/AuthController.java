package controller;

import entities.Account;

import javax.swing.*;
import java.util.ArrayList;

public class AuthController {
    private ArrayList<Account> accountList;

    public AuthController() {
        this.accountList = new ArrayList<>();
    }

    public Account logIn() {
        String userName = JOptionPane.showInputDialog("Your User Name: ");
        String password = JOptionPane.showInputDialog("Your Password: ");

        Account objAccount = null;
        String message = "";

        for (Account validation : this.accountList) {
            if (validation.getEmail().equalsIgnoreCase(userName)) {
                if (validation.getPassword().equalsIgnoreCase(password)) {
                    objAccount = validation;
                    message = "Login Successfully";
                } else {
                    message = "Invalid Password";
                }
                break;
            } else {
                message = "User not found";
            }
        }
        JOptionPane.showMessageDialog(null, message);
        return objAccount;
    }
}
