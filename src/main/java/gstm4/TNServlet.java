package gstm4;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TNServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String color=req.getParameter("color");
	String brand=req.getParameter("brand");
	
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	double cgst1=Double.parseDouble(cgst);
	
	
	
	ServletConfig config=getServletConfig();
	String sgst=config.getInitParameter("sgstoftn");
	double sgstoftn=Double.parseDouble(sgst);
	
	String sgstofkar=config.getInitParameter("sgstofkar");
	
	System.out.println("cgst is::::"+cgst1);
	System.out.println("sgst is :::::"+sgstoftn);
	System.out.println("sgst of kar:::"+sgstofkar);
}
}
