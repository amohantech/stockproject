
import java.util.Date;

import org.hibernate.Session;

import com.back.bo.impl.CompanyBoImpl;
import com.back.hibernate.util.HibernateUtil;
import com.back.model.Company;

public class Test {

	public static void main(String[] args) {
		
		CompanyBoImpl c = new CompanyBoImpl();
		//Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//start transaction
		
/*		Company comp = new Company();
		
		comp.setId(13072320);
		comp.setDataset_code("MLSEQ");
		comp.setDatabase_code("EURONEXT");
		comp.setName("Sequa Petroleum Nv (MLSEQ)");
		comp.setDescription("Stock Prices for Sequa Petroleum Nv from the Euronext Stock Exchange. Currency: EUR. Market: Marché Libre Paris");
		comp.setRefreshed_at("2017-01-20 15:58:23 UTC");
		comp.setColumn_names("");
		comp.setFrequency("daily");
		comp.setType("Time Series");
		comp.setPremium("false");
		comp.setDatabase_id(5628);
		
		c.save(comp);*/
		
		
		Company comp3 = c.listCompanies().get(2);
		c.removeCompany(comp3);
		
	}
	
}