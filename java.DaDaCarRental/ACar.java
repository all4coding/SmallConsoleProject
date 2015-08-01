package com.imooc;
//将 ACar 定义为抽象类，因为不需要直接调用该类的属性和方法
public abstract class ACar{
	//父类所有成员变量会被子类继承，并且被自动初始化为 0
	//利用这个特点，可以每个类型直接调用 goods 和 people，
	//而不需要判断是载货的还是载人的。
    protected double goods;
    protected int people;
    protected double pricePerDay;
    protected String name;
    //定义一个显示车辆信息的方法，避免逐个输出
    public abstract void showInfo();
}