import java.util.HashSet;
import java.util.Set;

public class Faculty {
    private String fName;


    private Set<String> fSpecialties;
    public Faculty(String fName) {
        this.fName = fName;
    }


    public void addSpecialty(String name){
        if (this.fSpecialties == null) {
            fSpecialties = new HashSet<>();
        }
        this.fSpecialties.add(name);
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Set<String> getfSpecialties() {
        return fSpecialties;
    }

    public void setfSpecialties(Set<String> fSpecialties) {
        this.fSpecialties = fSpecialties;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "fName='" + fName + '\'' +
                ", fSpecialties=" + fSpecialties +
                '}';
    }
}

