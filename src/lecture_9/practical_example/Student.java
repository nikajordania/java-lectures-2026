package lecture_9.practical_example;

import java.util.List;

// implement Comparable<Student> for providing sorting default functionality by average grade
public class Student implements Comparable<Student> {

    private Integer id;
    private String name;
    private String surname;
    private String group;
    private List<Integer> grades;

    // constructor without id field (it will be set when adding to hashmap by addStudent method)
    public Student(String name, String surname, String group, List<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.grades = grades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.size();
    }


    @Override
    public String toString() {
        return name + " " + surname + " | Group: " + group + " | Avg: " + getAverage();
    }

    // implement Comparable<Student> for sorting by average grade using Double.compare method
    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getAverage(), o.getAverage());
    }
}
