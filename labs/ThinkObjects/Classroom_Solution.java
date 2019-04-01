/**
 *1 - use this example for the "think objects" lab
 */
public class Classroom_Solution {
    
    public static final int MAX = 30;
    /**
    Instance Variables
    */
   
    private Student[] students;
    private Faculty instructor;
    private int numberOfStudents;
    
    /** Initialize the object */
    public Classroom(){
      students = new Student [MAX];
        numberOfStudents = 0;       
        
    }
    public Classroom (Faculty f){
        
    students = new Student [MAX];
        instructor = f;
        numberOfStudents = 0;    
        
    }
    /**purpose: method getStudents will package the information from each students and returns it as a String 
    * @param - nothing
    * @return - An String that holds each student information 
    * Hint: use the toString method on each Student Object
    */
    public String getStudents(){
        String result="";
        for (int i=0; i<numberOfStudents; i++ ){
            result= result +(this.students[i].toString()+""+",");
        }
        return result;
    }
    /**purpose: to add students to the class, check to 
    make sure that class is not full, and class size has not reached the MAX LIMIT
    * @param - recieves and Student
    * @return - nothing
    */
    public void addStudent (Student s){
        if (numberOfStudents <MAX){
            students[numberOfStudents] = s;
            numberOfStudents++;
        }
    }
    /**purpose: to Assign a Faculty member to the Classroon
    * @param - recieves a Faculty Object
    * @return - nothing
    */
    public void setFaculty(Faculty f){
        instructor =f;
    }
    /**purpose: to display information for the classroom. This includes all the students and the Faculty to the Class
    * @param - nothing
    * @return - an String containing classroom information
    * this class Overrides toString() method from Object class.
    */
    public String toString(){
        return this.getStudents()+ "  "+"Faculty: "+ this.instructor;
    }
}
