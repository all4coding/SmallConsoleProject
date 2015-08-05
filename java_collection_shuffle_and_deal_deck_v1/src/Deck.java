
public final class Deck {
	private String number;
	private String color;
	/**
	 * 有参构造方法
	 * @param number
	 * @param color
	 */
	public Deck(String number, String color){
		this.number = number;
		this.color = color;
	}
	/**
	 * 属性set/get方法
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
