package crms_Simulatio;



public class Customer implements IEntity {

	public String Id;
	public String FirstName;
	public String LastName;
	public int Age;
	public String NationalIdentity;
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getNationalIdentity() {
		return NationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
	
	
}
