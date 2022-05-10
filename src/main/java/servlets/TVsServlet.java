package servlets;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.TV;
import services.ServiceTVs;

@WebServlet("/TVs")
public class TVsServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	TV tv1 = new TV("SmartTV Samsung 43AU7172", "Samsung", 8.3f, "192.5mm x 627.8mm x 963.9mm", "dark gray", 1600, "108cm", "LED", "Ultra HD (4K)", 
			"3840 x 2160", "no", "Crystal Proccesor 4K\\n HDR 10\\n HLG (Hybrid Log Gamma)\\n Mega Contrast\\n Mod Film\\n Natural Mode Support\\n PurColor\\n UHD Dimming", 
			"Adaptive Sound\\n Audio Pre-selection\\n Descriptor\\n Dolby Digital Plus\\n Mutiroom Link", "20 W 2 boxes", "1 x S/PDIF", "4", "version 4.2", "2", "CI+", 
			"Video streaming (Youtube Netflix Hbo Go)\r\n"
			+ "USB Recording\r\n"
			+ "Quad Core Processor \r\n"
			+ "Screen mirroring iOS Android", "103 W - in HDR mode\r\n"
					+ "70 W - in normal mode", "1 x Cablu de Alimentare\r\n"
							+ "1 x Manual de utilizare\r\n"
							+ "1 x Telecomanda", "Conectare Wireless\r\n"
									+ "Rata de refresh 60 Hz", "DVB-C\r\n"
											+ "DVB-S2\r\n"
											+ "DVB-T2", "https://s1.cel.ro/images/Products/2021/03/31/Televizor-LED-108-cm-Samsung-43AU7172-4K-Ultra-HD-Smart-TV-Gri.jpg");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceTVs servicetvs = new ServiceTVs();
		servicetvs.addTV(tv1);
		
		List<TV> tvs = servicetvs.getTVs();
		
		request.setAttribute("tvs",tvs);
		request.getRequestDispatcher("TVs.jsp").forward(request, response);
	}
	

}
