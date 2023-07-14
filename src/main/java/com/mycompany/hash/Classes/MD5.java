package com.mycompany.hash.Classes;

import java.security.MessageDigest;

public class MD5 {
    
    public MD5(){
        
    }
    
    public String MD5 (String hash, String salt){
        
        String resultado = null;
        
        try {
            
            // Cria uma instância MessageDigest para MD5
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
        
        return resultado;
    };
    
}
