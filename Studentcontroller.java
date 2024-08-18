package servlet_crud_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_crud_dao.Studentdao;
import servlet_crud_dto.Studentdto;

@WebServlet("/add")
public class Studentcontroller extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		 String id=req.getParameter("id");
		 int cid=Integer.parseInt(id);
		 String name=req.getParameter("name");
		 String mobile=req.getParameter("mobile");
		 long cmobile=Long.parseLong(mobile);
		 String email=req.getParameter("email");
		 String gender=req.getParameter("gender");
		 String country=req.getParameter("country");
		 String checkbox=req.getParameter("checkbox");
		
		 
		 Studentdto dto=new Studentdto();
		 dto.setId(cid);
		 dto.setName(name);
		 dto.setMobile(cmobile);
		 dto.setEmail(email);
		 dto.setGender(gender);
		 dto.setCheckbox(checkbox);
		 dto.setCountry(country);
		 
		 System.out.println(dto);
		 
		 Studentdao dao=new Studentdao();
		 dao.insert(dto);
		 
		
	}

}
