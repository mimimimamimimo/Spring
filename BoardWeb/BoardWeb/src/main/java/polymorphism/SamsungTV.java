package polymorphism;

import org.springframework.stereotype.Component;


public class SamsungTV implements TV{
	private Speaker speaker;
	private int price;
	public SamsungTV(Speaker speaker,int price) {
		this.speaker=speaker;  //xml����
		this.price=price;
		System.out.println("����������");
	}
	public void powerOn(){
		System.out.println("�ＺŲ��. ����:"+price);
	}
public void powerOff(){
	System.out.println("�Ｚ����");
	}
public void volumeUp(){
	System.out.println("�Ｚ������");
	//speaker=new SonySpeaker();   
	speaker.volumeUp();
}
public void volumeDown(){
	System.out.println("�Ｚ�����ٿ�");
	//speaker=new SonySpeaker();   //�ٸ� Ŭ������ ����ĿŬ������ �������� ��������, �̷��� ���⼭ �ڵ�� �����ϸ� ����Ŀ �ٲٱ� ����� ��ü �� ���� �����Ǵ� ������ �������� �ٸ� �����λ���.
	speaker.volumeDown();
}
	public void initMethod(){  //xml���Ϻ���
		System.out.println("�Ｚ��ü �ʱ�ȭ��..");
	}
	public void destroyMethod(){
		System.out.println("�Ｚ��ü �ı��� ó����..");
	}
}
