import java.util.HashMap;
import java.util.Map;
/**
 * key���Ƶ���ţ�value���˿��ƶ���
 * @author dc
 *
 */

public class DeckMap {
	//����һ��Map��������
	private Map<Integer, Deck> decks;
	/**
	 * �ڹ�������ʵ����Map�ӿ����͵Ķ���
	 */
	public DeckMap(){
		this.decks = new HashMap<Integer, Deck>();
	}
	/**
	 * ����˿˵�decks��ȥ
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
