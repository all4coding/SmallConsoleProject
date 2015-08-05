
public class BeingPlayGame {
	/**
	 * ��Ϸ����
	 */
	private static DeckMap decks = new DeckMap();;
	private static PlayerList players = new PlayerList();
	private static DeckList deckList = new DeckList();
	
	final static int NPLAYER = 2;	//�������������ħ��
	final static int NCARD = 2;		//��������
	/**
	 * @param args
	 * ˼·��
	 * 1. �ȴ���������
	 * 2. ������������д�������ӿڷ����ĵ���
	 *    1. ��ʾ��Ϣ���ڷ�����ʵ�֣���������ֻ���ַ������ú��쳣����
	 * 3. ���ݽӿ���������
	 * 4. ����
	 * 
	 * 5. Ϊ���ڵ��ԣ����з���������Ϊ��̬
	 */
	public static void main(String[] args) {
		createDecks();
		printDecs();
		shuffleDecks(decks);
		createPlayers();
		dealDecks();
		letsGO();
	}
	
	public static void shuffleDecks(DeckMap decks){
		System.out.println("------------��ʼϴ��---------------");
		deckList.shuffleDeckList(decks.size());
		System.out.println("------------ϴ�ƽ�����-------------");
	}
	
	public static void createPlayers(){
		System.out.println("------------�������---------------");
		players.addPlayer(NPLAYER);
		for(int i = 0; i < NPLAYER; i++){
			System.out.println("---��ӭ��ң�" + players.get(i).getname());
		}
	}
	
	public static void dealDecks(){
		System.out.println("------------��ʼ����---------------");
		int deckListIndex = 0;
		for(int i = 0; i < NCARD; i++){
			for(int j = 0; j < NPLAYER; j++){
				System.out.println("��ң�"+players.get(i).getname()+"-����");				
				players.addPlayerHand(j, deckList.get(deckListIndex));
				deckListIndex++;
			}
		}
		System.out.println("------------���ƽ�����-------------");

		//����������ƣ�����С�����˳������
		for(int i = 0; i < NPLAYER; i++){
			players.get(i).gethands().handsSort();
		}
	}
	
	/**
	 * ��Ϸ�漰���Ƚϴ�С��С�Ĳ��������Ҳ�����Ȼ˳��
	 * ���Ե���Comparator�ӿ�
	 * 
	 * HandMap�Ľ���
	 * ��Ϊ���������ݽṹ�����������
	 * ����ֱ�ӵ���sort������
	 */
	public static void letsGO(){
		System.out.println("------------��ʼ��Ϸ---------------");
		
		for(int i = 0; i < NPLAYER; i++){
			System.out.println("��ң�"+players.get(i)+"�������Ϊ��" + 
					decks.get(players.get(i).gethands().get(NCARD-1)).getcolor() + 
					decks.get(players.get(i).gethands().get(NCARD-1)).getnumber());				
		}
		
		int win = 0;
		if(players.get(0).gethands().get(NCARD-1) < players.get(1).gethands().get(NCARD-1)){
			win = 1;
		}
		System.out.println("------------��ң�" + players.get(win).getname() + "��ʤ��---------------");
		System.out.println("��Ҹ��Ե�����Ϊ��");
		int i = 0;
		int j = 0;
		for(i = 0; i < NPLAYER; i++){
			System.out.print(players.get(i) + ":[");
			for(j = 0; j < NCARD-1; j++){
				System.out.print(decks.get(players.get(i).gethands().get(j)).getcolor() + 
						decks.get(players.get(i).gethands().get(j)).getnumber() + ", ");
				
			}
			System.out.print(decks.get(players.get(i).gethands().get(j)).getcolor() + 
					decks.get(players.get(i).gethands().get(j)).getnumber() + "]");
		}
	}

	public static void createDecks(){
		System.out.println("------------�����˿���------------");
		decks.decksPut(0, "2", "����");
		decks.decksPut(1, "2", "����");
		decks.decksPut(2, "2", "÷��");
		decks.decksPut(3, "2", "����");
		decks.decksPut(4, "3", "����");
		decks.decksPut(5, "3", "����");
		decks.decksPut(6, "3", "÷��");
		decks.decksPut(7, "3", "����");
		decks.decksPut(8, "4", "����");
		decks.decksPut(9, "4", "����");
		decks.decksPut(10, "4", "÷��");
		decks.decksPut(11, "4", "����");
		decks.decksPut(12, "5", "����");
		decks.decksPut(13, "5", "����");
		decks.decksPut(14, "5", "÷��");
		decks.decksPut(15, "5", "����");
		decks.decksPut(16, "6", "����");
		decks.decksPut(17, "6", "����");
		decks.decksPut(18, "6", "÷��");
		decks.decksPut(19, "6", "����");
		decks.decksPut(20, "7", "����");
		decks.decksPut(21, "7", "����");
		decks.decksPut(22, "7", "÷��");
		decks.decksPut(23, "7", "����");
		decks.decksPut(24, "8", "����");
		decks.decksPut(25, "8", "����");
		decks.decksPut(26, "8", "÷��");
		decks.decksPut(27, "8", "����");
		decks.decksPut(28, "9", "����");
		decks.decksPut(29, "9", "����");
		decks.decksPut(30, "9", "÷��");
		decks.decksPut(31, "9", "����");
		decks.decksPut(32, "10", "����");
		decks.decksPut(33, "10", "����");
		decks.decksPut(34, "10", "÷��");
		decks.decksPut(35, "10", "����");
		decks.decksPut(36, "J", "����");
		decks.decksPut(37, "J", "����");
		decks.decksPut(38, "J", "÷��");
		decks.decksPut(39, "J", "����");
		decks.decksPut(40, "Q", "����");
		decks.decksPut(41, "Q", "����");
		decks.decksPut(42, "Q", "÷��");
		decks.decksPut(43, "Q", "����");
		decks.decksPut(44, "K", "����");
		decks.decksPut(45, "K", "����");
		decks.decksPut(46, "K", "÷��");
		decks.decksPut(47, "K", "����");
		decks.decksPut(48, "A", "����");
		decks.decksPut(49, "A", "����");
		decks.decksPut(50, "A", "÷��");
		decks.decksPut(51, "A", "����");
		System.out.println("------------�˿��ƴ����ɹ���-------");
		//return decks;
	}
	
	
	public static void printDecs(){
		System.out.print("Ϊ:[");
		int i = 0;
		for(i = 0; i < decks.size() - 1; i++){
			System.out.print(decks.get(i).getcolor() + decks.get(i).getnumber() + ", ");
		}
		System.out.println(decks.get(i).getcolor() + decks.get(i).getnumber() + "]");
	}
}
