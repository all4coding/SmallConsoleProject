package com.imooc;

public class Truck extends ACar{
    public Truck(String aname, int aprice, int agoods){
        name = aname;
        goods = agoods;
        pricePerDay = aprice;
    }
  //完成抽象方法
    public void showInfo(){
        System.out.println(name + "\t\t" + pricePerDay + "元/天\t" + 
                           "载货：" + goods + "吨");
    }

}