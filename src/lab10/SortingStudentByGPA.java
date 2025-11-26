package lab10;

import java.util.*;

class SortingStudentByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    public static void quickSort(Student[] students, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(students, low, high, comparator);
            quickSort(students, low, pi - 1, comparator);
            quickSort(students, pi + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comparator) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) > 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }

    public static void qSort(Student[] students) {
        quickSort(students, 0, students.length - 1, new SortingStudentByGPA());
        for (int i = 0; i < students.length/2; i ++){
            Student temp;
            temp = students[i];
            students[i]=students[students.length-i-1];
            students[students.length-i-1]=temp;
        }
    }

}



