package com.imooc;

public class Passenger extends ACar{
    public Passenger(String aname, int aprice, int apeople){
        name = aname;
        people = apeople;
        pricePerDay = aprice;
    }
    //��ɳ��󷽷�
    public void showInfo(){
        System.out.println(name + "\t\t" + pricePerDay + "Ԫ/��\t" + 
                           "���ˣ�" + people + "��");
    }
}