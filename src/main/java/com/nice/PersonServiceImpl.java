package com.nice;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class PersonServiceImpl implements PersonService {
    @SneakyThrows(FileNotFoundException.class)
    public void processPerson(Person person) {
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\temp\\file.txt");
    }
}
