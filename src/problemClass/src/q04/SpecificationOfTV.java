package q04;
class TV{
    String manufacturer;
    int year;
    int size;

    public TV(String manufacturer, int year, int size){
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
    }
    public void show(){

        System.out.println(manufacturer+"에서 만든 "+year+"년 "+ size+"인치");    }
}
public class SpecificationOfTV {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 65인치
        myTV.show();
    }
}
