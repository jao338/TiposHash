package com.mycompany.hash.Classes;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class SALT {
    public SALT(){
        
    }
     public String getSalt() throws NoSuchAlgorithmException, NoSuchProviderException {
    // A classe SecureRandom é usada para gerar números pseudo-aleatórios
    
    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");

    // Cria um array
    byte[] salt = new byte[16];

    // Gera um salt "aleatório"
    sr.nextBytes(salt);

    // retorna o salt
    return salt.toString();
    
    }
}

