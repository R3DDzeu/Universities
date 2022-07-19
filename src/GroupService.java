import java.util.HashSet;
import java.util.Set;

public class GroupService {
    private static GroupService groupsService=null ;
    private Set<String> groupsNames ;

    private GroupService() {
        this.groupsNames = new HashSet<>();

    }

    public Set<String> getGroupsNames() {
        return groupsNames;
    }

    public static GroupService getGroupsService(){
        if(groupsService == null)
            groupsService = new GroupService();
        return groupsService;
    }
    public boolean addGroup(String group) {
        return groupsNames.add(group);
    }
    public boolean groupNameExists(String name){
        for(String group: groupsNames) {
            if( group.equals(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean deleteGroup(String name){
        for(String group: groupsNames) {
            if(group.equals(name)) {
                groupsNames.remove(group);
                return true;
            }
        }
        return false;

    }
}


