
public final class Deck {
	private String number;
	private String color;
	/**
	 * �вι��췽��
	 * @param number
	 * @param color
	 */
	public Deck(String number, String color){
		this.number = number;
		this.color = color;
	}
	/**
	 * ����set/get����
	 * @param number
	 */
	public void setnumber(String number){
		this.number = number;
	}
	public String getnumber(){
		return this.number;
	}
	public void setcolor(String color){
		this.color = color;
	}
	public String getcolor(){
		return this.color;
	}
	
}
