package tuan1_HinhTron;

public class ToaDo {
	//khai bao bien
	private String Ten;
	private double x;
	private double  y;
	// dong goi
	/**
	 * @return the ten
	 */
	public String getTen() {
		return Ten;
	}
	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		Ten = ten;
	}
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	//constructor
	/**
	 * @param ten
	 * @param x
	 * @param y
	 */
	public ToaDo(String ten, double x, double y) {
		Ten = ten;
		this.x = x;
		this.y = y;
	}
	public ToaDo() {

	}
	
	
}
