package org.drugstore;


import lombok.AllArgsConstructor;
import org.drugstore.DAO.UserDAO;
import org.drugstore.Model.User;
import org.drugstore.Security.Registration;

@AllArgsConstructor
public class Main {

    public static void main(String[] args) {

        UI dialog = new UI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
        Registration registration = new Registration();
        registration.CreateUser("Smith", "Andriah", "Smith@gmail.com", "haha");
    }
}