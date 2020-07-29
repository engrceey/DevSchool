public class Teachers extends PersonBio{
    private String teachCourse;

    public Teachers(String name, int age, String id) {
        super(name, age, id);
    }

//    A method that enables a teacher to teach a course from courses class
    public String teachCourse(String course) throws Exception {
        try{
            DevCourses devCourses = new DevCourses();
            devCourses.setCourse(course);
            return devCourses.getCourse();
        }catch (Exception e) {
            return "Course not available to teach";
        }

    }
}
