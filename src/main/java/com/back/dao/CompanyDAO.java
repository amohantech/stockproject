package com.back.dao;

import java.util.List;

import com.back.model.Company;

public interface CompanyDAO {
		
	public void updateCompany(Company c);
	public abstract List<Company> listCompanies();
	public CompanyDAO getCompanyById(int id);
	public void removeCompany(Company comp);
	public Integer save(Company c);

}
