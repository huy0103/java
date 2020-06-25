package nhanien;

public class nhanvien {
	private String ten;
	private int tuoi;
	private String diachi;
	
	public nhanvien(String ten, int tuoi, String diachi) {
		this.ten=ten;
		this.diachi=diachi;
		this.tuoi=tuoi;
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	

}
