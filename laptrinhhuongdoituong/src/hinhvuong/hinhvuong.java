package hinhvuong;

public class hinhvuong {
	
	public void chuvi() {
		System.out.println("chu vi");
		
	}
	public static void xinchao(hinhvuong hv) {
		String s= "xinchao";
		System.out.println(s);
		hv.chuvi();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println(x);
		hinhvuong hv= new hinhvuong();
		xinchao(hv);
		

	}

}
