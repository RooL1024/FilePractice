import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File file = new File("C:\\Users\\Renle\\Desktop\\test.txt");
        if(!file.exists()){
            file.mkdirs();
        }

        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0;i<100;i++) {
            bw.write("任乐");
            bw.newLine();
        }
        bw.close();


        /*
        // 文件的删除
        System.out.println(f.delete());// true
        */


    }
}
