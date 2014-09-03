package sa.all;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class sa_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public sa_servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParseLogic test = new ParseLogic();
		String usn = request.getParameter("usn");
		List<String> info;
		try {
			info = test.getList(usn);
			response.setContentType("text/html");
			request.setAttribute("USN",info.get(0));
			request.setAttribute("name", info.get(1));
			request.setAttribute("sem1", info.get(2));
			request.setAttribute("sem1g", info.get(3));
			request.setAttribute("sem2", info.get(4));
			request.setAttribute("sem2g", info.get(5));
			request.setAttribute("sem3", info.get(6));
			request.setAttribute("sem3g", info.get(7));
			request.setAttribute("sem4", info.get(8));
			request.setAttribute("sem4g", info.get(9));
			request.getRequestDispatcher("/result.jsp").forward(request, response);
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		}		
	}
}
