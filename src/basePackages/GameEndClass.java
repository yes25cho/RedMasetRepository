package basePackages;

import java.util.Scanner;

import mainPackages.PrologueClass;

public class GameEndClass {
	static Scanner sc = new Scanner(System.in);
	static String goHome = new String("Ȩ����");
	static String rePlay = new String("�ٽ��ϱ�");
//	gameEndIn�޼���
	public static void gameEndIn(){
//	- ���� ȭ�鿡�� ���� �Է¹���		
		PrintMes.printEnd();
		String chooseM="";
		chooseM = sc.next();
		gameEndChoose(chooseM);
	}
	
//	gameEndChoose�޼���
	public static void gameEndChoose(String choose){
//	- ��gameEndIn������ ���� �Է¹��� ���� ���ǿ� �°� ���� 
//	- ���� ���������� ��� ���� ���� Ŭ����
		if(choose.equals(goHome)) {
			HomeClass.homeIn();
		}
		if(choose.equals(rePlay)) {
			PrologueClass.prologueMethod();
		}
		else {
			PrintMes.printReCho();
			String chooseM=" ";
			chooseM = sc.next();
			gameEndChoose(chooseM); 
		}
	}
	
}
