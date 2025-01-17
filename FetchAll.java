package servlet_crud_controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud_dao.Studentdao;
import servlet_crud_dto.Studentdto;

@WebServlet("/fetchall")
public class FetchAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		Studentdao dao=new Studentdao();
		List<Studentdto>list=dao.fetchall();
//		resp.getWriter().print(list);
		
		req.setAttribute("objects", list);
		
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
	}
	
	

}
