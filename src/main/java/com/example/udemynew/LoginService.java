package com.example.udemynew;


import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userid, String password) {
        return (userid.equalsIgnoreCase("Sumi") || userid.equalsIgnoreCase("in28minutes"))
        && password.equalsIgnoreCase("idk");

    }
}
