import java.util.HashSet;
import java.util.Set;

public class University {

    private String name;
    private String address;
    private Set<Faculty> faculties;

    public University(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addFaculty(Faculty theFaculty) {
        if (this.faculties == null) {
            faculties = new HashSet<>();
        }
            this.faculties.add(theFaculty);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(Set<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}