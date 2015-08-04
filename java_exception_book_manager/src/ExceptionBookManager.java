import java.util.Scanner;
//import java.io.*;

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
				return;
			}
		}
		System.out.println("ͼ�鲻����");
	}
	public void findBookNum(int num){
		for(int i = 0; i < bookName.length; i++){
			if(bookNum[i] == num){
				System.out.println("book:" + bookName[i]);
				return;
			}
		}
		System.out.println("ͼ�鲻����");
	}
	public void getChoice(String choice) throws Exception{
		if(!choice.equals("1") && !choice.equals("2")){
			throw new Exception("������������������ʾ������������!");
		}
	}
	public int dealChoiceExc(String choice){
		try{
			getChoice(choice);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return -1;
		}
		return 1;
	}
	public static void main(String[] args) {
		ExceptionBookManager ebm = new ExceptionBookManager();
		ebm.printBookInfo();
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��");
		String choice = input.next();
		//��ԭ���Ĵ����ӡ�����쳣����ķ�ʽ���
		while(true){
			int result = ebm.dealChoiceExc(choice);
			if(result == -1){
				System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��");
				choice = input.next();
				continue;
			}
			if(choice.equals("1")){
				System.out.println("����ͼ�����ƣ�");
				String name = input.next();
				ebm.findBookName(name);
			}else{
				System.out.println("����ͼ�����");
				int num = input.nextInt();
				ebm.findBookNum(num);
			}			
			System.out.println("�������1-�������Ʋ���ͼ�飻2-������Ų���ͼ��");
			choice = input.next();
		}
	}	
}