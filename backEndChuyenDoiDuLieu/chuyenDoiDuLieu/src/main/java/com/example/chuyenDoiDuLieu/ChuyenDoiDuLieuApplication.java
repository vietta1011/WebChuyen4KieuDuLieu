package com.example.chuyenDoiDuLieu;

import com.example.chuyenDoiDuLieu.Adapter.Base64DataAdapter;
import com.example.chuyenDoiDuLieu.Adapter.ByteDataAdapter;
import com.example.chuyenDoiDuLieu.Adapter.HexDataAdapter;
import com.example.chuyenDoiDuLieu.Adapter.StringDataAdapter;
import com.example.chuyenDoiDuLieu.Controller.DuLieuController;
import com.example.chuyenDoiDuLieu.Interface.ChuyenDoiDuLieu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ChuyenDoiDuLieuApplication {

	public static void main(String[] args) {
		String input = "IT5k62";
		String hex = "56696574313031312E";
		byte[] byteAray = {86, 105, 101, 116, 49, 48, 49, 49, 46};
		String base64 = "VmlldDEwMTEu";

		ChuyenDoiDuLieu hexAdapter = new HexDataAdapter();
		ChuyenDoiDuLieu stringAdapter = new StringDataAdapter();
		ChuyenDoiDuLieu byteAdapter = new ByteDataAdapter();
		ChuyenDoiDuLieu baseAdapter = new Base64DataAdapter();

		// Chuyển từ Base sang các dữ liệu còn lại
		String stringDataFromBase = baseAdapter.convertToString(base64);
		byte[] byteDataFromBase = baseAdapter.convertToByte(base64);
		String hexDataFromBase = baseAdapter.convertToHex(base64);
		String baseDataFromBase = baseAdapter.convertToBase64(base64);

		System.out.println("Chuyển từ Base");
		System.out.println("String: " + stringDataFromBase);
		System.out.println("Byte: " + Arrays.toString(byteDataFromBase));
		System.out.println("Hex: " + hexDataFromBase);
		System.out.println("Base64: " + baseDataFromBase);
		System.out.println();

		// Chuyền từ Byte sang các dữ liệu còn lại
		String stringDataFromByte = byteAdapter.convertToString(byteAray);
		byte[] byteDataFromByte = byteAdapter.convertToByte(byteAray);
		String hexDataFromByte = byteAdapter.convertToHex(byteAray);
		String baseDataFromByte = byteAdapter.convertToBase64(byteAray);

		System.out.println("Chuyển từ Byte");
		System.out.println("String: " + stringDataFromByte);
		System.out.println("Byte: " + Arrays.toString(byteDataFromByte));
		System.out.println("Hex: " + hexDataFromByte);
		System.out.println("Base64: " + baseDataFromByte);
		System.out.println();

		// Chuyển từ Hex sang các dữ liệu còn lại
		String stringDataFromHex = hexAdapter.convertToString(hex);
		byte[] byteDataFromHex = hexAdapter.convertToByte(hex);
		String hexDataFromHex = hexAdapter.convertToHex(hex);
		String baseDataFromHex = hexAdapter.convertToBase64(hex);

		System.out.println("Chuyển từ Hex");
		System.out.println("String: " + stringDataFromHex);
		System.out.println("Byte: " + Arrays.toString(byteDataFromHex));
		System.out.println("Hex: " + hexDataFromHex);
		System.out.println("Base64: " + baseDataFromHex);
		System.out.println();

		// Chuyển từ String sang các dữ liệu còn lại
		String stringData = stringAdapter.convertToString(input);
		byte[] byteData = stringAdapter.convertToByte(input);
		String hexData = stringAdapter.convertToHex(input);
		String baseData = stringAdapter.convertToBase64(input);

		System.out.println("Chuyển từ String");
		System.out.println("String: " + stringData);
		System.out.println("Byte: " + Arrays.toString(byteData));
		System.out.println("Hex: " + hexData);
		System.out.println("Base64: " + baseData);


		SpringApplication.run(ChuyenDoiDuLieuApplication.class, args);
	}

}
