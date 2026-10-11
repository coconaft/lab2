import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 3; i++) {
            String name = "file" + i + ".txt";
            try {
                FileWriter wr = new FileWriter(name);
                for (int j = 0; j < 10; j++) {
                    wr.write((rand.nextInt(10) + 1) + " ");
                }
                wr.close();
            }
            catch (IOException e) {
                System.out.println("Ошибка записи файла " + name);
            }
        }
    }
}
