package school.hicoders;

public class Teacher extends Person{

    private String specialty;


    public Teacher(String name, String lastname, int age , String specialty) {
        super(name, lastname, age);
        this.specialty = specialty;
    }
}
