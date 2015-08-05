import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PlayerList {
	private List<Player> players;
	//����һ������̨��������Ƶ������������
	private Scanner console;
	
	public PlayerList(){
		this.players = new ArrayList<Player>();
	}

	public void addPlayer(int num){
		for(int i = 0; i < num; i++){
			Integer ID;
			String name;
			System.out.println("�������" + (i+1) + "λ��ҵ�ID��������");
			while(true){
				System.out.println("����ID��");
				console = new Scanner(System.in);
				try {
					ID = console.nextInt();
				} catch (Exception e) {
					System.out.println("��������������ID!");
					continue;
				}
				break;
			}	
			System.out.println("����������");
			name = console.next();
			
			//�������봴��һ����Ҷ���
			Player player = new Player(ID, name);
			//��Ӹմ������ļ�����Ҷ���
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
