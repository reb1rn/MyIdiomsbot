package company.com;

public class User implements Comparable {
    public String userFirstName;
    public int userRecord;
    public  String id;

    public User(String userFirstName, int userRecord,String id) {
        this.userFirstName = userFirstName;
        this.userRecord = userRecord;
        this.id=id;
    }

    public int getUserRecord() {
        return userRecord;
    }

    @Override
    public int compareTo(Object o) {
        int compare=((User)o).getUserRecord();
        return compare-this.userRecord;
    }
}