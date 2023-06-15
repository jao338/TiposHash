package com.mycompany.hash;

import java.security.MessageDigest;

public class MD5 {
    
    public MD5(){
        
    }
    
    public String Hash (String hash){
        
        String resultado = null;
        
        try {
            
            // Criar uma instância MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Essa classe permite criar e manipular dados de Strings
            StringBuilder sb = new StringBuilder();
            
            
            // Adiciona os bytes da senha
            md.update(hash.getBytes());

            //Pega os bytes do hash
            byte[] bytes = md.digest();

            //Estes bytes estão em formato decimal, converta em hexadecimal
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
}
