
public class StudentClass {
    // instance variables
    int search_id;
    String firstName;
    String lastName;
    int firstid;

    // counter constructor
    public StudentClass() {
        firstid = 0;
        search_id = 0;
        firstName = "";
        lastName = "";
    }

    // set variables
    public void setid(String search_) {
        search_id = Integer.parseInt(search_);

    }

    public void setFirstName(String first_) {
        firstName = first_;
    }

    public void setLastName(String last_) {
        lastName = last_;
    }

    public void setFirstid(String firstid) {
        this.firstid = Integer.parseInt(firstid);

    }

    // get variables
    public int getId() {
        return search_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFirstid() {
        return firstid;
    }

    // display StudentInfo
    public void getStudentInfo() {
        System.out.print("Search ID: " + search_id + " ");
        System.out.print("First Name: " + firstName + " ");
        System.out.println("Last Name: " + lastName + " ");
    }
}
