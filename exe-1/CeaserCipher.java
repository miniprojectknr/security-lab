//Import Package
import java.util.Scanner;

//Class - ceaserCipher

class CeaserCipher
{
    

//Method encode
public static String encode(String enc, int offset) {
 offset = offset % 26 + 26;
 StringBuilder encoded = new StringBuilder();
 for (char i : enc.toCharArray()) {
 if (Character.isLetter(i)) {
 if (Character.isUpperCase(i)) {
 encoded.append((char) ('A' + (i - 'A' + offset) % 26));
 } else {
 encoded.append((char) ('a' + (i - 'a' + offset) % 26));
 }
 } else {
 encoded.append(i);
 }
 }
 return encoded.toString();
 }





 //Method decode
 public static String decode(String enc, int offset) {
 return encode(enc, 26 - offset);
 }

 
 
 
 //Method main
 public static void main(String[] args) throws java.lang.Exception {
 System.out.println("Enter a message to Encrypt :");
 Scanner sc = new Scanner(System.in);
 String msg = sc.nextLine();
 System.out.println("Enter a Key :");
 int key = sc.nextInt();
 System.out.println("Simulating Ceasar Cipher\n------------------------");
 System.out.println("Input : " + msg);
 System.out.printf("Encrypted Message : ");
 System.out.println(CeaserCipher.encode(msg, key));
 System.out.printf("Decrypted Message : ");
 System.out.println(CeaserCipher.decode(CeaserCipher.encode(msg, key), key));
 }





}