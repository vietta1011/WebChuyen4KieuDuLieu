package com.example.chuyenDoiDuLieu.Adapter;

import com.example.chuyenDoiDuLieu.Interface.ChuyenDoiDuLieu;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class ByteDataAdapter implements ChuyenDoiDuLieu {
    @Override
    public String convertToString(Object duLieu) {
        String byteString = new String((byte[]) duLieu, StandardCharsets.UTF_8);
        return byteString;
    }

    @Override
    public byte[] convertToByte(Object duLieu) {
        return (byte[]) duLieu;
    }

    @Override
    public String convertToHex(Object duLieu) {
        byte[] byteArray = (byte[]) duLieu;
        StringBuilder hex = new StringBuilder();
        for (byte b : byteArray) {
            hex.append(String.format("%02X", b));
        }
        return hex.toString();
    }

    @Override
    public String convertToBase64(Object duLieu) {
        byte[] byteArray = (byte[]) duLieu;
        return Base64.getEncoder().encodeToString(byteArray);
    }
}
