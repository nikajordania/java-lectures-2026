package lecture_9.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

class ListDeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("studentList.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List<Student> studentList = (List<Student>) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized serialization.Student List:");
            for (Student student : studentList) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Department: " + student.getDepartment());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
