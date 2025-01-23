
package student.mangement.system;
import java.util.*;
 public class StudentMangementSystem {

    
    public static void main(String[] args) {
           List<student> students = new ArrayList<>(); // List to store students
        List<courses> course;  // List to store courses
      course = new ArrayList<>();

        // Add initial courses
        course.add(new courses("Programming Basics"));
        course.add(new courses("Advanced Java"));
        course.add(new courses("Cybersecurity"));

        Scanner input = new Scanner(System.in);

        while (true) { // Application menu loop
            System.out.println("\nChoose from the menu:");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Exit");
            System.out .print ("entre your choose : ") ; String choose = input.next();
//          if (choose.equals("3")) { // Exit the program if user chooses "3"
//                System.out.println("Exiting the program. Goodbye!");
////        break;
//}else{
            switch (choose) {
                case "1" -> {
                    System.out.println("\nStudent Management:");
                    System.out.println("1. Add Student");
                    System.out.println("2. Show All Students");
                    System.out.println("3. Remove Student ");
                    System.out.println("4. update Student ");
                    System.out .print ("entre your choose : ");String studentAction = input.next();

                    switch (studentAction) {
                        case "1" -> { // Add Student
                            System.out.print("Enter student name: ");
                            String name = input.next();
                            System.out.print("Enter student age: ");
                            int age = input.nextInt();
                            students.add(new student(name, age)); // Store the student
                            System.out.println("Student added successfully!");
                            // show list courses
        System.out.println("Available courses:");
        for (int i = 0; i < course.size(); i++) {
            System.out.println((i + 1) + ". " + course.get(i).getsubject());
        }
        // chosse course
        System.out.print("Enter the number of the course you want to choose: ");
        int courseChoice = input.nextInt();
// test course avabile
if (courseChoice > 0 && courseChoice <= course.size()) {
    courses selectedCourse = course.get(courseChoice - 1);
    System.out.println("You have selected: " + selectedCourse.getsubject());
} else {
    System.out.println("Invalid choice.");
}
               
                        }
                        case "2" -> { // Show All Students
                            System.out.println("\nList of students:");
                            if (students.isEmpty()) {
                                System.out.println("No students registered.");
                            } else {
                               students.forEach(System.out::println);
                                }
                            
                            }
                        case "3" -> {
                              System.out.println("Remove student selected.");
    System.out.print("Enter the name of the student you want to remove: ");
    String rname = input.next();
    System.out.print("Enter the age of the student: ");
    int rage = input.nextInt();

    // Find and remove the student
    boolean studentRemoved = false;
    for (int i = 0; i < students.size(); i++) {
        student s = students.get(i);
        if (s.getName().equals(rname) && s.getAge() == rage) {
            students.remove(i);
            studentRemoved = true;
            System.out.println("Student " + rname + " has been removed.");
            break;
        }
    }

    if (!studentRemoved) {
        System.out.println("Student not found. Please check the name and age.");
    }
}
                        case"4"->{
                            { // Update Student
    System.out.print("Enter the name of the student you want to update: ");
    String updateName = input.next();

    // Search for the student by name
    student studentToUpdate = null;
    for (student s : students) {
        if (s.getName().equals(updateName)) {
            studentToUpdate = s;
            break;
        }
    }

    if (studentToUpdate != null) {
        System.out.println("Student found: " + studentToUpdate);
        System.out.print("Enter new name: ");
        String newName = input.next();
        System.out.print("Enter new age: ");
        int newAge = input.nextInt();

        // Update student data
        students.remove(studentToUpdate);
        students.add(new student(newName, newAge));

        System.out.println("Student data updated successfully!");
    } else {
        System.out.println("Student not found.");
    }
}
                        }
                        }
                        }
 case"2" ->{
                    System.out.println("1. Add course");
                    System.out.println("2. removecourse");
                    System.out.println("3. Avabile couse ");
                    System.out .print ("entre your choose : ");String courseaction = input.next();
                    
                    switch (courseaction){
                        //add course
                        case "1"->{
                            System.out.print("Entre your new course :");
                            String newcourse = input.next();
                            course.add(new courses (newcourse));
                        } 
                        case "2"->{
                            System.out.print("Entre your remove course name : " );
                            String removecourse=input.next();
                            boolean courseremoved = false;
    for (int i = 0; i < course.size(); i++) {
        courses s = course.get(i);
        if (s.getsubject().equals(removecourse)){
            course.remove(i);
            courseremoved= true;
            System.out.println("course " + removecourse + " has been removed.");
            break;
        }
                        }
                        }
                        case "3"->{
                            System.out.println("your course list it");
                           if (course.isEmpty()) {
                                System.out.println("No course avaibile.");
                            } else {
                               course.forEach(System.out::println);
                                }
                            
                            }
                    } 
 }
                    }
          
System.out.println(" Do you want anthoer opeater (yes/no): "); 
            String again = input.next().toLowerCase();
            
            if (again.equals("no")) {
                System.out.println(" Goodbye!");
                break;
    }
  }
 }
 }
    
 



    
 
   
 

        
        

    
    

