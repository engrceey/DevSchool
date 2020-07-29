public class DevStudent extends PersonBio{
    private String Department;
    private boolean character;


    public DevStudent(String name, int age, String id,boolean character) {
        super(name, age, id);
        this.character = character;
    }

    public void setDepartment(String dept) {
        this.Department = dept;
    }

    public String takeAcourse(String course) throws Exception {
        DevCourses devCourses = new DevCourses();
        devCourses.setCourse(course);
        return devCourses.getCourse();
    }

    public void setCharacter(boolean character) {
        this.character = character;
    }

    public boolean isCharacter() {
        return character;
    }
}
