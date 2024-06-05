package com.example.chuyenDoiDuLieu.Interface;

import org.springframework.stereotype.Service;

@Service
public interface ChuyenDoiDuLieu {
    String convertToString(Object duLieu);
    byte[] convertToByte(Object duLieu);
    String convertToHex(Object duLieu);
    String convertToBase64(Object duLieu);
}
