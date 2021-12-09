package problemInheritance02.q01;


public class StringStack implements Stack {


    private final String[] element;
    private Integer top;

    public StringStack(Integer capcity) {
        element = new String[capcity];
        top = -1;
    }

    public Integer getTop() {
        return top;
    }

    public String[] getElement() {
        return element;
    }

    public Integer length() {
        return this.top + 1;
    }

    @Override
    public Integer capacity() {
        return element.length;
    }

    @Override
    public String pop() {
        String result = null;
        if (top != -1) {
            String topElement = element[top];
            top -= 1;
            result = topElement;
        }
        return result;
    }

    public boolean push(String val) {
        if (top == element.length - 1) {
            return false;
        }
        top += 1;
        element[top] = val;
        return true;
    }
}
