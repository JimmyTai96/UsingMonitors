public class TA_Brain{
  private int capacity;
  private int numOfStudentsHelping=0;
  
  public TA_Brain(int capacity){
    this.capacity=capacity;
  }
  
  public synchronized int getNumOfStudentsHelping(){
    return numOfStudentsHelping;
  }
  
  public synchronized void takeAStudent(Student s){
    while(numOfStudentsHelping >= capacity){
      try{
        System.out.println(s.getStudentName()+" is Waiting for a spot with TA.");
        wait();
      } 
      catch(InterruptedException ie){}
    }
    numOfStudentsHelping++;
    System.out.println(s.getStudentName() + " is with the TA.");
  }
  
  public synchronized void releaseAStudent(TA t){
    numOfStudentsHelping--;
    System.out.println(t.getTAName()+" is done helping a student");
    notify();
  }
}