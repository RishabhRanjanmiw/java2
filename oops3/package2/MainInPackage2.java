package oops3.package2;
import oops3.Learnpackage.Teacher;
public class MainInPackage2 extends Teacher {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass =7;
        MainInPackage2 mainInPackage2 = new MainInPackage2();
//   protected class here
        mainInPackage2.studentsCount = 100;

    }
}
