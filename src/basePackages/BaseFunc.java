package basePackages;

import java.util.concurrent.TimeUnit;

public class BaseFunc {
//������
//*���� ���� ������ 
	
//	countCh2 �޼���
	public static void countCh2(String mes){
//	- �⺻������ ���� ��� �ϴ� ������ �޼ҵ�  
//	- �� ���ھ� ���
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(200000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println();
	}
	
//	countCh2NoLn �޼���
	public static void countCh2NoLn(String mes){
//	- �⺻������ ���� ��� �ϴ� ������ �޼ҵ� 
//	- �� ���ھ� ���
//	- ������ �� �ٲ� ����
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(200000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//	countCh1 �޼���
	public static void countCh1(String mes) {
//	- ���� ������ �޼ҵ� 
//	- �� ���ھ� ���
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(2000000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		 System.out.println();
	}	
	
// countCh1NoLn �޼���
	public static void countCh1NoLn(String mes) {
//	- ���� ������ �޼ҵ� 
//	- �� ���ھ� ���
//	- ������ �� �ٲ� ����
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(2000000000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
	
//	countCh �޼���
	public static void countCh(String mes) {
//	- ���� ������ �޼ҵ� 
//	- �� ���ھ� ���
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(99900000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println();
	}
//	countChNoLn �޼���
	public static void countChNoLn(String mes) {
//	- ���� ������ �޼ҵ� 
//	- �� ���ھ� ���
//	- ������ �� �ٲ� ����
		try {
			for (int i = 0; i < mes.length(); i++) {
				TimeUnit.NANOSECONDS.sleep(99900000);
				System.out.print(mes.charAt(i));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//*���� ���� ������
//	countStr �޼���
	public static void countStr(String mes) {
//	- �⺻������ ���� ��� �ϴ� ������ �޼ҵ� 
//	- �Ű������� ���� ���ڿ� ���� ���
		try {
			TimeUnit.NANOSECONDS.sleep(1000000000);			
			System.out.println(mes);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

//	countStrNoLn�޼���
	public static void countStrNoLn(String mes) {
//	- �⺻������ ���� ��� �ϴ� ������ �޼ҵ� 
//	- �Ű������� ���� ���ڿ� ���� ���
//	- ������ �� �ٲ� ����
		try {
			TimeUnit.NANOSECONDS.sleep(1000000000);			
			System.out.print(mes);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//	count�޼���
	public static void count() {
//	- ������ �޼ҵ� 
//	- �������ϴ� ��ɸ� �ִ� �޼ҵ�
//	- �Ű� ������ ����.
		try {
			TimeUnit.NANOSECONDS.sleep(1000000000);			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
//����
//	margin20�޼���
	public static void margin20() {
//	- 20���� ������ �ִ� �޼ҵ�
		for(int i=0; i<=20; i++) {
			System.out.println();
		}
	}
//	margin10�޼���
	public static void margin10() {
//	- 10���� ������ �ִ� �޼ҵ�
		for(int i=0; i<=10; i++) {
			System.out.println();
		}
	}
//	margin5�޼���
	public static void margin5() {
//	- 5���� ������ �ִ� �޼ҵ�
		for(int i=0; i<=10; i++) {
			System.out.println();
		}
	}
}
