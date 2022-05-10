package servlets;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.WifiRouter;
import services.ServiceWifiRouters;

@WebServlet("/WifiRouters")
public class WifiRoutersServlet extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	WifiRouter wifirouter1 = new WifiRouter("ROUTER WIRELESS TP-LINK TL-MR6400", "TP-LINK", 0.3f, "202 x 141 x 33.6 mm", "black", 367, "-", 
			"IEEE 802.11b/g/n 2.4GHz", "Access Control\r\nLocal Management\r\n Remote Management", "External Power Supply(EU): 9V/0.85A", "300 Mbps", "no", 
			"-", "without usb ports", "-", "2.4GHz", "64/128-bit WEP, WPA/WPA2, criptări WPA-PSK/WPA2-PSK", "3G\r\n 4G", "2G: EDGE/GPRS/GSM Quad Band (850/900/1800/1900MHz)\r\n"
					+ "3G: DC-HSPA+/HSPA+/HSPA/UMTS B1/B8 (2100/900MHz)\r\n"
					+ "4G: FDD-LTE B1/B3/B7/B8/B20 (2100/1800/2600/900/800MHz)\r\n"
					+ "TDD-LTE B38/B40 (2600/2300MHz)", "2 Antene 4G LTE externe fixe\r\n"
							+ "2 Antene Wi-Fi interne,", "no", "Single Band", "-", "CE: <20dBm(2.4GHz)", "yes", "DoS\r\n"
									+ "SPI Firewall\r\n"
									+ "IP Address Filter/Domain Filter\r\n"
									+ "IP and MAC Address Binding", "https://s1.cel.ro/images/Products/router-wireless-tp-link-tl-mr6400-4g.jpg");

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceWifiRouters servicewifirouters = new ServiceWifiRouters();
		servicewifirouters.addWifiRouter(wifirouter1);
		
		List<WifiRouter> wifirouters = servicewifirouters.getWifiRouters();
		
		request.setAttribute("wifirouters",wifirouters);
		request.getRequestDispatcher("WifiRouters.jsp").forward(request, response);
	}

}
