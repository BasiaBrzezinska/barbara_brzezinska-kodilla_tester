package com.kodilla.parametrized_tests.homework;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUserName (String username){
        if (null != username) {
            return username.matches("^[a-zA-Z0-9._-]{3,}$");
        }
        return false;
    }

    public boolean validateEmail (String email) {
        if (null != email) {
            String regex =  "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}
