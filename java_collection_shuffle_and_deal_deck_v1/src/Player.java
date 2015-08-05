
public class Player {
	private Integer ID;
	private String name;
	private HandMap hands;
	
	/**
	 * 定义一个有参构造方法
	 */
	public Player(Integer ID, String name){
		this.ID = ID;
		this.name = name;
	}
	public void setID(Integer ID){
		this.ID = ID;
	}
	public Integer getID(){
		return ID;
	}
	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}
	
	public void sethands(HandMap hands){
		this.hands = hands;
	}
	public HandMap gethands(){
		return hands;
	}
	
	public void addPlayCards(Integer ID){
		hands.handsPut(ID);
	}
}
