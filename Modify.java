package servlet_crud_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud_dao.Studentdao;
import servlet_crud_dto.Studentdto;

@WebServlet("/edit")
public class Modify extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String id=req.getParameter("pk");
	String mobile=req.getParameter("umob");
	String name=req.getParameter("un");
	String email=req.getParameter("ue");
	System.out.println(id+" "+mobile);
	
	int cid=Integer.parseInt(id);
	Long cm=Long.parseLong(mobile);
	
	
	Studentdto dto=new Studentdto();
	dto.setId(cid);
	dto.setMobile(cm);
	dto.setEmail(email);
	dto.setName(name);
	
	Studentdao dao=new Studentdao();
	dao.update(dto);
}
}
