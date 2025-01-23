
package student.mangement.system;


public class courses  { 

public String Subject ;

public courses (String subject){
    this.Subject=subject;
}

public String getsubject (){
    return Subject;
}

//public void setSubject(String subject) {
//        this.Subject = Subject;
//    }

  @Override
    public String toString() {
        return"course" + Subject;
    }
}

// Ensure consistent naming
 
//  enorll
//  unenorll
//  add course 
//  deleted course
