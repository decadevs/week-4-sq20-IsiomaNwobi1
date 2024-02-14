import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadTeacherFile {

    public static void main(String[] args) {

        System.out.println("TEACHERS FILE:");
        File file = new File("/Users/macbook/Desktop/week-4-sq20-IsiomaNwobi1/Week4Task/src/main/resources/TeacherFile");

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
