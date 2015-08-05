
public class BeingPlayGame {
	/**
	 * 游戏属性
	 */
	private static DeckMap decks = new DeckMap();;
	private static PlayerList players = new PlayerList();
	private static DeckList deckList = new DeckList();
	
	final static int NPLAYER = 2;	//玩家数量，避免魔数
	final static int NCARD = 2;		//手牌数量
	/**
	 * @param args
	 * 思路：
	 * 1. 先创建各个类
	 * 2. 再在主方法中写出各个接口方法的调用
	 *    1. 提示信息均在方法中实现，主方法中只出现方法调用和异常处理
	 * 3. 根据接口填充各个类
	 * 4. 调试
	 * 
	 * 5. 为便于调试，所有方法均定义为静态
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
		System.out.println("------------开始洗牌---------------");
		deckList.shuffleDeckList(decks.size());
		System.out.println("------------洗牌结束！-------------");
	}
	
	public static void createPlayers(){
		System.out.println("------------创建玩家---------------");
		players.addPlayer(NPLAYER);
		for(int i = 0; i < NPLAYER; i++){
			System.out.println("---欢迎玩家：" + players.get(i).getname());
		}
	}
	
	public static void dealDecks(){
		System.out.println("------------开始发牌---------------");
		int deckListIndex = 0;
		for(int i = 0; i < NCARD; i++){
			for(int j = 0; j < NPLAYER; j++){
				System.out.println("玩家："+players.get(i).getname()+"-拿牌");				
				players.addPlayerHand(j, deckList.get(deckListIndex));
				deckListIndex++;
			}
		}
		System.out.println("------------发牌结束！-------------");

		//玩家整理手牌，按从小到大的顺序排列
		for(int i = 0; i < NPLAYER; i++){
			players.get(i).gethands().handsSort();
		}
	}
	
	/**
	 * 游戏涉及到比较大小大小的操作，而且不是自然顺序
	 * 所以调用Comparator接口
	 * 
	 * HandMap改进后：
	 * 因为对手牌数据结构做了重新设计
	 * 可以直接调用sort方法了
	 */
	public static void letsGO(){
		System.out.println("------------开始游戏---------------");
		
		for(int i = 0; i < NPLAYER; i++){
			System.out.println("玩家："+players.get(i)+"最大手牌为：" + 
					decks.get(players.get(i).gethands().get(NCARD-1)).getcolor() + 
					decks.get(players.get(i).gethands().get(NCARD-1)).getnumber());				
		}
		
		int win = 0;
		if(players.get(0).gethands().get(NCARD-1) < players.get(1).gethands().get(NCARD-1)){
			win = 1;
		}
		System.out.println("------------玩家：" + players.get(win).getname() + "获胜！---------------");
		System.out.println("玩家各自的手牌为：");
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
		System.out.println("------------创建扑克牌------------");
		decks.decksPut(0, "2", "黑桃");
		decks.decksPut(1, "2", "红桃");
		decks.decksPut(2, "2", "梅花");
		decks.decksPut(3, "2", "方块");
		decks.decksPut(4, "3", "黑桃");
		decks.decksPut(5, "3", "红桃");
		decks.decksPut(6, "3", "梅花");
		decks.decksPut(7, "3", "方块");
		decks.decksPut(8, "4", "黑桃");
		decks.decksPut(9, "4", "红桃");
		decks.decksPut(10, "4", "梅花");
		decks.decksPut(11, "4", "方块");
		decks.decksPut(12, "5", "黑桃");
		decks.decksPut(13, "5", "红桃");
		decks.decksPut(14, "5", "梅花");
		decks.decksPut(15, "5", "方块");
		decks.decksPut(16, "6", "黑桃");
		decks.decksPut(17, "6", "红桃");
		decks.decksPut(18, "6", "梅花");
		decks.decksPut(19, "6", "方块");
		decks.decksPut(20, "7", "黑桃");
		decks.decksPut(21, "7", "红桃");
		decks.decksPut(22, "7", "梅花");
		decks.decksPut(23, "7", "方块");
		decks.decksPut(24, "8", "黑桃");
		decks.decksPut(25, "8", "红桃");
		decks.decksPut(26, "8", "梅花");
		decks.decksPut(27, "8", "方块");
		decks.decksPut(28, "9", "黑桃");
		decks.decksPut(29, "9", "红桃");
		decks.decksPut(30, "9", "梅花");
		decks.decksPut(31, "9", "方块");
		decks.decksPut(32, "10", "黑桃");
		decks.decksPut(33, "10", "红桃");
		decks.decksPut(34, "10", "梅花");
		decks.decksPut(35, "10", "方块");
		decks.decksPut(36, "J", "黑桃");
		decks.decksPut(37, "J", "红桃");
		decks.decksPut(38, "J", "梅花");
		decks.decksPut(39, "J", "方块");
		decks.decksPut(40, "Q", "黑桃");
		decks.decksPut(41, "Q", "红桃");
		decks.decksPut(42, "Q", "梅花");
		decks.decksPut(43, "Q", "方块");
		decks.decksPut(44, "K", "黑桃");
		decks.decksPut(45, "K", "红桃");
		decks.decksPut(46, "K", "梅花");
		decks.decksPut(47, "K", "方块");
		decks.decksPut(48, "A", "黑桃");
		decks.decksPut(49, "A", "红桃");
		decks.decksPut(50, "A", "梅花");
		decks.decksPut(51, "A", "方块");
		System.out.println("------------扑克牌创建成功！-------");
		//return decks;
	}
	
	
	public static void printDecs(){
		System.out.print("为:[");
		int i = 0;
		for(i = 0; i < decks.size() - 1; i++){
			System.out.print(decks.get(i).getcolor() + decks.get(i).getnumber() + ", ");
		}
		System.out.println(decks.get(i).getcolor() + decks.get(i).getnumber() + "]");
	}
}
