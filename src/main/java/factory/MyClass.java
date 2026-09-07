package factory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s = sc.nextLine();
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] bt = s.getBytes();
        byte[] pass = md.digest(bt);
        System.out.println(pass);
    }
}
