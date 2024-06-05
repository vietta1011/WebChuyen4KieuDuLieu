package com.example.chuyenDoiDuLieu.Adapter;

import com.example.chuyenDoiDuLieu.Interface.ChuyenDoiDuLieu;
import org.springframework.stereotype.Component;

import java.util.Base64;

import static ch.qos.logback.core.encoder.ByteArrayUtil.hexStringToByteArray;

@Component
public class HexDataAdapter implements ChuyenDoiDuLieu {
    @Override
    public String convertToString(Object duLieu) {
        String hexString = duLieu.toString();
        byte[] byteArray = hexStringToByteArray(hexString);
        return new String(byteArray);
    }

    @Override
    public byte[] convertToByte(Object duLieu) {
        if(duLieu.toString().length() % 2 != 0){
            throw new IllegalArgumentException("Độ dài của chuỗi hex phải là số chẵn");
        }
        String hexString = duLieu.toString();
        return hexStringToByteArray(hexString);
    }

    @Override
    public String convertToHex(Object duLieu) {
        return duLieu.toString();
    }

    @Override
    public String convertToBase64(Object duLieu) {
        String hexString = (String) duLieu;
        byte[] byteArray = hexStringToByteArray(hexString);
        return Base64.getEncoder().encodeToString(byteArray);
    }
}
