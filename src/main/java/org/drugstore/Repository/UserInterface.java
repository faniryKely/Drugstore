package org.drugstore.Repository;

import org.drugstore.Model.User;

public interface UserInterface   {
    User MakeRegistration(User user);
    Boolean findByEmail(String email);

}
