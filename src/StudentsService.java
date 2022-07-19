import java.util.HashSet;
import java.util.Set;

public class StudentsService {
    private static StudentsService studentsService=null ;
    private Set<String> studentNames ;

    public Set<String> getStudentNames() {
        return studentNames;
    }

    private StudentsService() {
        this.studentNames = new HashSet<>();

    }

    public static StudentsService getStudentService(){
        if(studentsService == null)
            studentsService = new StudentsService();
        return studentsService;
    }
    public boolean addStudent(String students) {
        return studentNames.add(students);
    }
    public boolean studentNameExists(String name){
        for(String group: studentNames) {
            if( group.equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean deleteStudent(String name){
        for(String student: studentNames) {
            if(student.equals(name)) {
                studentNames.remove(student);
                return true;
            }
        }
        return false;

    }
}

