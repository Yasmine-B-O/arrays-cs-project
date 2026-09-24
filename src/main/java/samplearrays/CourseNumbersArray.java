package samplearrays;
import java.util.Arrays;
public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse=1270;
        int[] updatedCourses= new int [registeredCourses.length +1];
        for(int i=0;i< registeredCourses.length;i++){
            updatedCourses[i]=registeredCourses[i]  ;
        }
        updatedCourses[registeredCourses.length]=newCourse;
        System.out.println("updatedCourses : "+Arrays.toString(updatedCourses));

    }
}
