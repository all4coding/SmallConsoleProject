package com.imooc;

public class Pickup extends ACar{
    public Pickup(String aname, int aprice, int agoods, int apeople){
        name = aname;
        goods = agoods;
        people = apeople;
        pricePerDay = aprice;
    }
  //完成抽象方法
    public void showInfo(){
        System.out.println(name + "\t\t" + pricePerDay + "元/天\t" + 
                           "载人：" + people + "人 " + "载货：" + goods + "吨");
    }
}