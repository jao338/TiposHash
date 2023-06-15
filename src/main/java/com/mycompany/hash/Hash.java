package com.mycompany.hash;

import java.util.Scanner;

public class Hash {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String tipo;
        String senha;
        
        System.out.println("Opções: [SHA] [MD5] [PBKDF2] [BCRYPT] [SCRYPT]\n\nDigite um tipo de hash code: ");
        tipo = scan.next();
        
        System.out.println("Digite uma senha: ");
        senha = scan.next();
        
        if(tipo.equalsIgnoreCase("MD5")){
            
            MD5 obj = new MD5();
            
            System.out.println("\nA senha original é " + senha + "\nA senha com MD5 é " + obj.Hash(senha));
            
        } else if (tipo.equalsIgnoreCase("SHA")){
            
        }
        
        
    }
}
