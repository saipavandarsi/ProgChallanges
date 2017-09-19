package challenge2;

public class Employee {
	
	private String id;
	private String name;
	private String phone;
	private String address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(String id,String name, String phone, String address ) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	void setAddress(String address) {
		this.address = address;
	}
}
