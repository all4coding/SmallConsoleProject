import java.util.HashMap;
import java.util.Map;
/**
 * key是牌的序号，value是扑克牌对象
 * @author dc
 *
 */

public class DeckMap {
	//定义一个Map的类属性
	private Map<Integer, Deck> decks;
	/**
	 * 在构造器中实例化Map接口类型的对象
	 */
	public DeckMap(){
		this.decks = new HashMap<Integer, Deck>();
	}
	/**
	 * 添加扑克到decks中去
	 */
	public void decksPut(Integer ID, String number, String color){
		decks.put((Integer)ID, new Deck(number, color));
	}
	public int size() {
		return decks.size();
	}
	public Deck get(Integer ID) {
		return decks.get(ID);
	}
}
