package polymorphism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV{

	@Autowired   //�� ���� �����Ҷ� ������ �������� ��ü ���� �־������� auto���� ���� �ص� ������ ���� �ʿ� ���� ���� �� �ִ°� ���߿��� �˾Ƽ� �־���(samsung�� �� ����)
	//��, �� ���� �����Ҷ� �����ڵ� ���� ���� �Ķ���� ������ constructor �� �־ �޾���µ� ������̼� ���� �װ� ��� �����ϳĴ°���. autowired�Ѵ��̰ž�
	//���� apple,�Ҵ� �Ѵ� ���� �������� �浹�������� �ϳ� xml�� �����صθ� auto�� ���ִ°ŷ� �����ǰ�, �׷��� �ϸ� xml �δ㵵 �ٿ�����.
	
	@Qualifier("apple")//��� ���� Ÿ�� �������� �ȵǴϱ� ���� ��Ȯ�� ������Ҷ� ������~
	private Speaker speaker;
	public void powerOn(){
		System.out.println("lgŲ��");
	}
	public void powerOff(){
		System.out.println("lg����");
		}
	public void volumeUp(){
		speaker.volumeUp();
		System.out.println("lg������");
	}
	public void volumeDown(){
		speaker.volumeDown();
		System.out.println("lg�����ٿ�");
	}
}
