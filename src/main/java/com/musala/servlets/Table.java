package com.musala.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Table
 */
@WebServlet("/TableServlet")
public class Table extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Table() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer =  response.getWriter();
		writer.print("<html>");
			writer.print("<head>");
			writer.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
			writer.print("</head>");
			writer.print("<body>");
				writer.print("<table border=\"1\">");
					writer.print("<thead>");
						writer.print("<tr>");
							writer.print("<td>");
							writer.print("Topic");
							writer.print("</td>");
							writer.print("<td>");
							writer.print("Date");
							writer.print("</td>");
						writer.print("</tr>");
					writer.print("</thead>");
					writer.print("<tbody>");
					writer.print("<tr>");
						writer.print("<td>");
						writer.print("Web Development Basics");
						writer.print("</td>");
						writer.print("<td>");
						writer.print("4 януари 2016");
						writer.print("</td>");
					writer.print("</tr>");
					writer.print("<tr>");
						writer.print("<td>");
						writer.print("Servlets and Pages");
						writer.print("</td>");
						writer.print("<td>");
						writer.print("21 януари 2016");
						writer.print("</td>");
					writer.print("</tr>");
				writer.print("</tbody>");
				writer.print("</table>");
			writer.print("</body>");
		writer.print("<html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
