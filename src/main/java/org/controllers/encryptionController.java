package org.controllers;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.aead.AeadFactory;
import com.google.crypto.tink.aead.AeadKeyTemplates;
import com.google.crypto.tink.config.TinkConfig;
import org.getUserInput;

import java.security.GeneralSecurityException;


//This is the introduction of the encryption controller, the point of this controller is to take in sensitive objects (mostly user credentials) and encrypt them. Current implementation is to take in the credentials from user inputs, but it is going to later take it in from a JSON file sent through the API.
//The method of encryption will be handled through the Google Tink repo on github
public class encryptionController {
    public static void main(String[] args) throws GeneralSecurityException {

        AeadConfig.register();

        KeysetHandle keysetHandle = KeysetHandle.generateNew(AeadKeyTemplates.AES256_GCM);
        Aead aead = AeadFactory.getPrimitive(keysetHandle);

        String test2 = getUserInput.getInputs();
        String aad = "okay";

        // Encryption
        byte[] ciphertext = aead.encrypt(test2.getBytes(), aad.getBytes());

        // Encryption
        //byte[] ciphertext = aead.encrypt(plainText.getBytes(), aad.getBytes());

        String test = "" + ciphertext;

        System.out.println(test2);
        System.out.printf(test);


        // Decryption
        byte[] decrypted = aead.decrypt(ciphertext, aad.getBytes());

    }
}
