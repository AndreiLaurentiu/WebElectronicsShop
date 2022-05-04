package servlets;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import products.Laptop;
import services.ServiceLaptops;

@WebServlet("/Laptops")
public class LaptopsServlet extends HttpServlet{
	
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Laptop laptop1 = new Laptop("ASUS X515MA", "Asus", 2, "36.02 cm x 23.49 cm x 1.99 cm", "grey",1200, "Intel Celeron N4020",
				"1.10GHz", "256GB", "4GB", "45% NTSC\r\n"
						+ "Anti-Glare\r\n"
						+ "LED\r\n"
						+ "Luminozitate 200 Niti\r\n"
						+ "Truelife", 15.6f, "802.11a/b/g/n/ac", "Bluetooth 4.1", "2 x USB 2.0, 1 x HDMI, "
								+ "Microphone", "Difuzoare stereo\r\n"
										+ "Tehnologie ASUS SonicMaster", "VGA", "2 celule\r\n"
												+ "37 Whr\r\n"
												+ "Lithium Ion", "None included", "6W", "4MB", "Intel UHD Graphics",
												"Integrated", "Without Touchscreen", "1920 x 1080", "1 x Slot M2", 
												"microSD", "yes", "no", "https://s1.cel.ro/images/Products/2021/08/05/Laptop-ASUS-X515MA-Intel-Celeron-N4020-256GB-SSD-4GB-FullHD-Transparent-Silver.jpg");
		Laptop laptop2 = new Laptop("ASUS X515MA", "Asus", 2, "36.02 cm x 23.49 cm x 1.99 cm", "grey",1200, "Intel Celeron N4020",
				"1.10GHz", "256GB", "4GB", "45% NTSC\r\n"
						+ "Anti-Glare\r\n"
						+ "LED\r\n"
						+ "Luminozitate 200 Niti\r\n"
						+ "Truelife", 15.6f, "802.11a/b/g/n/ac", "Bluetooth 4.1", "2 x USB 2.0, 1 x HDMI, "
								+ "Microphone", "Difuzoare stereo\r\n"
										+ "Tehnologie ASUS SonicMaster", "VGA", "2 celule\r\n"
												+ "37 Whr\r\n"
												+ "Lithium Ion", "None included", "6W", "4MB", "Intel UHD Graphics",
												"Integrated", "Without Touchscreen", "1920 x 1080", "1 x Slot M2", 
												"microSD", "yes", "no", "https://s1.cel.ro/images/Products/2021/08/05/Laptop-ASUS-X515MA-Intel-Celeron-N4020-256GB-SSD-4GB-FullHD-Transparent-Silver.jpg");
		Laptop laptop3 = new Laptop("ASUS X515MA", "Asus", 2, "36.02 cm x 23.49 cm x 1.99 cm", "grey",1200, "Intel Celeron N4020",
				"1.10GHz", "256GB", "4GB", "45% NTSC\r\n"
						+ "Anti-Glare\r\n"
						+ "LED\r\n"
						+ "Luminozitate 200 Niti\r\n"
						+ "Truelife", 15.6f, "802.11a/b/g/n/ac", "Bluetooth 4.1", "2 x USB 2.0, 1 x HDMI, "
								+ "Microphone", "Difuzoare stereo\r\n"
										+ "Tehnologie ASUS SonicMaster", "VGA", "2 celule\r\n"
												+ "37 Whr\r\n"
												+ "Lithium Ion", "None included", "6W", "4MB", "Intel UHD Graphics",
												"Integrated", "Without Touchscreen", "1920 x 1080", "1 x Slot M2", 
												"microSD", "yes", "no", "https://s1.cel.ro/images/Products/2021/08/05/Laptop-ASUS-X515MA-Intel-Celeron-N4020-256GB-SSD-4GB-FullHD-Transparent-Silver.jpg");
		Laptop laptop4 = new Laptop("ASUS X515MA", "Asus", 2, "36.02 cm x 23.49 cm x 1.99 cm", "grey",1200, "Intel Celeron N4020",
				"1.10GHz", "256GB", "4GB", "45% NTSC\r\n"
						+ "Anti-Glare\r\n"
						+ "LED\r\n"
						+ "Luminozitate 200 Niti\r\n"
						+ "Truelife", 15.6f, "802.11a/b/g/n/ac", "Bluetooth 4.1", "2 x USB 2.0, 1 x HDMI, "
								+ "Microphone", "Difuzoare stereo\r\n"
										+ "Tehnologie ASUS SonicMaster", "VGA", "2 celule\r\n"
												+ "37 Whr\r\n"
												+ "Lithium Ion", "None included", "6W", "4MB", "Intel UHD Graphics",
												"Integrated", "Without Touchscreen", "1920 x 1080", "1 x Slot M2", 
												"microSD", "yes", "no", "https://s1.cel.ro/images/Products/2021/08/05/Laptop-ASUS-X515MA-Intel-Celeron-N4020-256GB-SSD-4GB-FullHD-Transparent-Silver.jpg");
			ServiceLaptops servicelaptops = new ServiceLaptops();
	
		servicelaptops.addLaptop(laptop1);
		servicelaptops.addLaptop(laptop2);
		servicelaptops.addLaptop(laptop3);
		servicelaptops.addLaptop(laptop4);
		
		List<Laptop> laptops = servicelaptops.getArrayOfLaptops();
		
		request.setAttribute("laptops",laptops);
		request.getRequestDispatcher("Laptops.jsp").forward(request, response);
	}

}
