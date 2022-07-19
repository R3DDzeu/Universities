public class Group {
    private String gName;
    private String gSpec;
    private String fName;



    public Group(String gName, String gSpec, String fName) {
        this.gName = gName;
        this.gSpec = gSpec;
        this.fName = fName;
    }
    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgSpec() {
        return gSpec;
    }

    public void setgSpec(String gSpec) {
        this.gSpec = gSpec;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "gName='" + gName + '\'' +
                ", gSpec='" + gSpec + '\'' +
                ", fName='" + fName + '\'' +
                '}';
    }
}
