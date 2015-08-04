//import java.util.InputMismatchException;
import java.util.Scanner;
//import java.io.*;	//û���õ����಻Ҫ����

public class ExceptionBookManager {
	//private static int[] bookNum = {1, 2, 3};
	private static String[] book = { "C����", "���ݽṹ", "�������", "����", "��ѧ����", "ë��" };
	//��ϵͳ����Ƶ�������Զ���һ������̨���ԣ����ڽ����û��������
	//private static int console; [X]
	//ע�⣺����̨Ӧ����һ��������󣬶����Ǿ���ķ��ر���
	private static Scanner console;
	
	public static void main(String[] args) {		
		//����һ����ѭ��ģ��ϵͳ����
		String name;	//�ŵ�while{}����������
		while(true){
			System.out.println("�������ѯ��ʽ��1-��ѯͼ������2-��ѯͼ�����");
			try {
				//System.out.println("�������ѯ��ʽ��1-��ѯͼ������2-��ѯͼ�����");
				//��һ�зŵ�try�����棬try������ŵ��õķ���
				//ȡ����������
				int command = inputCommand();
				switch(command){
				case 1:	//����ͼ������ѡ��ͼ��
					name = getBookByName();
					System.out.println("book:"+name);
					break;
				case 2:	//����ͼ����ţ������±꣩ѡ��ͼ�� 
					name = getBookByNumber();
					System.out.println("book:"+name);
					break;
				case -1:
					//����ֵΪ-1��˵���������쳣������쳣ͨ������ֵ�ķ�ʽ���ϲ���ô���
					//��Ϊģ��һ����main()�й�����
					//�������뺯���������𷵻�״̬���쳣������Ƿ���һ��-1
					System.out.println("���������쳣����������ȷ���������");
					continue;
				default:	//�������κη���ֵ����Ϊ���ڴ��������쳣
					System.out.println("���������쳣����������ȷ���������");
					continue;
				}
			}catch (Exception e) {
				//����ͼ���ȡ�����׳����쳣
				System.out.println(e.getMessage());
			}
		}
	}
	//����ģ��һ��ѡ�񣬽���ͼ������ѯģ�飬���и�����صĲ�����Ӧ�÷ŵ������������
	//ͼ�鲻���ڣ������ص�ģ��һ��ѡ��
	private static String getBookByName()
			throws Exception{
		System.out.println("������ͼ������");
		console = new Scanner(System.in);
		String name = console.next();
		//����벻����try-catch��˵������Ҫ���
		for(int i = 0; i < book.length; i++){
			if(book[i].equals(name)){
				return name;
			}
		}
		//ֱ���׳�new���쳣��Ϣ�����ظ�������main()
		throw new Exception("ͼ�鲻���ڣ����������룡");
	}
	//����ģ��һ��ѡ�񣬽���ͼ����Ų�ѯģ��
	private static String getBookByNumber()
			throws Exception{	//��Ӧ new Exception
		//String name;
		while(true){
			//��ʾ��Ϣ����try������
			System.out.println("������ͼ����ţ�");
			//������������������ù��̷Ŵ� try���У������ǽ�����һ��������쳣�Ĳ��ּ��� try��
			try {
				console = new Scanner(System.in);
				int index = inputCommand();
				//�����ص������쳣����������ͼ�鲻�����쳣���ϲ���ô���
				if(index == -1){
					System.out.println("���������쳣����������ȷ���������");
					continue;
				}
				//��������û���쳣���������Խ���쳣�����װ
				String name = book[index-1];
				return name;
			} catch (ArrayIndexOutOfBoundsException e) {
				Exception notExist = new Exception("ͼ�鲻���ڣ����������룡");
				notExist.initCause(e);
				throw notExist;
			}
			/*
			System.out.println("������ͼ����ţ�");
			//console = new Scanner(System.in);	//ÿ���������Ҫ���¶����������
			int num = inputcommand();
			if(num == -1){
				System.out.println("�������ѯ��ʽ��1-��ѯͼ������2-��ѯͼ�����");
				continue;
			}else{
				try {
					name = book[num - 1];
				} catch (ArrayIndexOutOfBoundsException e) {
					Exception bookNotExists = new Exception("ͼ�鲻���ڣ����������룡");
					bookNotExists.initCause(e);
					throw bookNotExists;
				}
				
			}
			*/
		}	
	}
	
	
	//�����static����mainֱ�ӵ��ø÷�����������������ΪprivateҲ����ֻ�б�����Ȩ����
	//������������쳣����ͳһ�ŵ�������
	//ע�ⷵ�ط�ʽ
	//���������ȡ����
	private static int inputCommand() {
		//��try-catch���涨�����
		int command;
		try {
			console = new Scanner(System.in);
			command = console.nextInt();
		} catch (Exception e) {
			//System.out.println("���������쳣����������ȷ���������");
			console = new Scanner(System.in);
			return -1;
		}
		return command;
	}
}