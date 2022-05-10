package servlets;

import java.io.IOException;


import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Switch;
import services.ServiceSwitches;

@WebServlet("/Switches")
public class SwitchesServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Switch switch1 = new Switch("SWITCH D-LINK GO-SW-24G 24", "D-Link", 0.76f, "257 x 178 x 46 mm", "gray", 370, "24", "-", "Without management",
			"Switching 12V/1.5A level V power adapter", "-", "24 porturi 10/100/1000 Gigabit ports", "Without poe", "Power LED\r\n"
					+ "24 Link/Activity/Speed LEDs (one per port)", "no", "8K", "https://s1.cel.ro/images/Products/switch-d-link-go-sw-24g-24-porturi-gigabit-ethernet.jpg");
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceSwitches serviceswitches = new ServiceSwitches();
		serviceswitches.addSwitch(switch1);
		
		List<Switch> switches = serviceswitches.getSwitches();
		
		request.setAttribute("switches",switches);
		request.getRequestDispatcher("Switches.jsp").forward(request, response);
	}
	
}
