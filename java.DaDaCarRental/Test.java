package com.imooc;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        //�������⳵��������
        ACar[] carRental = {new Passenger("�µ�A4", 500, 4), new Passenger("���Դ�6", 400, 4),
                            new Pickup("Ƥ��ѩ6", 450, 2, 4), new Passenger("����", 800, 20),
                            new Truck("�ɻ���", 400, 4), new Truck("��ά��", 1000, 20)};
        //��ʾ������            
        System.out.println("��ӭʹ�ô���⳵ϵͳ��");
        System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");
        Scanner input = new Scanner(System.in);
        int needRent = input.nextInt();
        if(0 == needRent){
            return;
        }
        
        System.out.println("\n�����⳵�����ͼ���Ŀ��");
        System.out.println("���\t��������\t\t���\t\t����");
        for(int i = 0; i < carRental.length; i++){
            System.out.print(i+1 + ".\t");
            carRental[i].showInfo();
        }
        
        System.out.println("\n��������Ҫ�⳵������:");
        int num = input.nextInt();
        
        double totalPrice = 0;
        int totalPeople = 0;
        double totalGoods = 0;
        //���������ѡ�ĳ�����ţ���ת��Ϊ������±꣬���ں����ı���ʹ��
        int[] carIndex = new int[num];
        for(int i = 0; i < num; i++){
            System.out.println("������� " + (i+1) + " һ���������:");
            int n = input.nextInt();
            carIndex[i] = n-1;
            //�������ֳ��ͣ���Ϊ���г��Ͷ��̳��˸�������г�Ա���������õı�������ʼ��Ϊ 0�����Բ����и���
            totalPrice += carRental[n-1].pricePerDay;
            totalGoods += carRental[n-1].goods;
            totalPeople += carRental[n-1].people;
        }
        System.out.println("\n�������⳵����:");
        int days = input.nextInt();
        
        System.out.println("\n�����˵�:");
        System.out.println("\n***�����˵ĳ���:");
        for(int i = 0; i < num; i++){
            if(carRental[carIndex[i]].people != 0){
                System.out.print(carRental[carIndex[i]].name + " ");
            }
        }
        System.out.println("������:" + totalPeople + "��");
        //����һ��������ѡ�ĳ������飬���� goods �����Ƿ�Ϊ 0 ���ж��Ƿ�Ϊ�ػ���
        System.out.println("\n***�ػ��ĳ���:");
        for(int i = 0; i < num; i++){
            if(carRental[carIndex[i]].goods != 0){
                System.out.print(carRental[carIndex[i]].name + " ");
            }
        }
        System.out.println("���ػ�:" + totalGoods + "��");
        
        System.out.println("***�⳵�ܼ۸�:" + totalPrice*days + "Ԫ");
        
    }
}