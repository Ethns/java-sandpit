package org.ethan.java.simplemvn;

import java.util.Base64;

public class VSCodeRunJava {
    public static void main(String[] args) {
        System.out.println("get started");
        String rawStr = "username:pwd123";
        String encodedStr = Base64.getEncoder().encodeToString(rawStr.getBytes());
        System.out.println(encodedStr);
        byte[] decodeStr = Base64.getDecoder().decode(encodedStr);
        System.out.println(new String(decodeStr));
        System.out.println("The end");
    }
}