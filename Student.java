public class Student extends Person{
  private String name;
  public double[] exams = new double[2];
  public String grade;

  public Student(){
    super();
    name = super.getName();
    grade = "";
    exams[0] = 0;
    exams[1] = 0;
  }
  
  public Student(String name){
    super(name);
    name = super.getName();
    grade = "";
    exams[0] = 0;
    exams[1] = 0;
  }

  public Student(String name, double exam1, double exam2){
    super(name);
    exams[0] = exam1;
    exams[1] = exam2;
  }

  public double calcAverage(){
    double avg = 0;
    for (double l : exams){
      avg += l;
    }
    avg /= exams.length;
    return avg;
  }

  public String calcGrade(double inavg){
    double avg = inavg;
    String grd = "";
    if (avg >= 60){
      grd = "PASS";
    } else {
      grd = "FAIL";
    }

    return grd;
  }

  public String toString(){
    return "| Name: " + this.name + " | Exam1: " + this.exams[0] + " | Exam2: " + this.exams[1]+ " | Avg: " + calcAverage() + " | Grade: " + calcGrade(calcAverage()) + "\n";
  } 
}