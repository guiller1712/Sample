/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.loginModel;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author guill
 */
public class Authentication {
     private final ArrayList<User> userList;
    
    /**
     * Constructor de clase
     */
    public Authentication(){
        this.userList = new ArrayList<>();
        userList.add(new User("demo","demo","Pierre Nodoyuna"));
        userList.add(new User("zacarias","123456","Zacarias Flores de la Plaza"));
        userList.add(new User("jc mouse","123456","JC Mouse Bolivia"));
    }
    
    /**
     * Autenticacion de usuario
     * @param user usuario
     * @param pass palabra secreta de usuario
     * @return boolean
     */
    public boolean userExists(String user, String pass){        
        return userList.stream().filter((p) -> (user.equals(p.getNick()))).anyMatch((p) -> (pass.equals(p.getPass())));
    }
    
    /**
     * Obtiene un Usuario segun parametros de entrada
     * @param user usuario
     * @param pass palabra secreta de usuario
     * @return User
     */
    public Optional<User> getUser(String user, String pass){            
       return userList.stream().filter(u -> u.getNick().equals(user) ).filter(u -> u.getPass().equals(pass)).findFirst();        
    }
}
