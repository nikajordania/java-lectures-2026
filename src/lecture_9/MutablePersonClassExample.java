
package lecture_9;

import java.util.Objects;

class MutablePersonClassExample {
    private String name;
    private int age;

    public MutablePersonClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MutablePersonClassExample)) return false;
        MutablePersonClassExample that = (MutablePersonClassExample) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
