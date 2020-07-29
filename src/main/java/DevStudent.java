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

//    A method that enables students to take a course from available courses
    public String takeAcourse(String course) throws Exception {
        try {
            DevCourses devCourses = new DevCourses();
            devCourses.setCourse(course);
            return devCourses.getCourse();
        }catch (Exception e) {
            return "Course not available";
        }
    }

    public void setCharacter(boolean character) {
        this.character = character;
    }

//    Method that enables the student to change character
    public boolean isCharacter() {
        return character;
    }
}
