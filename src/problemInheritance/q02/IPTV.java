package problemInheritance.q02;

import problemInheritance.q01.ColorTV;

public class IPTV extends ColorTV {
    private String ipAddr;
    public IPTV(String ipAddr, int size, int nColor) {
        super(size, nColor);
        this.ipAddr = ipAddr;
    }
    public void printProperty() {
        System.out.println(ipAddr + " 주소에 " + getSize()+ " 인치, " + getnColor() +" 컬러");
    }
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
