package school.hicoders;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       List<Student> studentsGroup1 = new ArrayList<>();
       List<Student> studentsGroup2 = new ArrayList<>();

       List<Teacher> teacher1 = new ArrayList<>();
       List<Teacher> teacher2 = new ArrayList<>();

       Student student1 = new Student("Ali" , "Gün" , 15);
       Student student2 = new Student("Veli" , "Gün" , 15);
       Student student3 = new Student("Hasan" , "Gün" , 15);
       Student student4 = new Student("Huseyin" , "Gün" , 15);
       Student student5 = new Student("Marie" , "Gün" , 15);
       Student student6 = new Student("Jack" , "Gün" , 15);
       Student student7 = new Student("Sofia" , "Gün" , 15);
       Student student8 = new Student("Melen" , "Gün" , 15);
       Student student9 = new Student("Carry" , "Gün" , 15);
       Student student10 = new Student("Jane" , "Gün" , 15);

       Teacher teacherAhmet = new Teacher("Ahmet" , "Gün" , 15, "Math");
       Teacher teacherMehmet = new Teacher("Mehmet" , "Gün" , 15, "English");

       studentsGroup1.add(student1);
       studentsGroup1.add(student2);
       studentsGroup1.add(student3);
       studentsGroup1.add(student4);
       studentsGroup1.add(student5);

       studentsGroup2.add(student6);
       studentsGroup2.add(student7);
       studentsGroup2.add(student8);
       studentsGroup2.add(student9);
       studentsGroup2.add(student10);

       teacher1.add(teacherAhmet);
       teacher2.add(teacherMehmet);

       Classroom classroomA = new Classroom(studentsGroup1 , teacher1 ,"locA", "A class");
       Classroom classroomB = new Classroom(studentsGroup2 , teacher2 ,"locB", "B class");

    }

}
