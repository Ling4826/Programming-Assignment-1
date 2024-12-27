
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.io.IOException;

class InputStudent {
    static Vector<StudentClass> StudentList = new Vector<>();

    public InputStudent(String s) throws IOException {

        // get file
        File file = new File(s);
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        // change File to scanned
        Scanner F = new Scanner(file);
        // check if the file is empty
        if (!F.hasNextLine()) {
            System.out.println("File is not in correct format");
            return;
        }
        // Student object and add it to the List.
        while (F.hasNextLine()) {
            // Skip metadata lines until student data starts
            String line = F.nextLine().trim();

            // skip line
            if (skipline(line)) {
                continue; // skip
            }
            // skip line
            readline(line);
        }

    }

    public boolean skipline(String line) {
        int checkError = 0;
        boolean skipline = false;
        // line is empty
        if (line.isEmpty()) {
            skipline = true;
        }
        // get ling in str tokens
        String[] tokens = line.split(",");

        // check if tokens column is less than 4
        if (tokens.length < 4) {
            skipline = true;
        } else if (tokens.length > 4) {
            skipline = true;
        } else {
            for (int M = 0; M < 4; M++) {
                String chack = tokens[M];
                if (chack.equals("")) {
                    skipline = true;
                    continue;
                } else if (M == 0 || M == 1) {
                    try {
                        checkError = Integer.parseInt(chack);
                    } catch (Exception e) {
                        skipline = true;
                    }
                } else if (M == 3) {
                    try {
                        checkError = Integer.parseInt(chack);
                        skipline = true;
                    } catch (Exception e) {

                    }
                }

            }
        }

        return skipline;
    }

    public void readline(String line) {
        // Create a new Student object.
        StudentClass St = new StudentClass();
        // Split the line into tokens using comma as the delimiter.
        StringTokenizer st = new StringTokenizer(line, ",");

        for (int i = 0; i < 4; i++) {
            // Read the line and split each line by comma
            String S = st.nextToken();
            // Set the properties of the Student object based on the split line.
            if (i == 0) {
                // Read the properties of the Student object
                St.setFirstid(S);
            }
            if (i == 1) {

                St.setid(S);
            } else if (i == 2) {

                St.setFirstName(S);
            } else if (i == 3) {

                St.setLastName(S);

            }

        }
        // Add the Student object to the List.
        StudentList.add(St);
    }

    // return Vector
    public static Vector<StudentClass> returnVector() {

        return StudentList;
    }
}

public class FileInput extends InputStudent {
    // constructor for FileInput class to get file path
    public FileInput(String filename) throws IOException {
        super(Fileinput(filename));
    }

    public static String Fileinput(String filename) {
        // get file path from console
        String path = "D:\\CsvFile\\" + filename;
        // return file path
        return path;
    }

}
