  package basePackages;

public class PrintMes{
//	printExceHome�޼���
	public static void printExceHome(){
//	- Ȩȭ�鿡�� ���� �� �޾��� �� ���	
		System.out.println();
		BaseFunc.countCh2("�� ...������ �ִ� �޴� �߿��� ���� �� �� ����");
		System.out.println();
		System.out.println();
	}
	
//	printExce�޼���
	public static void printExce(){
//	- ���� �߿� ������ ���� �޾��� �� ���
		System.out.println();
		BaseFunc.countCh2("�� ...");
		BaseFunc.countCh2("�� ���...?");
		BaseFunc.countCh2("�� �װ� �ȵǴ� �� ���� �ٽ� ������ �ؼ� ���� ����...");
		System.out.println();
		System.out.println();
	}
	
//	printManner�޼���
	public static void printManner(){
//	- ���� �ϱ� ���� ���
		System.out.println();
		System.out.println("----------- �ϴ� ��� -----------");
		System.out.println("1. �̾߱⸦ ������ �̾߱⿡ �����ʽÿ�");
		System.out.println("2. �������� ������ �ڽ��� ���ϴ� \n   �������� �Է��Ͻʽÿ�");
		System.out.println("3. �����ص� ���� �����鵵 ������ \n   ��� ������ ���ʽÿ�");
		System.out.println("4. �ӴϸӴ� �ص� ���鼭 �Ͻʽÿ�");
		BaseFunc.countCh2("��. rhxh���� aks�� ��tlaq�ÿ�..TKFFUWNJ");
		System.out.println();
		System.out.println();
		System.out.println("        �����ư���                              �������ϱ�");
		printChoose();
	}
	
//	printHome�޼���
	public static void printHome(){
//	- Ȩȭ�� ���
		System.out.println();
		BaseFunc.countCh("          ��   ��      ��   ��   ũ      ��   ��   ��");
		BaseFunc.count();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("        ��������                              �������ϱ�");
		printChoose();
	}
	
//	printOver�޼���	
	public static void printOver(){
//	- �⺻ ���� ������ ���� ȭ�� ���
		System.out.println();
		BaseFunc.countCh("          ��  ��  ��   ��  ��  ��  ��  ��   .  .  . ");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("          ���ٽ��ϱ�                              ��Ȩ����");
		printChoose();
	}
	
//	printEnd�޼���
	public static void printEnd() {
//	- �⺻ ���� ������ ���� ȭ�� ���
		System.out.println();
		BaseFunc.countCh("            T   h   e      E   n   d");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("          ���ٽ��ϱ�                              ��Ȩ����");
		printChoose();
	}

//	printChoose�޼���
	public static void printChoose(){
//	- 	���� �Է� ���� ���	
		System.out.println();
		System.out.print("       �������� �Է��Ͻÿ�  : ");
	}
	
//	printReCho�޼���
	public static void printReCho(){
//	- 	���� �ٽ� �Է� ���� ���
		PrintMes.printExceHome();
		System.out.println("�ٽ� ���� : ");
	}
}
