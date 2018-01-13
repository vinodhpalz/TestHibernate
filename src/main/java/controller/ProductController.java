package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product;
import model.ProductDAO;
import model.Supplier;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			int id = Integer.parseInt(request.getParameter("t1"));
			String name= request.getParameter("t2");
			if(id != 0)
			{
				Product p = new Product();
				//p.setProductId(id);
				p.setProductName(name);
				
				Product p1 = new Product();
				p1.setProductName("Apple");
				
				Supplier s = new Supplier();
				s.setSupplierName("Amazon");
				s.getProducts().add(p);
				s.getProducts().add(p1);
				p.setSupplier(s);
				ProductDAO pd = new ProductDAO();
				boolean b = pd.insertProduct(p,p1,s);
				request.setAttribute("products", pd.getProducts());
				if(b)
				{
					RequestDispatcher rd = request.getRequestDispatcher("ProductList.jsp");
					rd.forward(request, response);
				}
				
			}
			else
			{
				RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
				rd.forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
