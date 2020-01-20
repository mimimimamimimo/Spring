package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service  //service �־�� �˻�����
@Aspect
public class LogAdvice {
	
	
	public void printlog() {
		System.out.println("����Ͻ���������������");
	}
	
	
	@Pointcut("excution(* com.springbook.biz..*Impl.*(..))")  //����Ʈ��
	public void all2Pointcut() {}
	@Before("all2Pointcut()")   //�����̽�
	public void getPointcut() {
		System.out.println("������̼�-����Ͻ���������������");
		
	}
	
	//�ֽ���Ʈ�� ����Ʈ�ư� �����̽��� �����̴�
}
