package io.CatalougesAndSuppliers;

public class Supplier {

	private String SID;
	private String Sname;
	
	public Supplier() {}
	
	public Supplier(String sID, String sname) {
		super();
		SID = sID;
		Sname = sname;
	}
	
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	
	
}
