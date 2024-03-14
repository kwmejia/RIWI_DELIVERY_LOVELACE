import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AuthController
{
    private ArrayList<Account> users;
    private ArrayList<String> passwords;
    private String currentUser;
    private String currentRole;

    public AuthController()
    {
        users = new ArrayList<>();
        passwords = new ArrayList<>();
        this.currentUser = null;
        this.currentRole = null;
    }

    public void register()
    {
        String emailRegister = JOptionPane.showInputDialog("Ingrese el email a registrar");
        String passwordRegister = JOptionPane.showInputDialog("Ingrese la contraseña");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu identificacion"));

        Account newAccount = new Account(emailRegister, passwordRegister, id);

        if (users.contains(newAccount))
        {
            JOptionPane.showMessageDialog("El usuario ya existe. Por favor, intente con otro nombre de usuario.");
        }
        else
        {
            users.add(newAccount);
            JOptionPane.showMessageDialog("Registro exitoso.");
        }
    }

    public void login()
    {
        String emailLogin = JOptionPane.showInputDialog("Ingrese su email registrado ");
        String passwordLogin = JOptionPane.showInputDialog("Ingrese su contraseña");

        Account user = null;
        for (Account account : this.users)
        {
            if (account.getEmail().equalsIgnoreCase(emailLogin) && account.getPassword().equals(passwordLogin))
            {
                user = account;
                break;
            }
        }

        if (user != null)
        {
            currentUser = user.getEmail();
            currentRole = user.getRole();
            JOptionPane.showMessageDialog("Inicio de sesión exitoso. Bienvenido, " + currentUser + "!");

            interfaz();
        }
        else
        {
            JOptionPane.showMessageDialog("Nombre de usuario o contraseña incorrectos.");
        }
    }

    public void logOut()
    {
        currentUser = null;
        currentRole = null;
        JOptionPane.showMessageDialog(null,"Sesion cerrada correctamente");
    }

    public void interfaz()
    {
        if (currentRole.equalsIgnoreCase("cliente"))
        {
             JOptionPane.showMessageDialog(null,"Interfaz para clientes");
        }
        else if (currentRole.equalsIgnoreCase("delivery"))
        {
             JOptionPane.showMessageDialog(null,"Interfaz para delivery...");
        }
    }
}
