package com.example.chuyenDoiDuLieu.Adapter;

import com.example.chuyenDoiDuLieu.Interface.ChuyenDoiDuLieu;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Base64DataAdapter implements ChuyenDoiDuLieu {
    @Override
    public String convertToString(Object duLieu) {
        String base64String = (String) duLieu;
        byte[] byteArray = Base64.getDecoder().decode(base64String);
        return new String(byteArray);
    }

    @Override
    public byte[] convertToByte(Object duLieu) {
        String base64String = duLieu.toString();
        return Base64.getDecoder().decode(base64String);
    }

    @Override
    public String convertToHex(Object duLieu) {
        String base64String = (String) duLieu;
        byte[] byteArray = Base64.getDecoder().decode(base64String);
        StringBuilder hex = new StringBuilder();
        for (byte b : byteArray) {
            hex.append(String.format("%02X", b));
        }
        return hex.toString();
    }

    @Override
    public String convertToBase64(Object duLieu) {
        return (String) duLieu;
    }
}
