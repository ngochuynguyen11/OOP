package tuan1_HinhChuNhat;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	/**
	 * @return the chieuDai, lay gia tri phuong thuc public
	 */
	public double getChieuDai() {
		return chieuDai;
	}

	/**
	 * @param chieuDai the chieuDai to set gan gia tri cho this.chieuDai nho phuong thuc public
	 * @throws Exception nem loi
	 */
	public void setChieuDai(double cD) throws Exception {
		if (cD > 0) {
			this.chieuDai= cD;
		} else {
			throw new Exception("Loi");
		}
		this.chieuDai = chieuDai;
	}

	/**
	 * @return the chieuRong
	 */
	public double getChieuRong() {
		return chieuRong;
	}

	/**
	 * @param chieuRong the chieuRong to set
	 */
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	
	/**
	 Ham tao co so mac dinh java da co
	 */
	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * Ham co thuoc tinh dung khoi tao doi tuong
	 * @param chieuDai
	 * @param chieuRong
	 */
	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
//viet phuong trinh dien tich va chu vi
	public double getDT() {
		return this.chieuDai*this.chieuRong;
	}
	public double getCV() {
		return (this.chieuDai+this.chieuRong)*2;
	}
	
	public static void main(String[] args) {
		// test chuong trinh tinh dien tich va chu vi
		// Dung ham tao
		HinhChuNhat h1 = new HinhChuNhat(7, 5);
		//xem gia tri canh
		System.out.println(h1.getChieuDai());
		System.out.println(h1.chieuRong);
		//tinh dien tich va chu vi theo phuong thuc
		System.out.println("Chu vi hinh chu nhat: ");
		System.out.println(h1.getCV());
		System.out.println("Dien tich hinh chu nhat");
		System.out.println(h1.getDT());

	}

}
