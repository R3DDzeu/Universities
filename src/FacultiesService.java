import java.util.HashSet;
import java.util.Set;

public class FacultiesService {
    private static FacultiesService facultiesService=null ;
    private Set<Faculty> faculties ;

    private FacultiesService() {
        this.faculties = new HashSet<>();

    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    public static FacultiesService getFacultiesService(){
        if(facultiesService == null)
            facultiesService = new FacultiesService();
        return facultiesService;
    }
    public boolean addFaculty(Faculty faculty) {
        return faculties.add(faculty);
    }
    public boolean facultyNameExists(String name){
        for(Faculty faculty: faculties) {
            if( faculty.getfName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean deleteFaculty(String name){
        for(Faculty faculty: faculties) {
            if( faculty.getfName().equals(name)) {
                faculties.remove(faculty);
                return true;
            }
        }
        return false;

    }
}
