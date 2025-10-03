package homework.day7;

import playground.essence.creatures.Beetle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateAndSaveBeetle {
    public void run() {
        Beetle beetle = new Beetle(3, "Biedronka");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("beetle.txt"))) {
            oos.writeObject(beetle);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CreateAndSaveBeetle().run();
    }
}
