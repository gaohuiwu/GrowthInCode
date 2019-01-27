package com.grow.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @Auther: ghw06
 * @Date: 2019/1/24
 * @Description:
 */
public class AESUtil {
    private static final String KEY_ALGORITHM = "AES";
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

    public AESUtil() {
    }

    private static byte[] initSecretKey(byte[] key) throws NoSuchAlgorithmException {
        KeyGenerator kg = null;

        try {
            kg = KeyGenerator.getInstance("AES");
        } catch (NoSuchAlgorithmException var4) {
            var4.printStackTrace();
            return new byte[0];
        }

        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        secureRandom.setSeed(key);
        kg.init(128, secureRandom);
        SecretKey secretKey = kg.generateKey();
        return secretKey.getEncoded();
    }

    private static Key toKey(byte[] key) {
        return new SecretKeySpec(key, "AES");
    }

    private static byte[] encrypt(byte[] data, byte[] key, String cipherAlgorithm) throws Exception {
        Key k = toKey(key);
        return encrypt(data, k, cipherAlgorithm);
    }

    private static byte[] encrypt(byte[] data, Key key, String cipherAlgorithm) throws Exception {
        Cipher cipher = Cipher.getInstance(cipherAlgorithm);
        cipher.init(1, key);
        return cipher.doFinal(data);
    }

    public static byte[] decrypt(byte[] data, byte[] key, String cipherAlgorithm) throws Exception {
        Key k = toKey(key);
        return decrypt(data, k, cipherAlgorithm);
    }

    private static byte[] decrypt(byte[] data, Key key, String cipherAlgorithm) throws Exception {
        Cipher cipher = Cipher.getInstance(cipherAlgorithm);
        cipher.init(2, key);
        return cipher.doFinal(data);
    }

    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        return encrypt(data, initSecretKey(key), "AES/ECB/PKCS5Padding");
    }

    public static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        return decrypt(data, initSecretKey(key), "AES/ECB/PKCS5Padding");
    }

    public static String encryptHex(String plaintext, String password) throws Exception {
        byte[] data = plaintext.getBytes(Constant.CHARSET);
        byte[] key = password.getBytes(Constant.CHARSET);
        byte[] cipher = encrypt(data, initSecretKey(key), "AES/ECB/PKCS5Padding");
        return DatatypeConverter.printHexBinary(cipher);
    }

    public static String decryptHex(String ciphertext, String password) throws Exception {
        byte[] data = DatatypeConverter.parseHexBinary(ciphertext);
        byte[] key = password.getBytes(Constant.CHARSET);
        byte[] plain = decrypt(data, initSecretKey(key), "AES/ECB/PKCS5Padding");
        return new String(plain, Constant.CHARSET);
    }
}
