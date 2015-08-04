//import java.util.InputMismatchException;
import java.util.Scanner;
//import java.io.*;	//没有用到的类不要导入

public class ExceptionBookManager {
	//private static int[] bookNum = {1, 2, 3};
	private static String[] book = { "C语言", "数据结构", "汇编语言", "高数", "大学语文", "毛概" };
	//该系统输入频繁，所以定义一个控制台属性，用于接受用户输入命令；
	//private static int console; [X]
	//注意：控制台应该是一个输入对象，而不是具体的返回变量
	private static Scanner console;
	
	public static void main(String[] args) {		
		//定义一个死循环模拟系统在线
		String name;
		while(true){
			try {
				while(true){
					System.out.println("请输入查询方式：1-查询图书名；2-查询图书序号");
					int result = inputCommand();
					switch(result){
					case 1:
						name = getBookByName();
						System.out.println("book:"+name);
						break;
					case 2:
						name = getBookByNumber();
						System.out.println("book:"+name);
						break;
					case -1:
						System.out.println("错误命令异常！请输入正确的数字命令！");
						continue;
					default:	//其他的任何返回值都属于错误命令异常
						System.out.println("错误命令异常！请输入正确的数字命令！");
						continue;
					}
				}		
			} catch (Exception e) {
				//捕获图书获取方法抛出的异常
				System.out.println(e.getMessage());
			}
		}		
	}
	//根据模块一的选择，进入图书名查询模块，所有跟此相关的操作均应该放到这个方法里面
	//图书不存在，均返回到模块一的选择
	private static String getBookByName()
			throws Exception{
		System.out.println("请输入图书名：");
		console = new Scanner(System.in);
		String name = console.next();
		//如果想不起来try-catch，说明不需要这个
		for(int i = 0; i < book.length; i++){
			if(book[i].equals(name)){
				return name;
			}
		}
		//直接抛出new的异常信息给调用者main()
		throw new Exception("图书不存在！请重新输入！");
	}
	//根据模块一的选择，进入图书序号查询模块
	private static String getBookByNumber()
			throws Exception{	//对应 new Exception
		//String name;
		while(true){
			System.out.println("请输入图书序号：");
			//将整个输入命令方法调用过程放大 try块中，而不是仅仅将一部分设计异常的部分加入 try块
			try {
				console = new Scanner(System.in);
				int index = inputCommand();
				//处理返回的输入异常
				if(index == -1){
					System.out.println("错误命令异常！请输入正确的数字命令！");
					continue;
				}
				//输入命令没有异常则进入数组越界异常捕获包装
				String name = book[index-1];
				return name;
			} catch (ArrayIndexOutOfBoundsException e) {
				Exception notExist = new Exception("图书不存在！请重新输入！");
				notExist.initCause(e);
				throw notExist;
			}
			/*
			System.out.println("请输入图书序号：");
			//console = new Scanner(System.in);	//每个方法里均要重新定义输入对象
			int num = inputcommand();
			if(num == -1){
				System.out.println("请输入查询方式：1-查询图书名；2-查询图书序号");
				continue;
			}else{
				try {
					name = book[num - 1];
				} catch (ArrayIndexOutOfBoundsException e) {
					Exception bookNotExists = new Exception("图书不存在！请重新输入！");
					bookNotExists.initCause(e);
					throw bookNotExists;
				}
				
			}
			*/
		}	
	}
	
	
	//定义成static便于main直接调用该方法，访问属性设置为private也就是只有本类有权访问
	//将接受输入和异常处理统一放到方法中
	//注意返回方式
	private static int inputCommand() {
		//在try-catch外面定义变量
		int command;
		try {
			console = new Scanner(System.in);
			command = console.nextInt();
		} catch (Exception e) {
			//System.out.println("错误命令异常！请输入正确的数字命令！");
			console = new Scanner(System.in);
			return -1;
		}
		return command;
	}
}