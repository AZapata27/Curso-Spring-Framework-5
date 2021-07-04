package com.example.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {

    public static void main(String[] args) {

        var password = "123";
        System.out.println("pasword encriptado: " + encriptarPassword(password));

    }

    public static String encriptarPassword(String password) {


        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);

    }

}
