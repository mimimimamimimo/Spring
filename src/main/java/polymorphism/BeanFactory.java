package polymorphism;

public class BeanFactory {  //�̰� �� �����ڵ带 �ٿ��ִ°���..������ �� Ŭ���� �����ϰ� �̸��� ���ٹٲٴ°ǵ�.
	public Object getBean(String beanName) {  //���� �̸��ٲٴ°� �������� �ϸ鼭 �����ذ��� ����...
		if(beanName.equals("samsung")) {
			return new SamsungTV(new SonySpeaker(),270000);
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;  //�� �ƴҶ� null����
	}  //�̷� ���丮�� ���������� �����̳ʶ�� �ϰ�, �����̳� ����� �����ϴ�. �����̳ʴ� ��ġ ���� �����̳ʿ� ����ϴ�.
}   //���������� ��� �޼ҵ尡 ������� ���̴�. �����̳� ����Ϸ��� ������ ����ϰ�, ������������ sts�� �ڵ������� pom�� ������ ��� �߰����ְ�
//�������� ���������� ���������� aptx���� ���� ������ش�.
