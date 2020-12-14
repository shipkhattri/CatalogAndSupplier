package io.CatalougesAndSuppliers;

public class Catalog {

	private String sku_code;
	private String sku_name;
	private String sku_description;
	private String BrandName;
	private String BrandDescription;
	private String SID;
	
	public Catalog() {}
	
	public Catalog(String sku_code, String sku_name, String sku_description, String brandName, String brandDescription,
			String sID) {
		super();
		this.sku_code = sku_code;
		this.sku_name = sku_name;
		this.sku_description = sku_description;
		BrandName = brandName;
		BrandDescription = brandDescription;
		SID = sID;
	}
	
	public String getSku_code() {
		return sku_code;
	}
	public void setSku_code(String sku_code) {
		this.sku_code = sku_code;
	}
	public String getSku_name() {
		return sku_name;
	}
	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}
	public String getSku_description() {
		return sku_description;
	}
	public void setSku_description(String sku_description) {
		this.sku_description = sku_description;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getBrandDescription() {
		return BrandDescription;
	}
	public void setBrandDescription(String brandDescription) {
		BrandDescription = brandDescription;
	}
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	
}
