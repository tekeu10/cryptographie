/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.io.IOException;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.io.InputStreamReader;

 
/**
 *
 * @author tekeu
 */
public class Symetriques {
    public static void main(String[] args) throws IOException {
 
    
        BigInteger p, q, n, phi,e, d, mes, chif, dechi;
        SecureRandom random = new SecureRandom();
        
        p = BigInteger.probablePrime(1024, random);
        q = BigInteger.probablePrime(1024, random);
        n = p.multiply(q);
        phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        
        
        do
        {
            e = BigInteger.probablePrime(32, random);
            
        } while(e.gcd(phi).intValue() !=1);
        
        d = e.modInverse(phi);
        BufferedReader message = new BufferedReader(new InputStreamReader(System.in) );
        System.out.println("veillez saisi le message a chiffrer :");
        String plainText = message.readLine();
        byte[] plainTextByte = plainText.getBytes();
        mes = new BigInteger(plainTextByte);
        
        chif = mes.modPow(e, n);
        dechi = chif.modPow(d, n);
        
        byte[] dechiByte = dechi.toByteArray();
        String dechiString = new  String(dechiByte);
        
        System.out.println("p ="+p);
        System.out.println("q ="+q);
        System.out.println("e ="+e);
        System.out.println("d ="+d);
        System.out.println("message claire en chaine de caractere = "+plainText);
        System.out.println("message claire en entier = "+mes);
        System.out.println("message claire en chaine de caractere = "+new String(chif.toByteArray()));
        System.out.println("message chiffré en entier  = "+chif);
        System.out.println("message dechiffré en entier = "+dechi);
        System.out.println("message dechiffré en chaine de caractere = "+dechiString);
    }
}
