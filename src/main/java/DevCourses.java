import java.util.ArrayList;

public class DevCourses {
    private String course;


    public String getCourse() {
        System.out.println(this.course);
        return course;
    }

//    Created a method that houses courses available
    public void setCourse(String course) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C#");
        list.add("Kotlin");
        list.add("Android");
        list.add("Python");
        list.add("Node");

        if(list.contains(course)){
            this.course = course;
        }else {
            throw new Exception("Course not Available");
        }
    }
}
