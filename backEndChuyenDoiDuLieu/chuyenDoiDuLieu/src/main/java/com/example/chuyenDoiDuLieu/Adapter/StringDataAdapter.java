package com.example.chuyenDoiDuLieu.Adapter;

import com.example.chuyenDoiDuLieu.Interface.ChuyenDoiDuLieu;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class StringDataAdapter implements ChuyenDoiDuLieu {
    @Override
    public String convertToString(Object duLieu) {
        return duLieu.toString();
    }

    @Override
    public byte[] convertToByte(Object duLieu) {
        return duLieu.toString().getBytes();
    }

    @Override
    public String convertToHex(Object duLieu) {
        byte[] bytes = convertToByte(duLieu);
        StringBuilder hex = new StringBuilder();
        for(byte b : bytes){
            hex.append(String.format("%02X", b));
        }
        return hex.toString();
    }

    @Override
    public String convertToBase64(Object duLieu) {
        byte[] bytes = duLieu.toString().getBytes();
        return Base64.getEncoder().encodeToString(bytes);
    }
}
