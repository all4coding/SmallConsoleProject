package com.imooc;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        //创建可租车对象数组
        ACar[] carRental = {new Passenger("奥迪A4", 500, 4), new Passenger("马自达6", 400, 4),
                            new Pickup("皮卡雪6", 450, 2, 4), new Passenger("金龙", 800, 20),
                            new Truck("松花江", 400, 4), new Truck("依维柯", 1000, 20)};
        //显示与流程            
        System.out.println("欢迎使用答答租车系统：");
        System.out.println("您是否要租车：1是 0否");
        Scanner input = new Scanner(System.in);
        int needRent = input.nextInt();
        if(0 == needRent){
            return;
        }
        
        System.out.println("\n您可租车的类型及价目表：");
        System.out.println("序号\t汽车名称\t\t租金\t\t容量");
        for(int i = 0; i < carRental.length; i++){
            System.out.print(i+1 + ".\t");
            carRental[i].showInfo();
        }
        
        System.out.println("\n请输入您要租车的数量:");
        int num = input.nextInt();
        
        double totalPrice = 0;
        int totalPeople = 0;
        double totalGoods = 0;
        //存放消费者选的车的序号，并转换为数组的下标，便于后续的遍历使用
        int[] carIndex = new int[num];
        for(int i = 0; i < num; i++){
            System.out.println("请输入第 " + (i+1) + " 一辆车的序号:");
            int n = input.nextInt();
            carIndex[i] = n-1;
            //不必区分车型，因为所有车型都继承了父类的所有成员变量，不用的变量被初始化为 0，所以不会有干扰
            totalPrice += carRental[n-1].pricePerDay;
            totalGoods += carRental[n-1].goods;
            totalPeople += carRental[n-1].people;
        }
        System.out.println("\n请输入租车天数:");
        int days = input.nextInt();
        
        System.out.println("\n您的账单:");
        System.out.println("\n***可载人的车有:");
        for(int i = 0; i < num; i++){
            if(carRental[carIndex[i]].people != 0){
                System.out.print(carRental[carIndex[i]].name + " ");
            }
        }
        System.out.println("共载人:" + totalPeople + "人");
        //遍历一遍消费者选的车型数组，根据 goods 变量是否为 0 来判断是否为载货车
        System.out.println("\n***载货的车有:");
        for(int i = 0; i < num; i++){
            if(carRental[carIndex[i]].goods != 0){
                System.out.print(carRental[carIndex[i]].name + " ");
            }
        }
        System.out.println("共载货:" + totalGoods + "吨");
        
        System.out.println("***租车总价格:" + totalPrice*days + "元");
        
    }
}