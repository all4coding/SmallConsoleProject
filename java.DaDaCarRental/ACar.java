package com.imooc;
//�� ACar ����Ϊ�����࣬��Ϊ����Ҫֱ�ӵ��ø�������Ժͷ���
public abstract class ACar{
	//�������г�Ա�����ᱻ����̳У����ұ��Զ���ʼ��Ϊ 0
	//��������ص㣬����ÿ������ֱ�ӵ��� goods �� people��
	//������Ҫ�ж����ػ��Ļ������˵ġ�
    protected double goods;
    protected int people;
    protected double pricePerDay;
    protected String name;
    //����һ����ʾ������Ϣ�ķ���������������
    public abstract void showInfo();
}