package by.home.Task3;

import java.io.FileInputStream;
import java.io.IOException;

public class NewFile implements Readable {
    private final String fileName;

    public NewFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String[] read() {
        String[] str = null;
        try (FileInputStream fileInputStream = new FileInputStream(this.fileName)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            System.out.println("Прочитано из файла c текстом " + getClass().getName() + " " +
                    fileInputStream.read(bytes) + " byte");
            str = new String(bytes).split("\\.");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return str;
    }
}
