package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {
    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest=students[0];
        for(int i=1;i< students.length;i++){
            if (students[i].getAge()>oldest.getAge()){
                oldest=students[i];
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count=0;
        for(int i=1;i< students.length;i++){
            if (students[i].isAdult()){
                count++;
            }
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
         double avg=0;
         for(Student student:students){
             avg+=student.getGrade();
         }
         if(students.length==0){
             return 0;
         }
         return avg/students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
         for (Student  student: students){
             if(student.getName()==name){
                 return student;
             }
         }
         return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student student :students){
            if(student.getGrade()>=15){
                System.out.println(student.toString());
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
          for(Student student :students){
              if(student.getId()==id){
                  student.setGrade(newGrade);
                  return true;
              }
          }
          return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
         for(int i=0;i<students.length;i++){
             for(int j=i+1;j< students.length;j++){
                 if(students[i].getName()==students[j].getName()){
                     return true;
                 }
             }
         }
         return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] new_arr=new Student [students.length];
        System.arraycopy(students,0,new_arr,0,students.length);
        new_arr[students.length]=newStudent;
        return new_arr;

    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
         Student []arr={new Student(1,"Hiba",16,18),new Student(2,"Ritaj",18,19),new Student(3,"Hayat",17,17),new Student(4,"Khalid",18,14),new Student(5,"Sadik",18,15)};

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest

        System.out.println("The oldest is "+findOldest(arr).toString());
        // 3) Count adults

        System.out.println("Number of adults students is "+countAdults(arr));
        // 4) Average grade
        System.out.println("The average grade is "+averageGrade(arr));

        // 5) Find by name

        System.out.println("The student names Ritaj is "+findStudentByName(arr,"Hiba"));
        // 6) Sort by grade desc
        // sort function
        sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        boolean updated=updateGrade(arr,4,12);
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        System.out.println("\nThe array has duplicates names ? "+hasDuplicateNames(arr));
        // 10) Append new student
        Student [] new_arr=appendStudent(arr,new Student(6,"Rita",18,13));
    }
}

