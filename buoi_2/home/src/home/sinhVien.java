package home;

public class sinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	
	//constructor mac dinh
	public sinhVien() {
		maSV = 0;
		hoTen = "Chua xac dinh";
		diemLT = 0.0;
		diemTH = 0.0;
	}

	
	
	public sinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);

	}



	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if (maSV > 0) {
			this.maSV = maSV;
		}else {
			this.maSV = 0;
		}
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (hoTen !=null && !hoTen.trim().isEmpty()) {
			this.hoTen = hoTen;
		} else {
			this.hoTen = "Chua xac dinh";
		}
	}

	public double getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(double diemLT) {
        if (diemLT >= 0.0 && diemLT <= 10.0) {
            this.diemLT = diemLT;
        } else {
            this.diemLT = 0.0;
        }
    }

	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(double diemTH) {
        if (diemTH >= 0.0 && diemTH <= 10.0) {
            this.diemTH = diemTH;
        } else {
            this.diemTH = 0.0;
        }
    }

//DTB
	public double tinhDTB() {
		return (diemLT + diemTH)/2;
	}

	//pt toString


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(
	            "%-10d %-30s %5.2f %5.2f %5.2f",
	            maSV, hoTen, diemLT, diemTH, tinhDTB()
	        );

	}
}
