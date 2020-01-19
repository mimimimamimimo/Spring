package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {

	public static void main(String[] args) {
		//TV samsungtv=new SamsungTV();
		//TV lgtv=new SamsungTV();
		//BeanFactory factory=new BeanFactory();
		//TV tv=(TV)factory.getBean(args[0]);  //��?��¥ ������������ �������� �迭����!!
		//tv.powerOn();   //����� args���°� Ŀ�ǵ�����̶� �ѿ��� �־������
		//tv.volumeUp();
	   //�������. ������ ���� �ڵ带 ����Ѵٴ°� ������ �ٲ� �� Ŭ������ ���� ����������Ѵٴ°� ���ϰ�, �װ�  ������ ������.

		
		
		
		//�� ���� ����ϰ� ������ BeanFactory��ſ� ��¥ �� �Ẹ��. ������ ������ �������������� �������� ���۵ȴ�
		AbstractApplicationContext factory2=new GenericXmlApplicationContext("applicationContext.xml");
		//generic~~ : ���Ͻý����̳� Ŭ������ο� �ִ� xml���� �ε�
		TV tv3=(TV)factory2.getBean("lg");
		tv3.powerOn();
		tv3.volumeUp();
		/*������ �����ϸ� ��ϵ� �� ��ü �ڵ����� ���� ������� �����ȴ�. ������ �� �ؿ� �� ���� ������ ��ü�� ������ �ȴ�
		tv3 �ڵ尡 �ؿ� ������ ��� �ɱ�?
		samsungŬ�������� ������Ʈ ������ ���ص״�. ������ getbean������ samsung���� ã���� �� ���̰� �׷� 
		������ ���� �ڵ尡 ��������ʴ´�. �ٵ� �׷��ٰ� �Ｚ�� ������ ������ ����ϸ� �Ｚtv�����Ǹ鼭
		������ �۵��ؼ� ����Ŀ�� �־���ϴµ� �Ķ���͸� �޴� �κ��� auto�� �ؾߵǼ� �Ҵϵ� ���������Ѵ�. 
		�� ����ϸ� ������ ���� �����ǰ� �������ִ°ŵ� ���� ��ϵǴϱ� ��Ͻ� ����~
		*/
		TV tv2=(TV)factory2.getBean("samsung");  //��?��¥ ������������ �������� �迭����!!
		tv2.powerOn();
		//�����Ű�� @�޷��ִ°� �ٷ� ��ü���� �Ѳ����� �ǰ� �ȵ��ִ°� �ȵǳ�.�޸� ���� �Ȼ��⳪..
		
		factory2.close(); //�����̳� ���丮																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																�� ����
	}

}
