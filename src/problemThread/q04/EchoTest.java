package problemThread.q04;

public class EchoTest {

    public static void main(String[] args) {
        //echoMethod를 잠그기 위해서 Echo클래스가 동일한 heap을 참조해야한다.
        //Echoer의 argument에 new Echo()로 넣게 되면 매번 새로운 heap을 생성하므로
        //각각의 thread는 서로 다른 echoMethod를 호출하게 되는 셈이다.
        //따라서 아래와 같이 echo라는 하나의 heap영역에 저장할 필요가 있다.
        Echo echo = new Echo();
        Echoer echoTester1 = new Echoer("환영", echo);
        Echoer echoTester2 = new Echoer("자바", echo);
        Echoer echoTester3 = new Echoer("야호", echo);


        echoTester1.start();
        echoTester2.start();
        echoTester3.start();


    }
}
