package lab17.Task1;

public class MVCPatternDemo {
    public static void main(String[]args){
        Student model = retrieveCoursefromDatabase();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);
        controller.updateView();
        controller.setName("Пашталян Кира");
        controller.setRollNo("1");
        System.out.println("\nПосле обновления:");
        controller.updateView();
    }
    private static Student retrieveCoursefromDatabase(){
        Student student = new Student();
        student.setName("Нашталяп Кира");
        student.setRollNo("1337");
        return student;
    }
}
