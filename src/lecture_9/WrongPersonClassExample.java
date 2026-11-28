package lecture_9;

class WrongPersonClassExample {
    private String name;
    private int age;

    public WrongPersonClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        String s = "test";
        String s1 = new String("test");
        if (this == o) return true;


        if (o == null || getClass() != o.getClass()) return false;
        WrongPersonClassExample badPerson = (WrongPersonClassExample) o;
        return age == badPerson.age && name.equals(badPerson.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
