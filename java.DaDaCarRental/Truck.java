package com.imooc;

public class Truck extends ACar{
    public Truck(String aname, int aprice, int agoods){
        name = aname;
        goods = agoods;
        pricePerDay = aprice;
    }
  //��ɳ��󷽷�
    public void showInfo(){
        System.out.println(name + "\t\t" + pricePerDay + "Ԫ/��\t" + 
                           "�ػ���" + goods + "��");
    }

}