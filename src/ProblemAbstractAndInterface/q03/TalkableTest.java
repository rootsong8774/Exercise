package ProblemAbstractAndInterface.q03;

interface Talkable {

	void talk();
}

class Korean implements Talkable {

	public void talk() {
		System.out.println("안녕하세요! 만나서 반갑습니다.");
	}
}

class English implements Talkable {

	public void talk() {
		System.out.println("Hello. Nice to meet you!");
	}
}

public class TalkableTest {

	private static void speak(Talkable language) {
		language.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new English());
	}

}
