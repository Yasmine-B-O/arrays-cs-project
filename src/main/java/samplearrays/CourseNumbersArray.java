package samplearrays;
import java.util.Arrays;
public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse=1270;
        int[] updatedCourses= new int [registeredCourses.length +1];
        System.arraycopy(registeredCourses,0,updatedCourses,0,registeredCourses.length);
        /*System.arraycopy(sourceArray, sourceStartIndex,
         destinationArray, destinationStartIndex, lengthToCopy);
         */
        updatedCourses[registeredCourses.length]=newCourse;
        System.out.println("updatedCourses : "+Arrays.toString(updatedCourses));

    }
}
