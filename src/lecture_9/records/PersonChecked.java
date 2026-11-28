package lecture_9.records;

record PersonChecked(String name, int age) {

    PersonChecked {

        if (age < 1 || age > 110) {
            age = 18;
        }

    }

//    records.PersonChecked(String name, int age){
//
//        if(age < 0 || age > 120) age = 18;
//
//        this.name = name;
//        this.age = age;
//    }

    PersonChecked(String firstName, String lastName, int age) {

        this(firstName + " " + lastName, age);

    }

    // Override
    public String name() {
        return "Mister " + name;
    }

    public String toString() {
        return String.format("lecuture_9.model.Person %s, Age: %d", name, age);
    }


    static int minAge;

    static {
        minAge = 18;
        System.out.println("Static initializer");
    }
}
