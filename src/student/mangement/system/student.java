
package student.mangement.system;


public class student {
    public String name;
    public int age ;
    
    public student(String name,int age){
        this.name = name;
        this.age = age ; 
        
    }
            
        public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
 

  @Override
public String toString() {
    return "Student{Name='" + name + "', Age=" + age + "}";
}
}

  
 //consturator
   //add student
    //delete student
   //u[pdate student
    //show list all
    //search show on student
    

