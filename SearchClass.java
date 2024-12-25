import java.util.Vector;
import java.util.Scanner;

class Sortclass {
    static Vector<StudentClass> StudentList = new Vector<>();

    // constructor for sorting classes
    public Sortclass(Vector<StudentClass> S) {
        StudentList = S;
    }

    public Vector<StudentClass> SortbyFirstName() {
        // Sort by first name
        for (int j = 0; j < StudentList.size() - 1; j++) {
            for (int i = 0; i < StudentList.size() - 1; i++) {
                // Get the first name
                char Name1 = StudentList.get(i).getFirstName().charAt(0);
                char Name2 = StudentList.get(i + 1).getFirstName().charAt(0);
                // Compare the first names and swap them if necessary if the first name is
                // greater.
                if (Name1 > Name2) {

                    StudentClass v = StudentList.get(i + 1);
                    StudentList.set(i + 1, StudentList.get(i));
                    StudentList.set(i, v);
                }
            }
        }
        return StudentList;
    }

    public Vector<StudentClass> SortbyLastName() {
        for (int j = 0; j < StudentList.size() - 1; j++) {
            for (int i = 0; i < StudentList.size() - 1; i++) {
                char Name1 = StudentList.get(i).getLastName().charAt(0);
                char Name2 = StudentList.get(i + 1).getLastName().charAt(0);
                if (Name1 > Name2) {
                    StudentClass v = StudentList.get(i + 1);
                    StudentList.set(i + 1, StudentList.get(i));
                    StudentList.set(i, v);
                }
            }
        }
        return StudentList;
    }

    public Vector<StudentClass> SortbyID() {
        for (int j = 0; j < StudentList.size() - 1; j++) {
            for (int i = 0; i < StudentList.size() - 1; i++) {
                int Name1 = StudentList.get(i).getId();
                int Name2 = StudentList.get(i + 1).getId();
                if (Name1 > Name2) {
                    StudentClass v = StudentList.get(i + 1);
                    StudentList.set(i + 1, StudentList.get(i));
                    StudentList.set(i, v);
                }
            }
        }
        return StudentList;
    }
}

public class SearchClass extends Sortclass {
    // Search class constructor
    public SearchClass(Vector<StudentClass> v) {
        // call superclass
        super(v);
    }

    public Vector<StudentClass> Search() {
        // input name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter FirstName: ");
        String FirstName = scanner.next().trim();
        // search by first name and return result
        Vector<StudentClass> result = new Vector();
        Vector<StudentClass> firstNameList = SortbyFirstName();
        // loop to find the first name in the sorted list and add it to the result list
        for (int i = 0; i < firstNameList.size(); i++) {
            // if first name is found, add it to the result list
            if (firstNameList.get(i).getFirstName().equals(FirstName)) {
                result.add(firstNameList.get(i));
            } else {
                continue;
            }

        }

        return result;
    }
}
