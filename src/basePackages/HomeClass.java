package basePackages;

import java.util.Scanner;

import mainPackages.PrologueClass;

public class HomeClass {
	static Scanner sc = new Scanner(System.in);
	static String start = new String("�����ϱ�");
	static String man = new String("������");
	static String back = new String("���ư���");
//	homeIn�޼���
	public static void homeIn(){
//	- Ȩȭ�鿡�� ���� �Է¹���
		PrintMes.printHome();
		String chooseM="";
		chooseM = sc.next();
		homeChoose(chooseM);
	}
//	manner�޼���
	public static void manner(){
//	- ����ȭ��ǥ�� �� ���� �Է¹���	
		PrintMes.printManner();
		String chooseM=" ";
		chooseM = sc.next();
		homeChoose(chooseM);
	}
//	homeChoose�޼���
	public static void homeChoose(String choose){
//	- ��gameOverIn������ ���� �Է¹��� ���� ���ǿ� �°� ���� �� ��ȯ 
//	- ���� ���������� ��� ���� ���� Ŭ����	
		if(choose.equals(start)) {
			PrologueClass.prologueMethod();
		}
		else if(choose.equals(man)) {
			manner();
		}
		else if(choose.equals(back)) {
			homeIn();
		}
		else {
			PrintMes.printReCho();
			String chooseM=" ";
			chooseM = sc.next();
			homeChoose(chooseM);
		}
	}
}
