package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")  //�� ���� ����������. ���ص� ���ư����� ������ �ٺ��ҋ� �̷� ���̵�� ã�� �����̴�. error ������
public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("���� ����");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("���ó���");
	}

	@Override
	public void volumeDown() {
		System.out.println("���ó���");
	}
	
}
