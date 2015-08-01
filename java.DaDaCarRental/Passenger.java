package com.imooc;

public class Passenger extends ACar{
    public Passenger(String aname, int aprice, int apeople){
        name = aname;
        people = apeople;
        pricePerDay = aprice;
    }
    //完成抽象方法
    public void showInfo(){
        System.out.println(name + "\t\t" + pricePerDay + "元/天\t" + 
                           "载人：" + people + "人");
    }
}