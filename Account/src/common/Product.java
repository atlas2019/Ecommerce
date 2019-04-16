package common;

public class Product {
	private int idno;
	private String img;
	private String Category;
	private	String modelname;
	private	String brand;
	private	int mobileprice;
	private int ram;
	private Camera camspec;
	private String storage;
	private Highlights highlig;
	private Dimension mobdim;
	int quantity;
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMobileprice() {
		return mobileprice;
	}
	public void setMobileprice(int mobileprice) {
		this.mobileprice = mobileprice;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Camera getCamspec() {
		return camspec;
	}
	public void setCamspec(Camera camspec) {
		this.camspec = camspec;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public Highlights getHighlig() {
		return highlig;
	}
	public void setHighlig(Highlights highlig) {
		this.highlig = highlig;
	}
	public Dimension getMobdim() {
		return mobdim;
	}
	public void setMobdim(Dimension mobdim) {
		this.mobdim = mobdim;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}