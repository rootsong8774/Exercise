package problemIOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class OutputDoubleData {

    public static void main(String[] args) throws IOException {
        double[] dbuf = {1.1, 2.2, 3.3, 4.4, 5.5};
        String path = System.getProperty("user.dir");
        File doubleFile = new File(path, "double.txt");


        FileOutputStream fos = new FileOutputStream(doubleFile);
        DataOutputStream dos = new DataOutputStream(fos);

        for (Double num : dbuf) {
            dos.writeDouble(num);
        }
        dos.flush();
        dos.close();


        FileInputStream fis = new FileInputStream(doubleFile);
        DataInputStream dis = new DataInputStream(fis);

        for (int i = 0; i < dbuf.length; i++) {
            double dd = dis.readDouble();
            System.out.println(dd);
        }

        dis.close();

    }

}
