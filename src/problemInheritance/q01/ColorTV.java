package problemInheritance.q01;

class TV {
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}

public class ColorTV extends TV {
    private int nColor;
    protected int getnColor() {
        return nColor;
    }
    public ColorTV(int size, int nColor){
        super(size);
        this.nColor = nColor;
    }
    public void printProperty() {
        System.out.println(getSize()+"인치 " + getnColor() + " 컬러 TV");
    }
    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
    }
}
