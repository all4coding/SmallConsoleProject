import java.util.Scanner;

public class ExceptionBookManager {
	private int[] bookNum = {1, 2, 3};
	private String[] bookName = {"�����", "����֮��", "Ų����ɭ��"};

	public void printBookInfo(){
		for(int i = 0; i < bookName.length; i++){
			System.out.println(bookNum[i] + "\t" + bookName[i]);
		}
	}
	public void findBookName(String name){
		for(int i = 0; i < bookName.length; i++){
			if(bookName[i].equals(name)){
				System.out.println("book:" + bookName[i]);
				break;
			}else{
				System.out.println("ͼ�鲻����");
			}
		}
	}
	public void findBookNum(int num){
		for(int i = 0; i < bookName.length; i++){
			if(bookNum[i] == num){
				System.out.println("book:" + bookName[bookNum[i]]);
				break;
			}else{
				System.out.println("ͼ�鲻����");
			}
		}
	}
	public static void main(String[] args) {
		ExceptionBookManager ebm = new ExceptionBookManager();
		ebm.printBookInfo();
		Scanner input = new Scanner(System.in);
		System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��");
		int choice = input.nextInt();
		while(true){
			if(choice != 1 || choice != 2){
				System.out.println("������������������ʾ������������!");
			}else if(choice == 1){
				System.out.println("����ͼ�����ƣ�");
				String name = input.next();
				ebm.findBookName(name);
			}else{
				System.out.println("����ͼ�����");
				int num = input.nextInt();
				ebm.findBookNum(num);
			}			
			System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��");
			choice = input.nextInt();
		}
	}	
}
