import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * ������ж����һ���������У��൱���Ƶ����
 * @author dc
 *
 */

public class DeckList {
	private List<Integer>  deckList;
	
	public DeckList(){
		deckList = new ArrayList<Integer>();
	}
	public void shuffleDeckList(int num){
		//Q: ��ʾҪ��ʼ���ֲ����������еĵط����񲻳�ʼ��Ҳû�£�
		Integer k = 0;
		//�������
		Random random = new Random();
		for(int i = 0; i < num; i++){
			do{
				k = random.nextInt(num);
			}while(deckList.contains(k));
			//ע�⣺����forѭ��ʱ��Ҫע������ѭ���⻹����ѭ���ڣ��������bug����֪��
			deckList.add(k);
		}	
	}
	public Integer get(int deckListIndex) {
		return deckList.get(deckListIndex);
	}
}
