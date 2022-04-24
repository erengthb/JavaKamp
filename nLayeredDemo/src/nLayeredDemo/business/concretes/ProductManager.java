package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;


public class ProductManager implements ProductService {
	
	
	
	// dependency injection 
	private ProductDao productDao;
	private LoggerService loggerService;
	
	

	public ProductManager(ProductDao productDao , LoggerService loggerService  ) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}
	
	

	
	
	
	@Override
	public void add(Product product) {
		// iþ kodlarý yazýlýr
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmemektedir .");
			return ; // kodun devam etmemesi için yazýldý
			
		}
		/*HibernateProductDao dao = new HibernateProductDao();  // Böyle yazmak yanlýþtýr.
		 
		dao.add(product);*/               // Test senaryolarýnda sorun çýkartýr.
		
		this.productDao.add(product);
		this.loggerService.logToSystem("ürün eklendi"+product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
