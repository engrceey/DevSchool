import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DevCoursesTest {

    @Test
    @DisplayName("Principal creates classes")
    void setCourse() throws Exception {
        DevCourses devCourses = new DevCourses();
        devCourses.setCourse("Java");
        boolean flag = (devCourses.getCourse()).equals("Java");
        Assertions.assertTrue(flag);
    }
}