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
		// i� kodlar� yaz�l�r
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmemektedir .");
			return ; // kodun devam etmemesi i�in yaz�ld�
			
		}
		/*HibernateProductDao dao = new HibernateProductDao();  // B�yle yazmak yanl��t�r.
		 
		dao.add(product);*/               // Test senaryolar�nda sorun ��kart�r.
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi"+product.getName());
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
