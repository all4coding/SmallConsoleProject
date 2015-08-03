import java.util.Scanner;

public class ExceptionBookManager {
	private int[] bookNum = {1, 2, 3};
	private String[] bookName = {"集异壁", "构建之法", "挪威的森林"};

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
				System.out.println("图书不存在");
			}
		}
	}
	public void findBookNum(int num){
		for(int i = 0; i < bookName.length; i++){
			if(bookNum[i] == num){
				System.out.println("book:" + bookName[bookNum[i]]);
				break;
			}else{
				System.out.println("图书不存在");
			}
		}
	}
	public void getChoice(int choice) throws Exception{
		if(choice != 1 || choice != 2){
			throw new Exception("命令输入错误！请根据提示输入数字命令!");
		}
	}
	public int dealChoiceExc(int choice){
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
		System.out.println("输入命令：1-按照名称查找图书；2-按照序号查找图书");
		int choice = input.nextInt();
		//将原来的错误打印，以异常处理的方式输出
		while(true){
			int result = ebm.dealChoiceExc(choice);
			if(result == -1){
				System.out.println("输入命令：1-按照名称查找图书；2-按照序号查找图书");
				choice = input.nextInt();
				continue;
			}
			if(choice == 1){
				System.out.println("输入图书名称：");
				String name = input.next();
				ebm.findBookName(name);
			}else{
				System.out.println("输入图书序号");
				int num = input.nextInt();
				ebm.findBookNum(num);
			}			
			System.out.println("输入命令：1-按照名称查找图书；2-按照序号查找图书");
			choice = input.nextInt();
		}
	}	
}
