public class Student extends Thread{
  private TA_Brain brain;
  private String studentName;
  
  public Student(TA_Brain brain, String name){
    this.brain = brain;
    studentName = name;
  }
  
  public String getStudentName(){
    return studentName;
  }
  
  public void giveAdvice(){
    System.out.println(studentName + " ask for help");
  }
  
  public void run(){
    brain.takeAStudent(this);
    giveAdvice();
  }
}