package basePackages;

import java.util.Scanner;

public class GameOverClass {
	static Scanner sc = new Scanner(System.in);
	static String goHome = new String("Ȩ����");
	static String rePlay = new String("�ٽ��ϱ�");
//	gameOverIn�޼���
	public static int gameOverIn(){
//	- ���� ȭ�鿡�� ���� �Է¹���
		PrintMes.printOver();
		String chooseM="";
		chooseM = sc.next();
		return gameOverChoose(chooseM);
	}
//	gameOverChoose�޼���
	public static int gameOverChoose(String choose) {
//	- ��gameOverIn������ ���� �Է¹��� ���� ���ǿ� �°� ���� �� ��ȯ 
//	- ���� ���������� ��� ���� ���� Ŭ����
//	- ��Ȩ���Ρ�&���� - 0�� ����
//	- ���ٽ��ϱ⡯ - 1�� ����		
		if(choose.equals(goHome)) {
			HomeClass.homeIn();
			return 0;
		}
		if(choose.equals(rePlay)) {
			return 1; 
		}
		else {
			PrintMes.printReCho();
			String chooseM=" ";
			chooseM = sc.next();
			gameOverChoose(chooseM);
			return 0; 
		}
	}
	
}
