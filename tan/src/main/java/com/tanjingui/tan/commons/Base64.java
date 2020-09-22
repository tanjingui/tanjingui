package com.tanjingui.tan.commons;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/**
 * java8 base64 encode and decode
 */
public class Base64 {
    public static final String CODE = "utf-8";

    public static String encode(byte[] encodeContent) {
        return encodeContent == null ? null : java.util.Base64.getEncoder().encodeToString(encodeContent);
    }

    public static byte[] decode(byte[] decodeContent) {
        return decodeContent == null ? null : java.util.Base64.getDecoder().decode(decodeContent);
    }

    public static byte[] decode(String decodeContent) {
        return decodeContent == null ? null : java.util.Base64.getDecoder().decode(decodeContent);
    }

    public static String encode(String encodeContent) {
        try {
            return encodeContent == null ? null : java.util.Base64.getEncoder().encodeToString(encodeContent.getBytes(CODE));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String decodeReturnString(String decodeContent) {
        try {
            return decodeContent == null ? null : new String(java.util.Base64.getDecoder().decode(decodeContent), CODE);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String encode(String encodeContent, String code) {
        try {
            return encodeContent == null ? null : java.util.Base64.getEncoder().encodeToString(encodeContent.getBytes(code));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String decode(String decodeContent, String code) {
        try {
            return decodeContent == null ? null : new String(java.util.Base64.getDecoder().decode(decodeContent), code);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static ByteBuffer encode(ByteBuffer encodeContent) {
        return encodeContent == null ? null : java.util.Base64.getEncoder().encode(encodeContent);
    }

    public static ByteBuffer decode(ByteBuffer decodeContent) {
        return decodeContent == null ? null : java.util.Base64.getEncoder().encode(decodeContent);
    }


//        String encodeContent = "hello";
//        log.info(">>>>>加密前的明文{}", encodeContent);
//        String encode = encode(encodeContent);
//        log.info(">>>>>加密后的密文{}", encode);
//        String decodeContent = decodeReturnString(encode);
//        log.info(">>>>>>解密后的明文{}", decodeContent);
}

