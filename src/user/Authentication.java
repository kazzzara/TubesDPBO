/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author Girls
 */
public class Authentication extends User{
    
    public boolean validateAccount(User userId,String username,String password) {
        if (user.getUsername().equals(username)
            && user.getPassword().equals(password)) {
                    System.out.println("Login berhasil.");
                return true;
            }
        System.out.println("Username atau password salah.");
        return false;
    }
    
    public void displayLogin(){
        
    }
}
