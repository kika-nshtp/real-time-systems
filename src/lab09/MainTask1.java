package lab09;

public class MainTask1 {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alex", 103, 4.5),
                new Student("Bob", 101, 4.8),
                new Student("Charlie", 105, 4.2),
                new Student("Dexter", 102, 4.4),
                new Student("Eva", 104, 4.9)
        };

        System.out.println("Исходный массив:");
        for (Student student : students) {
            System.out.println(student);
        }
        insertionSort(students);

        System.out.println("\nОтсортированный массив (по ID):");
        for (Student student : students) {
            System.out.println(student);
        }
        SortingStudentsByGPA.qSort(students);
        System.out.println("\nОтсортированный массив (по GPA):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
