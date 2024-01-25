package org.drugstore.Security;

import org.drugstore.Model.User;
import org.drugstore.Model.UserCurrent;

import java.util.ArrayList;
import java.util.List;

public class Authentication {
     UserCurrent userCurrent;
     User user;
     List<UserCurrent> userCurrentList = new ArrayList<>();
    private boolean createAuthentication (String Email, String Password) {
        if(Email != null && Email.equals(userCurrent.getEmailAdress())  ){
            return true;
        }
        return true;
    }
}
