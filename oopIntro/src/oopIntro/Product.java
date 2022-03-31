package oopIntro;

public class Product {
	// private anahtar kelimesi sadece bulunan classýn ýcýnde eriþim saðlar
	// final kelimesi sadece constuctorda set edilebilir demektir ve dýþardan eriþimi engeller
	
	private int id;  // bu alanlarla aþþaðýdaki consurctor daki alanlarý birbrine eþlememiz gerekiyor . (GET- SET)
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	private double unitPriceAfterDiscount;
	
	public Product () { // Consturctor
		
		
		
		
	}
	
	public Product(int id,String name , double unitPrice, String detail,double discount,double unitPriceAfterDiscount) { // imza
		
		// constructorla classtaki verileri eþitleme iþlemi
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
