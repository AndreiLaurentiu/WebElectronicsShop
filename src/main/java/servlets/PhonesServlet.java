package servlets;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Phone;
import services.ServicePhones;

@WebServlet("/Phones")
public class PhonesServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Phone phone2 = new Phone("APPLE IPHONE 6S 64GB", "Apple", 0.143f, "138.3 x 67.1 x 7.1 mm", "black", 800, "A9 chip with 64-bit architecture", "-", 
			"64GB", "2GB", "Touchscreen Capacitiv", 4.7f, "Wi Fi", "4.2, A2DP, LE", "Lightning connector 3.5 mm jack", "Speaker", "primary camera resolution 12", "Li-Po 1715 mAh battery (6.9 Wh), fixed", "iOS 9", "no", "no", "with 3G",
					"with 4G", "yes", "802.11 a/b/g/n/ac, dual-band, hotspot", "-", "750 x 1334 pixels (~326 ppi pixel density)", "without card", "Accelerometer, gyro, proximity, compass, barometer", "https://s13emagst.akamaized.net/products/768/767679/images/res_270341e48ea3228fecf033d5d60ef492.jpg");
	
	Phone phone1 = new Phone("APPLE IPHONE 6S 64GB", "Apple", 0.143f, "138.3 x 67.1 x 7.1 mm", "black", 800, "A9 chip with 64-bit architecture", "-", 
			"64GB", "2GB", "Touchscreen Capacitiv", 4.7f, "Wi Fi", "4.2, A2DP, LE", "Lightning connector 3.5 mm jack", "Speaker", "primary camera resolution 12", "Li-Po 1715 mAh battery (6.9 Wh), fixed", "iOS 9", "no", "no", "with 3G",
					"with 4G", "yes", "802.11 a/b/g/n/ac, dual-band, hotspot", "-", "750 x 1334 pixels (~326 ppi pixel density)", "without card", "Accelerometer, gyro, proximity, compass, barometer", "https://lcdn.altex.ro/resize/media/catalog/product/T/e/2bd48d28d1c32adea0e55139a4e6434a/Telefon-XIAOMI-Redmi-9C-NFC-Midnight-Grey.jpg");
	Phone phone3 = new Phone("APPLE IPHONE 6S 64GB", "Apple", 0.143f, "138.3 x 67.1 x 7.1 mm", "black", 800, "A9 chip with 64-bit architecture", "-", 
			"64GB", "2GB", "Touchscreen Capacitiv", 4.7f, "Wi Fi", "4.2, A2DP, LE", "Lightning connector 3.5 mm jack", "Speaker", "primary camera resolution 12", "Li-Po 1715 mAh battery (6.9 Wh), fixed", "iOS 9", "no", "no", "with 3G",
					"with 4G", "yes", "802.11 a/b/g/n/ac, dual-band, hotspot", "-", "750 x 1334 pixels (~326 ppi pixel density)", "without card", "Accelerometer, gyro, proximity, compass, barometer", "https://lcdn.altex.ro/resize/media/catalog/product/T/e/2bd48d28d1c32adea0e55139a4e6434a/Telefon-XIAOMI-Redmi-9C-NFC-Midnight-Grey.jpg");
	Phone phone4 = new Phone("APPLE IPHONE 6S 64GB", "Apple", 0.143f, "138.3 x 67.1 x 7.1 mm", "black", 800, "A9 chip with 64-bit architecture", "-", 
			"64GB", "2GB", "Touchscreen Capacitiv", 4.7f, "Wi Fi", "4.2, A2DP, LE", "Lightning connector 3.5 mm jack", "Speaker", "primary camera resolution 12", "Li-Po 1715 mAh battery (6.9 Wh), fixed", "iOS 9", "no", "no", "with 3G",
					"with 4G", "yes", "802.11 a/b/g/n/ac, dual-band, hotspot", "-", "750 x 1334 pixels (~326 ppi pixel density)", "without card", "Accelerometer, gyro, proximity, compass, barometer", "https://lcdn.altex.ro/resize/media/catalog/product/T/e/2bd48d28d1c32adea0e55139a4e6434a/Telefon-XIAOMI-Redmi-9C-NFC-Midnight-Grey.jpg");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServicePhones servicephones = new ServicePhones();
		servicephones.addPhone(phone2);
		servicephones.addPhone(phone1);
		servicephones.addPhone(phone3);
		servicephones.addPhone(phone4);
		
		List<Phone> phones = servicephones.getPhones();
		
		request.setAttribute("phones",phones);
		request.getRequestDispatcher("Phones.jsp").forward(request, response);
	}

}
