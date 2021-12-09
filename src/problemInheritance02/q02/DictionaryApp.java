package problemInheritance02.q02;

public class DictionaryApp {

    public static void main(String[] args) {
        Dictionary dic = new Dictionary(2);
        System.out.println("이순신의 값은 " + dic.get("이순신"));
        dic.put("홍길동", "자바");
        dic.put("이순신", "파이선");
        dic.put("신사임당", "C++");
        System.out.println("이순신의 값은 " + dic.get("이순신"));
        System.out.println("홍길동의 값은 " + dic.get("홍길동"));
        System.out.println("신사임당의 값은 " + dic.get("신사임당"));
        System.out.println("김자바의 값은 " + dic.get("김자바"));
        dic.delete("홍길동");
        dic.delete("이순신");
        System.out.println("홍길동의 값은 " + dic.get("홍길동"));

    }

}
