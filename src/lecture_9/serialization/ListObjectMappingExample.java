package lecture_9.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListObjectMappingExample {
    public static void main(String[] args) {
        try {
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student("Nika", 20, "Computer Science"));
            studentList.add(new Student("Nino", 21, "Mathematics"));
            studentList.add(new Student("Gio", 21, "Mathematics"));


            FileOutputStream fileOut = new FileOutputStream("studentList.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(studentList);
            out.close();
            fileOut.close();
            System.out.println("Serialized list is saved in studentList.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

