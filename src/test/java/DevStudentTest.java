import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevStudentTest {

    @Test
    void takeAcourse() throws Exception {
        DevStudent devStudent = new DevStudent("Philip",23,"098",false);
        String actual1 = devStudent.takeAcourse("Java");
        assertEquals("Java",actual1);

        String actual3 = devStudent.takeAcourse("Python");
        assertEquals("Python",actual3);

//        A case where selected course is not in the available list
        String actual2 = devStudent.takeAcourse("Physics");
        assertEquals("Course not available",actual2);
    }
}