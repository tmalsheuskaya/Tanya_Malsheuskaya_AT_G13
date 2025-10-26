package homework.day7;

import playground.essence.creatures.Beetle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAndSaveBeetle {
    public void run() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("beetle.txt"))) {
            Beetle beetle = (Beetle) ois.readObject();
            Files.writeString(Path.of("newbeetle.txt"), beetle.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ReadAndSaveBeetle().run();
    }
}
