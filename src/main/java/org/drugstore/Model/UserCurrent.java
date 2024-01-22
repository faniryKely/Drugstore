package org.drugstore.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserCurrent {
    private int Id;
    private String EmailAdress;
    private String Password;
}
