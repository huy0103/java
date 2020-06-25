package laptrinhhuongdoituong;

public class nguoi {
	String ten;
	String diachi;
	int tuoi;
	public void dilai(String ten) {
		System.out.println(ten+" di lai");
		
		
	}
	
	
	public static void main(String [] args) {
		
		new nguoi();
		nguoi anhA = new nguoi();
		nguoi anhB = new nguoi();
		
		
		anhA.dilai("anh A");
		anhB.dilai("anh B");
		
	}

}
