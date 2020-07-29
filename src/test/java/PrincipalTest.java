import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipalTest {

    @Test
    @DisplayName("Principal creates classes")
    void createClass() {
        SchoolClasses schoolClasses = new SchoolClasses();
        assertEquals("Frontend Created",schoolClasses.createClasses("Frontend"));

    }

    @Test
    @DisplayName("Principal Admits applicant")
    void admitApplicant() {
        Applicants applicants = new Applicants("John",19,"007",67);
        assertEquals("Congrats you are now a Student",applicants.knowYourAdmissionStatus());
    }

    @Test
    @DisplayName("Principal Expels student based on Character")
    void expelStudent() {
        DevStudent devStudent = new DevStudent("John",23,"008",true);
        boolean flag = devStudent.isCharacter();
        assertEquals(true,flag);
    }
}