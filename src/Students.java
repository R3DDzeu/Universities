public class Students {
    private String firstName;
    private String lastName;
    private String telephoneNr;
    private String group;

    public Students(String firstName, String lastName, String telephoneNr, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNr = telephoneNr;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNr() {
        return telephoneNr;
    }

    public void setTelephoneNr(String telephoneNr) {
        this.telephoneNr = telephoneNr;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNr='" + telephoneNr + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
