package com.imooc;

public class Pickup extends ACar{
    public Pickup(String aname, int aprice, int agoods, int apeople){
        name = aname;
        goods = agoods;
        people = apeople;
        pricePerDay = aprice;
    }
  //��ɳ��󷽷�
    public void showInfo(){
        System.out.println(name + "\t\t" + pricePerDay + "Ԫ/��\t" + 
                           "���ˣ�" + people + "�� " + "�ػ���" + goods + "��");
    }
}