package com.mycompany.hash.Classes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA {
    public SHA(){
        
    }
    
    public String SHA_1(String hash, String salt){
        
        String resposta = null;
        
        try {
            // Cria uma instância MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            
            // Essa classe permite criar e manipular dados de Strings
            StringBuilder sb = new StringBuilder();
            
            // Adiciona os bytes do salt
            md.update(salt.getBytes());
            
            //Pega os bytes do hash
            byte[] bytes = md.digest(hash.getBytes());
            
            //Estes bytes estão em formato decimal, converta para hexadecimal
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            // Converte os bytes para uma string
            resposta = sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return resposta;
    
    }
    
    public String SHA_256(String hash, String salt){
        
        String resposta = null;
        
        try {
            // Cria uma instância MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            // Essa classe permite criar e manipular dados de Strings
            StringBuilder sb = new StringBuilder();
            
            // Adiciona os bytes do salt
            md.update(salt.getBytes());
            
            //Pega os bytes do hash
            byte[] bytes = md.digest(hash.getBytes());
            
            //Estes bytes estão em formato decimal, converta para hexadecimal
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            // Converte os bytes para uma string
            resposta = sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return resposta;
    
    }
    
    public String SHA_384(String hash, String salt){
        
        String resposta = null;
        
        try {
            // Cria uma instância MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("SHA-384");
            
            // Essa classe permite criar e manipular dados de Strings
            StringBuilder sb = new StringBuilder();
            
            // Adiciona os bytes do salt
            md.update(salt.getBytes());
            
            //Pega os bytes do hash
            byte[] bytes = md.digest(hash.getBytes());
            
            //Estes bytes estão em formato decimal, converta para hexadecimal
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            // Converte os bytes para uma string
            resposta = sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return resposta;
    
    }
    
    public String SHA_512(String hash, String salt){
        
        String resposta = null;
        
        try {
            // Cria uma instância MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            
            // Essa classe permite criar e manipular dados de Strings
            StringBuilder sb = new StringBuilder();
            
            // Adiciona os bytes do salt
            md.update(salt.getBytes());
            
            //Pega os bytes do hash
            byte[] bytes = md.digest(hash.getBytes());
            
            //Estes bytes estão em formato decimal, converta para hexadecimal
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            // Converte os bytes para uma string
            resposta = sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return resposta;
    
    }
}
