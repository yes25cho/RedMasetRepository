package mainPackages;

import basePackages.*;

//���ѷα� ���� Ŭ������ ��� �δ� �� �Դϴ�.
//��� ���� �Ұ͵�
////- �����ϴ� �޼ҵ�(�� Ŭ������ �߽��� Ŭ����)-��� : ������ (�޼ҵ� �̸� : )
//- ���ѷα� ����-��� : ������ (�޼ҵ� �̸� : prologueMethod)
//- ���� �ϴ� ����-��� : ������	(�޼ҵ� �̸� : prologueChoMethod)
public class PrologueClass {
	public static void prologueMethod(){
		BaseFunc.margin10();
		BaseFunc.countStr("");
		BaseFunc.countCh2("OO������ 20�� ���л��� ���۽�����  �����Ǵ� ����� �߻� �Ǿ����ϴ�.");
		BaseFunc.countCh2("�����ڴ� ���б����� ������ �Ͱ��ϴ� ������ ������ �˷�����");
		BaseFunc.countCh2("ſ...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"�ٳ�ð�\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("���󿡴� �����Ҽ� ���� �ϵ��� �Ͼ��.");
		BaseFunc.countStr("������ ������ �ְ� �������� �̾߱���̴�.");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"���� ���� ��Ǻþ�? �װ� ��������ũ�� ���̷�\"");
		BaseFunc.countCh2("\"���� �� �Ҹ��� ����\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("�̷��� �Ǿ��� ����鵵 �� ���� �ȵǴ� �̾߱��� ");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"�ٵ� ���� ���ϰ�� ���� ���� �̻�!\"");
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("���� ó�� ������ �� �ϻ��� ���õ� �̷���");
		BaseFunc.countCh1("��zzZZ");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"�� �Ͼ ���� �Ȱ�?\"");
		BaseFunc.countCh2("\"��..��  �ݹ� ì��� ����\"");
		BaseFunc.countStr("(��� ���� ���� ��)");
		BaseFunc.countCh2("\"��..? �� ��´�.\"");
		BaseFunc.countStr("�ϱ⿹������ �̷� ���̡�");
		BaseFunc.countStr("�� ���� ���� ������..");
		BaseFunc.countCh2("\"�� �� ���ǿ� ��� �ΰ�ͼ� ���� ������!\"");
		BaseFunc.countStr("���� ������ ��Ģ���� ���� �Ͼ�� �� �� �����ϰ�� ��¥�� ����� �λ��̴�.");
		prologueChoMethod();
	}
	public static void prologueChoMethod(){
		BaseFunc.countStr("");
		BaseFunc.countStr("(���ã�� �����Դ�)"); 
		BaseFunc.countCh2("�d..! �����嵵..���嵵..�����嵵..���嵵..�����嵵..");
		BaseFunc.countStr("");
		BaseFunc.countStr("��Ӱ� ����� ���� ����ϱ� ���� �˴��浵 �� ������ �������١�");
		BaseFunc.countStr("");
		BaseFunc.countCh1("�ǰ�..�ǰ�..");
		BaseFunc.countStr("");
		BaseFunc.countCh2("��..?");
		BaseFunc.countStr("�ڿ� �α�ô�� ��������.");
		int cho = GameOverClass.gameOverIn();
		if(cho==1) {
			prologueChoMethod();
		}
	}
}
