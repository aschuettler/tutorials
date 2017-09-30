package com.javadevjournal.tutorials.corejava.java8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

/**
 * Created by umesh on 7/5/17.
 */
public class Base64EncoderExample {

    public static void main(String[] args) {

        String input = "Encoding Sample String";
        String urlEncodingString= "search?_base64";

        basicEncoder(input);
        urlEncoding(urlEncodingString);
        mimeEncoder();
    }

    private static void basicEncoder(final String input) {
        String simpleBase64 = Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
        System.out.println(simpleBase64);
        basicDecoder(simpleBase64);
    }

    private static void basicDecoder(final String encodedData) {
        byte[] decodeData = Base64.getDecoder().decode(encodedData);
        System.out.println(new String(decodeData, StandardCharsets.UTF_8));
    }

    private static void urlEncoding(final String input) {
        String urlEncode= Base64.getUrlEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
        System.out.println("Encoding using URL Encoder "+urlEncode);
        urlDecoding(urlEncode);
    }

    private static void urlDecoding(final String encodedData) {
        byte[] decodeData = Base64.getUrlDecoder().decode(encodedData);
        System.out.println(new String(decodeData, StandardCharsets.UTF_8));
    }

    private static void mimeEncoder(){
        StringBuilder stringBuffer = new StringBuilder();
        for (int t = 0; t < 10; ++t) {
            stringBuffer.append(UUID.randomUUID().toString());
        }

        String mimeEncoding = Base64.getMimeEncoder().
                              encodeToString(stringBuffer.toString().getBytes(StandardCharsets.UTF_8));

        System.out.println("MIME Encoding is:: " +mimeEncoding);
        mimeDecoder(mimeEncoding);
    }

    private static void mimeDecoder(final String encodedData){

        byte[] decodeData = Base64.getMimeDecoder().decode(encodedData);
        System.out.println(new String(decodeData, StandardCharsets.UTF_8));
    }
}
