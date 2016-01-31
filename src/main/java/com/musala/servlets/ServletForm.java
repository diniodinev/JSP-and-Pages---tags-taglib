package com.musala.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletForm
 */
@WebServlet("/FormServlet")
public class ServletForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		writer.print("</head>");
		writer.print("<body>");
		writer.print("<form>");
		writer.print("ID:");
		writer.print("<br>");
		writer.print("<input type=\"text\" name=\"id\"></br>");
		writer.print("</br>");
		writer.print("Topic:");
		writer.print("<br>");
		writer.print("<input type=\"text\" name=\"topic\"></br>");
		writer.print("</br>");
		writer.print("Date:");
		writer.print("<br>");
		writer.print("<input type=\"text\" name=\"date\"></br>");
		writer.print("</br>");
		writer.print("<input type=\"submit\" value=\"Submit\">");
		writer.print("<input type=\"reset\" value=\"Cancel\">");
		writer.print("</form>");
		writer.print("</body>");
		writer.print("<html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
