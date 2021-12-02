package problemArray.q07;

import java.util.Scanner;

public class SearchCourseAndScore {

	public static void main(String[] args) {
		String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목을 입력하세요 (종료:q)>>");
			String name = scanner.next();
			if(name.equals("q")) {
				break;
			}
			for(int i =0;i<score.length;i++) {
				if(course[i].equals(name)) {
					System.out.println(name+"의 점수는 "+score[i]+"입니다.");
					break;
				}
				
			}
			System.out.println("해당 과목은 존재하지 않습니다.");
			
			
		}
		scanner.close();
		

	}

}
