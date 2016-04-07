public class CustomerObject {
	
	//private long customerID;
	private String full_name;
	private String dob;
	private String postCode;
	private String address;
	
	
	public CustomerObject(String full_name, String dob, String postCode, String address)
	{
		this.full_name = full_name;
		this.dob = dob;
		this.postCode = postCode;
		this.address = address;
		
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPostcode() {
		return postCode;
	}

	public void setPostcode(String postcode) {
		this.postCode = postCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

