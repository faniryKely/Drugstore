package org.drugstore.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class User {
    private int Id;
    private String Name;
    private String Firstname;
    private String Email;
    private String Password;

    public User(String name, String firstname, String email, String password) {
        Name = name;
        Firstname = firstname;
        Email = email;
        Password = password;
    }
}
