package chap03sec02.q04;

public class CountingPencilAndStudent {

	public static void main(String[] args) {
		int pencils = 534;
		int student = 30;
		
		//�л� 1���� ������ ���� ����
		int pencilsPerStudent = pencils / student;
		System.out.println(pencilsPerStudent);
		
		//���� ���� ����
		int pencilsleft = pencils % student;
		System.out.println(pencilsleft);
		
		//�˻�
		int checkCalculation = student * pencilsPerStudent + pencilsleft;
		System.out.println(checkCalculation == pencils);
	}

}
