package servlet_crud_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud_dao.Studentdao;

@WebServlet("/fetchbyid")
public class FetchById extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		Studentdao dao=new Studentdao();
		Object msg=dao.fetchbyid(cid);
				
				resp.getWriter().print(msg);
	}
	

}
