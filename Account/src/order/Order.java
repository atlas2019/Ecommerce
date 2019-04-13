package order;
import java.util.List;

import utility.Product;

/**
 * @author Akshata
 *
 */
public class Order {
	int userid;
	int orderid;
	int createdon, deldate;
	List<Product> product;
	String img;
	Address address;
	String cod;
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCreatedon() {
		return createdon;
	}
	public void setCreatedon(int createdon) {
		this.createdon = createdon;
	}
	public int getDeldate() {
		return deldate;
	}
	public void setDeldate(int deldate) {
		this.deldate = deldate;
	}

	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProducts(List<Product> product) {
		this.product = product;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
}
