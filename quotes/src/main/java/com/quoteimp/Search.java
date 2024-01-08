package com.quoteimp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modules.Quote;

public class Search extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		Quotedaoimp qimp = new Quotedaoimp();
		
		ArrayList<Quote> lst = (ArrayList<Quote>) qimp.getall();
		req.setAttribute("array", lst);
		RequestDispatcher d = req.getRequestDispatcher("search.jsp");
		
		d.include(req, resp);
	}
}
