import java.io.*;
import java.util.Arrays;

public class ReadStudentFile{
    public static void main(String[] args) {

        System.out.println("STUDENTS FILE:");
        File file = new File("/Users/macbook/Desktop/week-4-sq20-IsiomaNwobi1/Week4Task/src/main/resources/StudentFile");

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;

            while ((line = buffer.readLine()) != null) {
                String[] array = line.split(",");
                System.out.println(Arrays.toString(array));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
