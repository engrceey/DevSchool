public class Principal extends PersonBio{

    public Principal(String name, int age, String id) {
        super(name, age, id);
    }

    public void createClass(String scClass){
        SchoolClasses schoolClasses = new SchoolClasses();
        System.out.println(schoolClasses.createClasses(scClass));
    }

    public String AdmitApplicant(){
        Applicants applicants = new Applicants("John",19,"007",67);
        System.out.println(applicants.knowYourAdmissionStatus());
        return applicants.knowYourAdmissionStatus();
    }

    public String expelStudent(String name){
        DevStudent devStudent = new DevStudent("John",23,"008",true);
        if(devStudent.isCharacter()){
            System.out.println("Expeled");
            return "Expeled";
        }else {
            System.out.println("Not Expeled");
            return "Not Expeled";
        }
    }

}
