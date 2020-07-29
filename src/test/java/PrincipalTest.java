import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipalTest {

    @Test
    @DisplayName("")
    void createClass() {
        SchoolClasses schoolClasses = new SchoolClasses();
        assertEquals("Frontend Created",schoolClasses.createClasses("Frontend"));

    }

    @Test
    void admitApplicant() {
        Applicants applicants = new Applicants("John",19,"007",67);
        assertEquals("Congrats you are now a Student",applicants.knowYourAdmissionStatus());
    }

    @Test
    void expelStudent() {
        DevStudent devStudent = new DevStudent("John",23,"008",true);
//        assertEquals("Expeled",devStudent.isCharacter());
        assertEquals(true,devStudent.isCharacter());

    }
}