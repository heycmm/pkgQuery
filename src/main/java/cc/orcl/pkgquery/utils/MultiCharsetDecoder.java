package cc.orcl.pkgquery.utils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class MultiCharsetDecoder {
    public static String decode(String input) {
        try {
            byte[] s1 = input.getBytes(StandardCharsets.ISO_8859_1);
            byte[] s2 = input.getBytes("windows-1252");
            byte[] s3 = new byte[s1.length];
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] == '?') {
                    s3[i] = s2[i];
                } else {
                    s3[i] = s1[i];
                }
            }
            return new String(s3, StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            return input;
        }
    }
}
