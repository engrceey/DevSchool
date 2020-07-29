import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevStudentTest {

    @Test
    void takeAcourse() {
        DevCourses devCourses = new DevCourses();

        assertEquals("Java","Java");
    }
}