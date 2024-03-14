import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AuthController
{
    private ArrayList<String> users;
    private ArrayList<String> passwords;
    private ArrayList<String> roles;
    private String currentUser;
    private String password;
    private String currentRole;

    public AuthController()
    {
        users = new ArrayList<>();
        passwords = new ArrayList<>();
        roles = new ArrayList<>();
        this.currentUser = null;
        this.currentRole = null;
    }

    public void register()
    {
        String emailRegister = JOptionPane.showInputDialog("Ingrese el email a registrar");
        String passwordRegister = JOptionPane.showInputDialog("Ingrese la contraseña");
        String rol = JOptionPane.showInputDialog("Ingrese su Rol 'Cliente' O 'Delivery' ");

        if (users.contains(emailRegister))
        {
            JOptionPane.showMessageDialog(null, "El usuario ya esta registrado");
        }
        else
        {
            users.add(emailRegister);
            passwords.add(passwordRegister);
            roles.add(rol);

            JOptionPane.showMessageDialog(null, "Registro exitoso!");
        }
    }

    public void login()
    {
        String emailLogin = JOptionPane.showInputDialog("Ingrese su email registrado ");
        String passwordLogin = JOptionPane.showInputDialog("Ingrese su contraseña");

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(emailLogin) && passwords.get(i).equals(passwordLogin))
            {
                currentUser = emailLogin;
                currentRole = roles.get(i);

                System.out.println("Inicio de sesión exitoso. Bienvenido, " + emailLogin + "!");

                interfaz();
                return;
            }
        }

        JOptionPane.showMessageDialog(null,"Email o Contraseña incorrecta!");

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
