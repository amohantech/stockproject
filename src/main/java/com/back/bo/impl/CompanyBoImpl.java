package com.back.bo.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.back.dao.CompanyDAO;
import com.back.hibernate.util.HibernateUtil;
import com.back.model.Company;

public class CompanyBoImpl implements CompanyDAO{

	private static SessionFactory factory;
	
	public CompanyBoImpl(){
	      try{
	          factory = new Configuration().configure().buildSessionFactory();
	      }catch (Throwable ex) { 
	          System.err.println("Failed to create sessionFactory object." + ex);
	          throw new ExceptionInInitializerError(ex); 
	      }
		
	}
	
	public void updateCompany(Company c) {
		// TODO Auto-generated method stub
	}
	
	public StringBuffer getListCompaniesHTML(){
		
		String html = "no result";
		
		CompanyBoImpl c = new CompanyBoImpl();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		List<Company> ls = c.listCompanies();
		
		StringBuffer sf = new StringBuffer();
		
        sf.append("<div class='col-6 col-md-3 sidebar-offcanvas' id='sidebar'>");
        	sf.append("<div class='list-group'>");
        	for(Company l : ls)
  		  	{
        		sf.append("<a href='#' class='list-group-item'>"+l.getName()+"</a> <button type='button' class='btn btn-danger'>x</button>");
  		  	}
        	sf.append("</div>");
        sf.append("</div>");
		
		return sf;
	}
	
	public List<Company> listCompanies() {
	      Session session = factory.openSession();
	      
		  session.beginTransaction();
		  List query = session.createQuery("from Company").getResultList();
		  List<Company> ls = query;

		  session.getTransaction().commit();
		  factory.close();
		  //sessionFactory.close();
		return ls;
	}

	public CompanyDAO getCompanyById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeCompany(Company comp) {
	      Session session = factory.openSession();
		  session.beginTransaction();
		  
		  try {
			  session.delete(comp);
		  }catch(HibernateException e){
			  e.printStackTrace();
		  }
		  
		  session.getTransaction().commit();
		  factory.close();
		  
	}

	public Integer save(Company comp) {
			
		  Integer compID = null;
	      Session session = factory.openSession();
		  session.beginTransaction();
		  
		  try {
			  compID = (Integer) session.save(comp); 
		  }catch(HibernateException e){
			  e.printStackTrace();
		  }
		  
		  session.getTransaction().commit();
		  factory.close();
		  
		  return compID;
	}
}
