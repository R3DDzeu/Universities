import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static Set<University> universitySet = new HashSet<>();
    private static FacultiesService fservice = FacultiesService.getFacultiesService();
    private static GroupService gservice = GroupService.getGroupsService();

    private static StudentsService eservice = StudentsService.getStudentService();

    private static boolean addUni() {
        System.out.println("Add University Name:");
        String name = scanner.nextLine();

        System.out.println("Add University Adress:");
        String adress = scanner.nextLine();

        University university = new University(name, adress);
        return universitySet.add(university);
    }

    private static boolean addFac() {
        System.out.println("Enter the name of an existing University first:");
        String uniName = scanner.nextLine();
        boolean uniExist = false;
        for (University university : universitySet) {
            if (university.getName().equals(uniName)) {
                uniExist = true;
                break;
            }
        }
        if (!uniExist) {
            return false;
        } else {
            System.out.println("Add Faculty Name:");
            String fname = scanner.nextLine();
            System.out.println("Add Specialties separated by spacebar");
            String[] fspec = scanner.nextLine().split(" ");
            Set<String> targetSet = new HashSet<String>(Arrays.asList(fspec));
            if (fservice.facultyNameExists(fname)) {
                Faculty faculty = new Faculty(fname);
                faculty.setfSpecialties(targetSet);
                fservice.addFaculty(faculty);
                return true;
            } else {
                return false;

            }
        }
    }

    private static boolean delFac() {
        System.out.println("Type in Faculty's name to be deleted");
        String fName = scanner.nextLine();
        return fservice.deleteFaculty(fName);
    }


    private static boolean addStu() {
        System.out.println("Enter the name of an existing group first:");
        String gName = scanner.nextLine();
        boolean gExist = false;
        for (String group : gservice.getGroupsNames()) {
            if (group.equals(gName)) {
                gExist = true;
                break;
            }
        }
        if (!gExist) {
            return false;
        } else {
            System.out.println("Add First Name:");
            String fname = scanner.nextLine();
            System.out.println("Add Last Name");
            String lname = scanner.nextLine();
            System.out.println("Add Telephone Number");
            String tNr = scanner.nextLine();
            Students student = new Students(fname, lname, tNr, gName);
            StudentsService.getStudentService().addStudent(fname);
            return true;
        }
    }

    private static boolean delStudent() {
        System.out.println("Type in Student's name to be deleted");
        String sName = scanner.nextLine();
        return eservice.deleteStudent(sName);
    }


    private static boolean addGrp() {
        System.out.println("Enter the name of an existing faculty first:");
        String fName = scanner.nextLine();
        boolean fExist = false;
        for (Faculty faculty : fservice.getFaculties()) {
            if (faculty.getfName().equals(fName)) {
                fExist = true;
                break;
            }
        }
        if (!fExist) {
            return false;
        } else {
            System.out.println("Add Specialty");
            String sname = scanner.nextLine();
            System.out.println("Add Group Name");
            String gname = scanner.nextLine();
            Group group = new Group(fName, sname, gname);
            GroupService.getGroupsService().addGroup(fName);
            return true;
        }
    }

    private static boolean delGroup() {
        System.out.println("Type in Group's name to be deleted");
        String sName = scanner.nextLine();
        return gservice.deleteGroup(sName);
    }

    public static void displayBrief() {
        System.out.println("Type in the University name");
        String university= scanner.nextLine();
        for (University uni : universitySet) {
            if (uni.getName().equals(university)) {
                System.out.println(uni);
            }
        }
    }

    public static void displaySpec(){
        System.out.println("Enter faculty name:");
        String faculty = scanner.nextLine();
       for (Faculty fac: fservice.getFaculties()){
           if(fac.getfName().equals(faculty)){
               System.out.println(fac.getfSpecialties());
           }
       }
    }

    public static void displayGroups(){
        System.out.println("Enter faculty name:");
        String faculty = scanner.nextLine();
        for (Faculty group: fservice.getFaculties()){
            if(group.getfName().equals(faculty)){
                System.out.println(group.getfName());
            }
        }}

    public static void displayGS(){
       // System.out.println("Enter group's name:");
      //  String group = scanner.nextLine();
      //  for(Students stu: eservice.getStudentNames())
    }




    public static void displayComplete(){}


    public static void main(String[] args) {
        System.out.println("Press 1 to add a new University \n " +
                "Press 2 to Add a new faculty \n " +
                "Press 3 to delete an existing faculty \n " +
                "Press 4 to add a new group  \n"+
                "Press 5 to remove an existing group  \n" +
                "Press 6 to add a student \n"+
                "Press 7 to remove a student \n"+
                "Press 8 to acces the reports menu \n" +
                "Press 9 to exit the program"
                );
        int menu=scanner.nextInt();
        switch(menu) {
            case 1: addUni(); break;
            case 2: addFac(); break;
            case 3: delFac(); break;
            case 4: addGrp(); break;
            case 5: delGroup(); break;
            case 6: addStu(); break;
            case 7: delStudent(); break;
            case 8:

                System.out.println("Press 1 to display brief info about the university\n"
                + "Press 2 to display complete information about university\n"
                +"Press 3 to display all specialties of a particular faculty\n"
                +"Press 4 to display all groups of a particular faculty\n"
                +"Press 5 to display all students of a particular group\n" +" Press 6 to exit");
              int  menu2=scanner.nextInt();
                switch(menu2){

                    case 1 :
                        displayBrief();break;
                    case 2 :
                        displayComplete();break;
                    case 3 :
                        System.out.println("Enter faculty name");
                    displaySpec();break;
                    case 4:
                        System.out.println("Enter faculty name");
                    displayGroups();break;
                    case 5:
                        System.out.println("Enter group name:");
                    displayGS(); break;
                    case 6: break;


                }
            case 9: break;



        }



    }


}










