// import java.io.FileReader;
// import java.io.FileWriter;

// public class fileWR {
//     public static void main(String[] args) throws Exception {
//         FileWriter fw = new FileWriter("Suman.txt");

//         fw.write("Hello World");
//         fw.close();

//         System.out.println("Data written successfully");

//         FileReader fr = new FileReader("Suman.txt");
//         int i;
//         while ((i = fr.read()) != -1) {
//             System.out.print((char) i);
//         }
//         fr.close();
//     }
// }

import java.io.*;

public class fileWR {

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("Suman.txt");
        fw.write("Suman Kandi");
        fw.close();
        System.out.println("Successfully written");

        FileReader fr = new FileReader("Suman.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}