package chap03sec02.q04;

public class CountingPencilAndStudent {

	public static void main(String[] args) {
		int pencils = 534;
		int student = 30;
		
		//학생 1명이 가지는 연필 개수
		int pencilsPerStudent = pencils / student;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 개수
		int pencilsleft = pencils % student;
		System.out.println(pencilsleft);
		
		//검산
		int checkCalculation = student * pencilsPerStudent + pencilsleft;
		System.out.println(checkCalculation == pencils);
	}

}
