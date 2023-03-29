/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aes;


import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;


//AES Encryption Standart
public class AES {

   private static SecretKeySpec  secretkey; //instanciation de la clé secrete
   private static byte[] key; //instanciation d'une clé
   
   //setkey
   public static void setkey(String mykey) throws UnsupportedEncodingException{ //instanciation de la fonction qui lis la clé avec une eception si erreur
      try {
       key = mykey.getBytes("UTF-8");
       
       MessageDigest sha = MessageDigest.getInstance("SHA-1");
       key = sha.digest(key);
       key = Arrays.copyOf(key, 16);
       secretkey = new SecretKeySpec(key, "AES");
       
      } 
      catch (NoSuchAlgorithmException e){}
      catch(UnsupportedEncodingException e){}
   }
   
   //descryption
   public static String encrypt(String strToEnc, String sec){ //instanciation de la fonction qui permet de crypter le message
      try{
          setkey(sec);
          Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
          cipher.init(Cipher.ENCRYPT_MODE, secretkey);
          return Base64.getEncoder().encodeToString(cipher.doFinal(strToEnc.getBytes("UTF-8")));
          
      }
      catch(Exception e){
      }
      return null;
   }
   //encryption
   public static String decrypt(String strToDec, String sec){ //instanciation de la fonction qui permet de crypter le message
      try{
          setkey(sec);
          Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
          cipher.init(Cipher.DECRYPT_MODE, secretkey);
          return new String(cipher.doFinal(Base64.getDecoder().decode(strToDec)));
          
      }
      catch(Exception e){
      }
      return null;
   }
   
    
}
