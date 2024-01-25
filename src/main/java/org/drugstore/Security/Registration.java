package org.drugstore.Security;

import lombok.AllArgsConstructor;
import org.drugstore.Model.User;
import org.drugstore.DAO.UserDAO;

public class Registration {
    private final UserDAO userDAO = new UserDAO();

    public String CreateUser(String name, String firstName, String email, String password) {
          String error =  null;
          String accepted = null;

                if(userDAO.findByEmail(email)) {
                    error = "Email already used";
                    return error;
                } else {
                    userDAO.MakeRegistration(new User( name, firstName, email, password));
                    accepted = "Created successfully";
                    return accepted;
                }
    }
}
