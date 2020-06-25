package nhanien;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int[] mang= new int[5];
		nhanvien[] nv =new nhanvien[3];
		Scanner scan= new Scanner(System.in);
		System.out.println("vui long nhap ten tuoi  dia chi  cua nhan vien");
		
		for (int i = 0; i < nv.length; i++) {
			String ten= scan.nextLine();
			int tuoi =scan.nextInt();
			String diachi= scan.nextLine();
			
			nv[i]=new nhanvien(ten, tuoi, diachi);
			
			scan.nextLine();
		}
		for (nhanvien nv1: nv ) {
			System.out.println(nv1.getTen()+" "+nv1.getTuoi()+" "+nv1.getDiachi());
			
		}
		
		
	}

}