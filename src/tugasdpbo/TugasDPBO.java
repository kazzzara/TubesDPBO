/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasdpbo;

import user.Admin;
import user.Authentication;

public class TugasDPBO {

    public static void main(String[] args) {

        Admin admin = new Admin(1,"admin01","12345");
        Authentication auth = new Authentication();

        auth.displayLogin();
        boolean status = auth.validateAccount(admin,"admin01","12345");

        if (status) {
            admin.login();
        }
    }
}
