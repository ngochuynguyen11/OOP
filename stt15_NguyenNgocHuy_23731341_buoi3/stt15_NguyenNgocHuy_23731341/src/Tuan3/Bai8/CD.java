/**
 * 
 */
package tuan.Tuan3.Bai8;

/**
 * Bai tap tuan , bai 8, maSV: 23731341, hoTen: NguyenNgocHuy
 */
public class CD {
	/**
	 * Khai bao thuoc tinh cho object CD
	 */
	private String maCD;
	private String tuaCD;
	private String casi;
	private int soBaiHat;
	private float gia;
	
	/**
	 * dong goi va rang buoc +get, + set
	 */

	/**
		 * @return the maCD
		 */
		public String getMaCD() {
			return maCD;
		}
		/**
		 * @param maCD the maCD to set
		 */
		public void setMaCD(String maCD) {
			this.maCD = maCD;
		}
		/**
		 * @return the tuaCD
		 */
		public String getTuaCD() {
			return tuaCD;
		}
		/**
		 * @param tuaCD the tuaCD to set
		 */
		public void setTuaCD(String tuaCD) {
			this.tuaCD = tuaCD;
		}
		/**
		 * @return the casi
		 */
		public String getCasi() {
			return casi;
		}
		/**
		 * @param casi the casi to set
		 */
		public void setCasi(String casi) {
			this.casi = casi;
		}
		/**
		 * @return the soBaiHat
		 */
		public int getSoBaiHat() {
			return soBaiHat;
		}
		/**
		 * @param soBaiHat the soBaiHat to set
		 */
		public void setSoBaiHat(int soBai) {
			if(soBai>0) {
				this.soBaiHat = soBai;
			}else {
				throw new Exception("So bai hat lon hon 0");
			}		
		/**
		 * @return the gia
		 */
		public float getGia() {
			return gia;
		}
		/**
		 * @param gia the gia to set
		 */
		public void setGia(float gia) {
			this.gia = gia;
		}
		/**
	 * ham tao constructor
		 * @throws Exception 
	 */
		
	public CD(String maCD, String tuaCD, String casi, int soBai, float gia) throws Exception {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.casi = casi;
			if(soBai>0) {
				this.soBaiHat = soBai;
			}else {
				throw new Exception("So bai hat lon hon 0");
			}
		this.gia = gia;
	}
	public CD() {
	
	}
	/**
	 * Tao tieu de in
	 */
	public static void tieuDe() {
		System.out.println("In danh sach CD");
		for (int i = 0; i < 65; i++) {
			System.out.println("-------------");
		}
	}
	/**
	 * toString
	 */
	/**
	 * dong goi va rang buoc +get, + set
	 */
}
