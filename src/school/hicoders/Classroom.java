package school.hicoders;

import java.util.Arrays;
import java.util.List;

public class Classroom {

    private List students;
    private List teacher;
    private String location;
    private String name;


    public Classroom(List students, List teacher, String location, String name) {
        this.students = students;
        this.teacher = teacher;
        this.location = location;
        this.name = name;
    }

    public List getStudents() {
        return students;
    }

    public void setStudents(List students) {
        this.students = students;
    }

    public List getTeacher() {
        return teacher;
    }

    public void setTeacher(List teacher) {
        this.teacher = teacher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
