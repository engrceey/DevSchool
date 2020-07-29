public class Applicants extends PersonBio{
    private int testScore;


    public Applicants(String name, int age, String id, int testScore) {
        super(name, age, id);
        this.testScore = testScore;
    }


    public String knowYourAdmissionStatus(){
        if(testScore >= 60 && super.getAge() >= 18){
            return "Congrats you are now a Student";
        }else{
            return "Not admitted, Please Try again";
        }
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getId() {
        return super.getId();
    }
}
