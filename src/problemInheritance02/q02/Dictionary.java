package problemInheritance02.q02;

public class Dictionary extends PairMap {

    private int count = 0;
    private final int capcity;

    public Dictionary(Integer capcity) {
        this.capcity = capcity;
        super.keyArray = new String[capcity];
        super.valueArray = new String[capcity];
    }

    String get(String key) {

        for (int i = 0; i < count; i++) {
            if (key.equals(keyArray[i])) {
                return valueArray[i];
            }
        }
        return "존재하지 않습니다.";
    }

    void put(String key, String value) {
        if (count == capcity) {
            System.out.println("더 이상 key를 추가할 수 없습니다.");
            return;
        }
        this.keyArray[count] = key;
        this.valueArray[count] = value;
        count++;

    }

    void delete(String key) {
        int index;
        for (index = 0; index < count; index++) {
            if (key.equals(keyArray[index])) {
                break;
            }

        }

        count--;
        for (int i = index; i < count; i++) {
            this.keyArray[i] = this.keyArray[i + 1];
            this.valueArray[i] = this.valueArray[i + 1];
        }

    }

    /*Integer length() {

        return count + 1;
    }*/
}
