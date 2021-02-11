public class GradStudent extends Student {
  
  public String calcGrade(int inavg) {
    int avg = inavg;
    String grd = "";
    if (avg >= 90){
      grd = "Honors";
    }
    super.calcGrade(avg);

    return grd;
  }
}