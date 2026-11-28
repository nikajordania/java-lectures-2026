package lecture_9.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            Student student = new Student("John", 20, "Computer Science");

            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

