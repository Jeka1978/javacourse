package serializtion;

import com.nice.Person;
import lombok.SneakyThrows;

import javax.swing.*;
import java.io.*;
import java.util.Random;

public class MainRead {
    @SneakyThrows
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age?"));
        File file = new File("C:\\temp\\person.obj");

        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fos);
        Object o = oos.readObject();
        System.out.println("o = " + o);

    }
}












