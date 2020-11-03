package com.demo.util;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@Component
public class shortUrlUtil {
    public String[] shortUrl(String url) {
        String[] chars = new String[]{
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A",
                "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z"
        };
        String key = "test";
        String sMd5EncryptResult = CMyEncrypt(key+url);
        String[] resUrl = new String[4];
        for (int i = 0; i < resUrl.length; i++) {
            String sTempSubString = sMd5EncryptResult.substring(i * 8, i * 8 + 8);
            long HexLong = 0x3FFFFFFF & Long.parseLong(sTempSubString, 16);
            String outchars = "";
            for (int j = 0; j < 6; j++) {
                long index = 0x0000003D & HexLong;
                outchars = outchars + chars[(int) index];
                HexLong = HexLong >> 5;
            }
            resUrl[i] = outchars;
        }
        return resUrl;
    }

    public String CMyEncrypt (String input){
           return encodeByMD5(input);
    }

    public String encodeByMD5(String input){
        if ( input != null) {
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                byte[] results = md5.digest(input.getBytes());
                String result = byteArrayToHexString(results);
                return result;
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
            return null;
    }

    public String byteArrayToHexString(byte[] b){
        StringBuffer result = new StringBuffer();
        for (int i=0;i<b.length;i++){
            result.append(byteToHexString(b[i]));
        }
        return result.toString();
    }

    public String byteToHexString(byte b){
        String[] hexDigitals = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"
        };
        int n = b;
        if (n < 0){
            n = 256+n;
        }
        int d1 = n/16;
        int d2 = n%16;
        return hexDigitals[d1]+hexDigitals[d2];
    }
}
