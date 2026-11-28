package lecture_9;

import java.util.Objects;

class GoodPersonClassExample {
    private final String name;
    private final int age;

    public GoodPersonClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoodPersonClassExample)) return false;
        GoodPersonClassExample that = (GoodPersonClassExample) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
