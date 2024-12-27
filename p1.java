
import java.util.Vector;
import java.io.IOException;

public class p1 {

    public static void main(String[] args) throws IOException {
        // get input form Terminal
        // if -n is provided, sort by name
        // if -f is provided, sort by first id
        // if -l is provided, sort by last name
        // if -s is provided, search by first id and print index

        // process arguments and call appropriate methods to sort and search students

        // example usage: java p1 -n input.csv
        // example usage: java p1 -f input.csv
        // example usage: java p1 -l input.csv
        // example usage: java p1 -s input.csv

        // call process method with appropriate arguments and display results
        if (args.length == 2 && args[0].equals("-n")) {
            String filename = args[1];

            Vector<StudentClass> StudentList = process(filename, 1);

            displayVector(StudentList);
        } else if (args.length == 2 && args[0].equals("-f")) {
            String filename = args[1];

            Vector<StudentClass> StudentList = process(filename, 2);

            displayVector(StudentList);
        } else if (args.length == 2 && args[0].equals("-l")) {
            String filename = args[1];

            Vector<StudentClass> StudentList = process(filename, 3);

            displayVector(StudentList);
        } else if (args.length == 2 && args[0].equals("-s")) {
            String filename = args[1];

            Vector<StudentClass> StudentList = process(filename, 4);
            // try catching index in StudentList
            try {
                System.out.println("found at index " + StudentList.get(0).getFirstid());
                System.out.print("Search ID: " + StudentList.get(0).getId() + " ");
                System.out.print("First Name: " + StudentList.get(0).getFirstName() + " ");
                System.out.println("Last Name: " + StudentList.get(0).getLastName() + " ");
            } catch (Exception e) {
                System.out.println("Student not found");
            }

        }

    }

    public static Vector<StudentClass> process(String filename, int i) throws IOException {
        // get file, sort and return the vector
        FileInput file = new FileInput(filename);

        // make class StudentList
        Vector<StudentClass> StudentList = file.returnVector();
        // sortStudentclass
        SearchClass Sorter = new SearchClass(StudentList);

        if (i == 1) {
            StudentList = Sorter.SortbyID();
        } else if (i == 2) {
            StudentList = Sorter.SortbyFirstName();
        } else if (i == 3) {
            StudentList = Sorter.SortbyLastName();
        } else if (i == 4) {
            StudentList = Sorter.Search();
        }
        return StudentList;

    }

    public static void displayVector(Vector<StudentClass> v) {
        for (StudentClass c : v) {
            c.getStudentInfo();
        }
    }
}
