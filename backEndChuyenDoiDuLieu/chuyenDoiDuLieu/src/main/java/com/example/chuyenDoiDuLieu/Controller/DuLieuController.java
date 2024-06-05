package com.example.chuyenDoiDuLieu.Controller;

import com.example.chuyenDoiDuLieu.Interface.ChuyenDoiDuLieu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DuLieuController {
    @Autowired
    private ChuyenDoiDuLieu base64DataAdapter;

    @Autowired
    private ChuyenDoiDuLieu hexDataAdapter;

    @Autowired
    private ChuyenDoiDuLieu stringDataAdapter;

    @Autowired
    private ChuyenDoiDuLieu byteDataAdapter;

    @PostMapping("/base64-to-string")
    public ResponseEntity<?> convertBase64ToString(@RequestBody String base64Data) {
        String stringResult = base64DataAdapter.convertToString(base64Data);
        Map<String, String> map = new HashMap<>();
        map.put("string", stringResult);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/base64-to-byte")
    public ResponseEntity<?> convertBase64ToByte(@RequestBody String base64Data) {
        byte[] byteResult = base64DataAdapter.convertToByte(base64Data);
        Map<String, String> map = new HashMap<>();
        map.put("byte", Arrays.toString(byteResult));
        return ResponseEntity.ok(map);
    }

    @PostMapping("/base64-to-hex")
    public ResponseEntity<?> convertBase64ToHex(@RequestBody String base64Data) {
        String hexResult = base64DataAdapter.convertToHex(base64Data);
        Map<String,String> map = new HashMap<>();
        map.put("hex", hexResult);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/hex-to-string")
    public ResponseEntity<?> convertHexToString(@RequestBody String hexData) {
        String stringResult = hexDataAdapter.convertToString(hexData);
        Map<String, String> map = new HashMap<>();
        map.put("string", stringResult);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/hex-to-byte")
    public ResponseEntity<?> convertHexToByte(@RequestBody String hexData) {
        byte[] byteResult = hexDataAdapter.convertToByte(hexData);
        Map<String, String> map = new HashMap<>();
        map.put("byte", Arrays.toString(byteResult));
        return ResponseEntity.ok(map);
    }

    @PostMapping("/hex-to-base64")
    public ResponseEntity<?> convertHexToBase64(@RequestBody String hexData) {
        String baseResult = hexDataAdapter.convertToBase64(hexData);
        Map<String,String> map = new HashMap<>();
        map.put("base64", baseResult);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/string-to-byte")
    public ResponseEntity<?> convertStringToByte(@RequestBody String strData) {
        byte[] byteResult = stringDataAdapter.convertToByte(strData);
        Map<String, String> map = new HashMap<>();
        map.put("byte", Arrays.toString(byteResult));
        return ResponseEntity.ok(map);
    }

    @PostMapping("/string-to-hex")
    public ResponseEntity<?> convertStringToHex(@RequestBody String strData) {
        String hexResult = stringDataAdapter.convertToHex(strData);
        Map<String, String> map = new HashMap<>();
        map.put("hex", hexResult);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/string-to-base64")
    public ResponseEntity<?> convertStringToBase64(@RequestBody String strData) {
        String baseResult = stringDataAdapter.convertToBase64(strData);
        Map<String,String> map = new HashMap<>();
        map.put("base64", baseResult);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/byte-to-string")
    public ResponseEntity<?> convertByteToString(@RequestBody String byteData) {
        String[] stringResult = byteData.split(",");
        byte[] byteArray = new byte[stringResult.length];
        for (int i = 0; i < stringResult.length; i++) {
            byteArray[i] = Byte.parseByte(stringResult[i].trim());
        }
        String result = byteDataAdapter.convertToString(byteArray);
        Map<String,String> map = new HashMap<>();
        map.put("string", result);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/byte-to-hex")
    public ResponseEntity<?> convertByteToHex(@RequestBody String byteData) {
        String[] hexResult = byteData.split(",");
        byte[] byteArray = new byte[hexResult.length];
        for (int i = 0; i < hexResult.length; i++) {
            byteArray[i] = Byte.parseByte(hexResult[i].trim());
        }
        String result = byteDataAdapter.convertToHex(byteArray);
        Map<String,String> map = new HashMap<>();
        map.put("hex", result);
        return ResponseEntity.ok(map);
    }

    @PostMapping("/byte-to-base64")
    public ResponseEntity<?> convertByteToBase64(@RequestBody String byteData) {
        String[] baseResult = byteData.split(",");
        byte[] byteArray = new byte[baseResult.length];
        for (int i = 0; i < baseResult.length; i++) {
            byteArray[i] = Byte.parseByte(baseResult[i].trim());
        }
        String result = byteDataAdapter.convertToBase64(byteArray);
        Map<String,String> map = new HashMap<>();
        map.put("base64", result);
        return ResponseEntity.ok(map);
    }
}
