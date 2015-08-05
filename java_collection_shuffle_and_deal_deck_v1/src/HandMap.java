import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 注意：
 * 这个Map区别于DeckMap，他的key是数字，value是花色
 * 而DeckMap的key是牌的序号，value是扑克牌对象
 * 
 * 改进：
 * 后来发现，这样设计并不方便，输出不方便
 * 而且这样设计不便于排序
 * 如果能在手牌映射集排好序，还是用DeckMap的key是牌的序号，value是扑克牌对象
 * 这样的键值对设计更合理
 * 
 * 再次改进:
 * 发没必要存Map，直接存ID就好了，因为扑克已经在扑克键值对池里了
 * 有唯一的ID号和扑克对应
 * 有了ID就有了一切，没必要再存储额外的东西
 */
public class HandMap {
	private List<Integer> hands;
	/**
	 * 在构造器中实例化List接口类型的对象
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
