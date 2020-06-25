package laptrinhhuongdoituong;

public class bookcontrolter {
	String ten;
	String mota;
	double price;
	
	//contructor
	public bookcontrolter() {
		
	}
	public bookcontrolter(String ten, String mota) {
		this.ten=ten;
		this.mota=mota;
		
	}
	public bookcontrolter(String ten, String mota,double price) {
		this.ten=ten;
		this.mota=mota;
		this.price=price;
	}
	
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
