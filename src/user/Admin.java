/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package user;

import matkul.Material;

public class Admin extends User {

    public Admin(int userId, String username, String password) {
        super(userId, username, password);
    }

    public void manageCourses() {
        System.out.println("Admin mengelola course.");
    }

    public void assignTier() {
        System.out.println("Admin menentukan tier akses.");
    }

    public void validateSubmission(Material material) {
        material.setStatus("Validated");
        System.out.println("Material " + material.getTitle() + " berhasil divalidasi.");
    }

    public void publishMaterial(Material material) {
        material.setStatus("Published");
        System.out.println("Material "+ material.getTitle() + " berhasil dipublish.");
    }
}
