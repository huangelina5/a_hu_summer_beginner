public class August_4_2019_2{
  public static void main(String[] args){
    student s1 = New student();
    s1.setName("john");
    System.out.println(s1.getName())

  }
}

class student{
  private String name;
  private String address;
  private int numCourses;
  private String[] courses = String[30];
  private int[] grades = int [30];

  //public student(String name, String address){

    public void setName(String name){
      this.name = name;
  }
    public String getName(){
      return this.name;
  }

  public void setAddress(String address){
    this.address = address;
  }

  public String getAddress(){
    return this.address
  }

  public void setNumcourses(int numCourses){
    this numCourses = numCourses;
  }
  public int getNumcourses(){
    return this.numCourses;
  }

  public void setCourses(String[] courses){
    this courses = courses;
  }
  public String[]  getCourses(){
    return this.courses;
  }
  public void setGrade(int[] grades){
    this grades = grades;
  }
  public int[]  getGrades(){
    return this.grades;
  }





  public String toString(){
    return "name(" + this.address + ")";
  }

  public void addCourseGrade(String course, int grade){


  }

  public void printGrades(){
    System.out.println("name " + course1 + ":" + )
  }

  public double setAverageGrade(){

  }


  public double getAverageGrade(){

  }
}
