package dk.svoldgaard.transportmanagementsystem.BLL;

import dk.svoldgaard.transportmanagementsystem.BE.Login;
import dk.svoldgaard.transportmanagementsystem.DLL.LoginDAO_DB;

public class LoginManager {

    private LoginDAO_DB loginDAO;

    public LoginManager() {
        loginDAO = new LoginDAO_DB ();
    }

}
