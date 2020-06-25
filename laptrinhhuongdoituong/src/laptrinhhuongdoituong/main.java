package laptrinhhuongdoituong;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1= new Person();
		p1.setTen("huy");
		p1.setTuoi(28);
		
		
		Person p2 = new Person();
		p2.setTen("hue");
		p2.setTuoi(21);
		
		
		System.out.println(p1.getTen()+" "+p1.getTuoi());
		System.out.println(p2.getTen()+" "+p2.getTuoi());
		
		//doi tuong book
		System.out.println("---------------------");
		bookcontrolter b1=new bookcontrolter();
		b1.setTen("huy");
		b1.setMota("thay gom");
		b1.setPrice(2222.222);
		System.out.println(b1.getTen()+"  "+b1.getMota()+" "+b1.getPrice());
		
		bookcontrolter b2 = new bookcontrolter("hue","de thuong");
		System.out.println(b2.getTen()+" "+ b2.getMota());
		
		bookcontrolter b3 =new bookcontrolter("du my","xinh dep",11);
		System.out.println(b3.getTen()+" " +b3.getMota()+" "+ b3.getPrice());
		
	}

}
