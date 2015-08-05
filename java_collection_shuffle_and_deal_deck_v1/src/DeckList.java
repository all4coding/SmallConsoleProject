import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 这个序列定义的一组抽象的序列，相当于牌的序号
 * @author dc
 *
 */

public class DeckList {
	private List<Integer>  deckList;
	
	public DeckList(){
		deckList = new ArrayList<Integer>();
	}
	public void shuffleDeckList(int num){
		//Q: 提示要初始化局部变量，但有的地方好像不初始化也没事？
		Integer k = 0;
		//随机对象
		Random random = new Random();
		for(int i = 0; i < num; i++){
			do{
				k = random.nextInt(num);
			}while(deckList.contains(k));
			//注意：遇到for循环时，要注意是在循环外还是在循环内，否则出现bug很难知道
			deckList.add(k);
		}	
	}
	public Integer get(int deckListIndex) {
		return deckList.get(deckListIndex);
	}
}
