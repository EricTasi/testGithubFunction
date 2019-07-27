package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] gradesArray = {91, 92, 34, 32, 84, 34, 55, 76, 85, 53, 62, 21, 32, 58, 76, 84, 93, 100
        , 54, 73, 87, 97, 93, 46, 27, 54, 63, 86, 54, 74, 79, 89, 73, 47, 56, 58};

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming ",gradesArray );
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());

        myGradeBook.processGrades();
    }
}