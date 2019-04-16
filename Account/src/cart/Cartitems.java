package cart;

import java.sql.Date;
import java.util.List;

import common.Product;

import java.util.ArrayList;

public class Cartitems {
	int userid;
	List<Product> product;
	int cartid;
	int createdon;
	String img;
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProducts(List<Product> product) {
		this.product = product;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getCreatedon() {
		return createdon;
	}
	public void setCreatedon(int createdon) {
		this.createdon = createdon;
	}
}
