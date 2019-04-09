package productmanager;

import productmanager.camera;
import productmanager.dimension;
import productmanager.highlights;

public class mobile {
	private String idno;
	private String img;
	private String Category;
	private	String modelname;
	private	String brand;
	private	String mobileprice;
	private String ram;
	private camera camspec;
	private String storage;
	private highlights highlig;
	private dimension mobdim;
	
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
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
	public String getMobileprice() {
		return mobileprice;
	}
	public void setMobileprice(String mobileprice) {
		this.mobileprice = mobileprice;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public camera getCamspec() {
		return camspec;
	}
	public void setCamspec(camera camspec) {
		this.camspec = camspec;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
		public highlights getHighlig() {
		return highlig;
	}
	public void setHighlig(highlights highlig) {
		this.highlig = highlig;
	}
	public dimension getMobdim() {
		return mobdim;
	}
	public void setHighlig(dimension mobdim) {
		this.mobdim = mobdim;
	}
}
	
	

