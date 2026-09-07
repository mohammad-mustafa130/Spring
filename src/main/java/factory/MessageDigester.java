package factory;

import java.security.MessageDigest;

public class MessageDigester {
    private MessageDigest digest1;
    private MessageDigest digest2;
    public void setDigest1(MessageDigest digest1) {
        this.digest1 = digest1;
    }
    public void setDigest2(MessageDigest digest2) {
        this.digest2 = digest2;
    }
    public void digest(String msg) {
        digest(msg, digest1);
        digest(msg, digest2);
    }
    private void digest(String msg, MessageDigest digest) {
        digest.reset();
        byte[] bytes = msg.getBytes();
        byte[] out = digest.digest(bytes);

        System.out.println("Original String: ");
        for(int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println();
        System.out.println("Encrypted String: ");
        for(int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
        System.out.println();
    }
}
