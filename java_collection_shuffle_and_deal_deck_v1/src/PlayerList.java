import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlayerList {
	private List<Player> players;
	//定义一个控制台属性用于频繁的输入属性
	private Scanner console;
	
	public PlayerList(){
		this.players = new ArrayList<Player>();
	}

	public void addPlayer(int num){
		for(int i = 0; i < num; i++){
			Integer ID;
			String name;
			System.out.println("请输入第" + (i+1) + "位玩家的ID和姓名：");
			while(true){
				System.out.println("输入ID：");
				console = new Scanner(System.in);
				try {
					ID = console.nextInt();
				} catch (Exception e) {
					System.out.println("请输入整形类型ID!");
					continue;
				}
				break;
			}	
			System.out.println("输入姓名：");
			name = console.next();
			
			//根据输入创建一个玩家对象
			Player player = new Player(ID, name);
			//添加刚创建的文件到玩家队伍
			players.add(player);
		}
	}
	
	public Player get(int i) {
		return players.get(i);
	}

	public void addPlayerHand(int index, int i, Integer ID){
		players.get(index).addPlayCards(i, ID);
	}
}
