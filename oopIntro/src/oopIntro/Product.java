package oopIntro;

public class Product {
	// private anahtar kelimesi sadece bulunan class�n �c�nde eri�im sa�lar
	// final kelimesi sadece constuctorda set edilebilir demektir ve d��ardan eri�imi engeller
	
	private int id;  // bu alanlarla a��a��daki consurctor daki alanlar� birbrine e�lememiz gerekiyor . (GET- SET)
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	private double unitPriceAfterDiscount;
	
	public Product () { // Consturctor
		
		
		
		
	}
	
	public Product(int id,String name , double unitPrice, String detail,double discount,double unitPriceAfterDiscount) { // imza
		
		// constructorla classtaki verileri e�itleme i�lemi
		this.id=id;
		this.name= name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		this.discount=discount;
		this.unitPriceAfterDiscount=unitPriceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		 
		return unitPrice -  (unitPrice * discount / 100 ) ;
	}

	


}
