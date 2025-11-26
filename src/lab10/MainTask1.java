package lab10;

public class MainTask1 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alex", 103, "АБВГ-01-23",4.5),
                new Student("Bob", 101, "АБВГ-02-23",4.8),
                new Student("Charlie", 105, "БВГД-03-45",4.2),
                new Student("Dexter", 102, "ВГДЕ-12-34",4.4),
                new Student("Eva", 104, "АААА-11-11",4.9)
        };

        System.out.println("Исходный массив:");
        for (Student student : students) {
            System.out.println(student);
        }
        MergeSortStudents.sortStudents(students);

        System.out.println("\nОтсортированный массив (по ID):");
        for (Student student : students) {
            System.out.println(student);
        }
        SortingStudentByGPA.qSort(students);
        System.out.println("\nОтсортированный массив (по GPA):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

