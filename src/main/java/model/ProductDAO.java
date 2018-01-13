package model;



import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ProductDAO {
	private boolean b = true;
	private Transaction trans;
	private Session s;
	public boolean insertProduct(Product p, Product p1, Supplier sp) {
		try
		{
			 s = DbConfig.getSess();
			 trans = s.beginTransaction();
			s.save(p);
			s.save(p1);
			s.save(sp);
			trans.commit();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			b=false;
			trans.rollback();
		}
		return b;
		
	}
	public List<Product> getProducts()
	{
		Query query = s.createQuery("from Product");
		//CriteriaBuilder cb = s.getCriteriaBuilder();
		//CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		//cq.from(Product.class);
		//List<Product> lp = s.createQuery(cq).getResultList();
		List<Product> lp = (List<Product>)query.getResultList();
		//for(Product p: lp)
		//{
		//	System.out.println(p.getProductName());
		//}
		//s.close();
		return lp;
		
	}
}
