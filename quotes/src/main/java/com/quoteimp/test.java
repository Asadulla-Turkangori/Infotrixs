package com.quoteimp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modules.Quote;


public class test extends HttpServlet{
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			int id = (int)(Math.random()*(15-1)+1);
			Quotedaoimp qimp = new Quotedaoimp();
			Quote q = qimp.get(id);
			String value = q.getValue();
			String author = q.getAuthor();
			req.setAttribute("quote", value);
			req.setAttribute("author", author);
			RequestDispatcher d = req.getRequestDispatcher("index.jsp");
			d.include(req, resp);
		}
}
