import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeachersTest {

    @Test
    @DisplayName("Pick a class to teach from Dev courses")
    void teachCourse() throws Exception {
        Teachers teachers = new Teachers("Ben",57,"034");
        DevCourses devCourses = new DevCourses();
        boolean flag = "Java".equals(teachers.teachCourse("Java"));
        assertTrue(flag);

//        A case where selected course is not in the list
        boolean flag2 = "Maths".equals(teachers.teachCourse("Maths"));
        assertFalse(flag2);
    }
}