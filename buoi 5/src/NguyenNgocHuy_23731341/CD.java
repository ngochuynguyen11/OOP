package NguyenNgocHuy_23731341;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	//----------hang so mac dinh------------//
	public static final int MA_CD_DEFAULT = 999999;
	public static final String TUA_CD_DEFAULT = "Chua xac dinh";
	
	//-------Constructor mac dinh --------------//
	public CD(){
		this.maCD = MA_CD_DEFAULT;
		this.tuaCD = TUA_CD_DEFAULT;
		this.soBaiHat = 1;
		this.giaThanh = 1.0;
	}
	
	//-----------Constructor co tham so ------------//
	public CD(int maCD,
	 String tuaCD,
	 int soBaiHat,
	 double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
		}

	//--------Getter-------------//
	public int getMaCD() { return maCD; }
	public String getTuaCD() { return tuaCD; }
	public int getSoBaiHat() { return soBaiHat; }
	public double getGiaThanh() { return giaThanh; }

	
	//-----------setter kiem tra rang buoc--------------//
	
	public void setMaCD(int maCD) {
		if (maCD <= 0)
			throw new IllegalArgumentException("Loi: Ma CD phai > 0");
		this.maCD = maCD;
	}

	public void setTuaCD(String tuaCD) {
		if (tuaCD == null || tuaCD.trim().isEmpty())
			throw new IllegalArgumentException("Loi: Tua CD khong duoc rong");
		this.tuaCD = tuaCD;
	}


	public void setSoBaiHat(int soBaiHat) {
		if (soBaiHat <= 0)
			throw new IllegalArgumentException("Loi: So bai hat phai > 0");
		this.soBaiHat = soBaiHat;
	}

	public void setGiaThanh(double giaThanh) {
		if (giaThanh <= 0)
			throw new IllegalArgumentException("Loi: Gia thanh phai > 0");
		this.giaThanh = giaThanh;
	}

	//--------toString dinh dang bang--------------//

	
	@Override
	public String toString() {
		return String.format(
			"| %-10d | %-25s | %-12d | %-15.2f |",
			maCD, tuaCD, soBaiHat, giaThanh);
	}
	
}




























