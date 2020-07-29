import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicantsTest {

    @Test
    @DisplayName("Applicants can get Admission status")
    void knowYourAdmissionStatus() {
    Applicants applicants = new Applicants("john",20,"002",65);
    boolean flag = applicants.getAge() >= 19 && applicants.getTestScore() > 60;
    assertEquals(true,flag);
    }
}