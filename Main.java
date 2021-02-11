import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Main {
  public static void main(String[] args) {

    Student[] stuList = new Student[3];
    Scanner s = new Scanner(System.in);
    Scanner c = new Scanner(System.in);

    for (int i = 0; i < stuList.length; i++) {
      System.out.print("\nName: ");
      String name = s.nextLine();
      System.out.print("\nExam1: ");
      double exam1 = c.nextDouble();
      System.out.print("\nExam2: ");
      double exam2 = c.nextDouble();

      stuList[i] = new Student(name, exam1, exam2);
      System.out.println();
    }

    for (Student i : stuList){
      System.out.print(i);
    }

  }
}