package com.mycompany.hash.Classes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class MD5 {
    
    public MD5(){
        
    }
    
    public String Hash (String hash, String salt){
        
        String resultado = null;
        
        try {
            
            // Criar uma instância MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Essa classe permite criar e manipular dados de Strings
            StringBuilder sb = new StringBuilder();
            
            
            // Adiciona os bytes do salt
            md.update(salt.getBytes());

            //Pega os bytes do hash
            byte[] bytes =  md.digest(hash.getBytes());
           

            //Estes bytes estão em formato decimal, converta para hexadecimal
            for (int i = 0; i < bytes.length; i++) {
              sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            // Converte os bytes para uma string
            resultado = sb.toString();
            
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
        // Retorna a variável "resultado"
        return resultado;
    };
    
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
