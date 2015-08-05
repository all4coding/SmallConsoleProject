import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * ע�⣺
 * ���Map������DeckMap������key�����֣�value�ǻ�ɫ
 * ��DeckMap��key���Ƶ���ţ�value���˿��ƶ���
 * 
 * �Ľ���
 * �������֣�������Ʋ������㣬���������
 * ����������Ʋ���������
 * �����������ӳ�伯�ź��򣬻�����DeckMap��key���Ƶ���ţ�value���˿��ƶ���
 * �����ļ�ֵ����Ƹ�����
 * 
 * �ٴθĽ�:
 * ��û��Ҫ��Map��ֱ�Ӵ�ID�ͺ��ˣ���Ϊ�˿��Ѿ����˿˼�ֵ�Գ�����
 * ��Ψһ��ID�ź��˿˶�Ӧ
 * ����ID������һ�У�û��Ҫ�ٴ洢����Ķ���
 */
public class HandMap {
	private List<Integer> hands;
	/**
	 * �ڹ�������ʵ����List�ӿ����͵Ķ���
	 */
	public HandMap(){
		this.hands = new ArrayList<Integer>();
	}
	
	public void handsPut(Integer ID){
		hands.add(ID);
	}
	
	public int size() {
		return hands.size();
	}
	
	public void handsSort(){
		Collections.sort(this.hands);
	}

	public Integer get(int j) {
		// TODO Auto-generated method stub
		return hands.get(j);
	}
}
