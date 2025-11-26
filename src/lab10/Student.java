package lab10;

import java.util.*;
import java.text.*;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private double gpa;
    private String group;
    private Calendar dateOfBirth;

    public Student(String name, int id, String group, double gpa) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.gpa = gpa;
    }

    public Student(String name, int id, String group, double gpa, int day, int month, int year) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.gpa = gpa;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.YEAR, year);
        this.dateOfBirth=cal;
    }

    public String toStringWithDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        return "Имя: '" + name + "', ID: " + id +", Группа: "+group+ ", GPA: " + gpa + " Дата рождения: " + sdf.format(dateOfBirth.getTime())+ "}";
    }

    public static void outArray(Student[] students){
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public double getGpa() { return gpa; }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", group="+group+ ", gpa=" + gpa + "}";
    }
}

