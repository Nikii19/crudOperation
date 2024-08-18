package servlet_crud_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_crud_dto.Studentdto;

public class Studentdao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void insert (Studentdto d1)
	{
		et.begin();
		em.persist(d1);
		et.commit();
	}
	
	public String deleteById(int cid)
	{
		Studentdto d1=em.find(Studentdto.class, cid);
		if(d1!=null)
		{
			et.begin();
			em.remove(d1);
			et.commit();
			return "data removed";
		}
		else return "data not found";
		
	}
	public String deleteAll() {
		Query q=em.createQuery("select n from Studentdto n");
		List<Studentdto> l=q.getResultList();
		if (l.isEmpty()) {
			return "no data found";
		}
		else {
			for (Studentdto x:l)
			{
				et.begin();
				em.remove(x);
				et.commit();
			}
			return "all data deleted";
		}
				
		
	}
	
	public Object fetchbyid(int id)
	{
		Studentdto d=em.find(Studentdto.class, id);
		if(d!=null) {
			return d;
			
		}
		else {
			return "no data found";
		}
	}
		
		public List fetchall()
		{
			Query q=em.createQuery("select data from Studentdto data");
			List<Studentdto>list=q.getResultList();	
			if(list.isEmpty())
			{
				return null;
			}else
			{
				return list;
	   }
	
}

		public void update(Studentdto d1) {
			et.begin();
			em.merge(d1);
			et.commit();
			
		}
}


	


