package serializtion;

import com.nice.Person;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainWrite {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("C:\\temp\\person.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        Person sivan = new Person("Sivan", 18);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(sivan);

    }
}












