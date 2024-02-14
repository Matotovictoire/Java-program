import java.util.Scanner;

public class PercentGrade {
    public static void main(String[] args) {
        int phys;
        int chimie;
        int bio;
        int math;
        int comp;
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks of Physics: ");
        phys = marks.nextInt();
        System.out.println("Enter the marks of Chemestry: ");
        chimie = marks.nextInt();
        System.out.println("Enter the marks of Biology: ");
        bio = marks.nextInt();
        System.out.println("Enter the marks Mathematics");
        math = marks.nextInt();
        System.out.println("Enter the marks of the Computer course");
        comp = marks.nextInt();
        int totalmarks = phys+chimie+bio+math+comp;
        double percentage = (double) (totalmarks*100) / 250;
        if (percentage>=90) {
            System.out.println("Grade A");
        }else if (percentage>=80){
            System.out.println("Grade B");
        }else if (percentage>=70) {
            System.out.println("Grade C");
        }else if (percentage>=60){
            System.out.println("Grade D");
        }else if (percentage>=40) {
            System.out.println("Grade E");
        }else{
            System.out.println("Grade F");
        }
        marks.close();
    }
}
