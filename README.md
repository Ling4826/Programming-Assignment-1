# Student Data Sorting and Searching Program

This program is designed to sort and search student data from a CSV file. Follow the instructions below to use the program effectively.

---

## Prerequisites
1. Ensure you have **Java** installed on your system.
2. Prepare a CSV file containing the student data.
   - **Important:** The CSV file must be saved once through **Visual Studio Code (VS Code)** or a similar text editor before using it with this program. This ensures proper formatting and compatibility.
3. Save the CSV file in the `D:\CsvFile` directory on your system.

---

## Supported Commands

### 1. **Sort by ID**
Sorts the student data numerically by their ID.

**Command:**
```bash
java p1 -n <filename>
```

---

### 2. **Sort by FirstName**
Sorts the student data alphabetically by their first name.

**Command:**
```bash
java p1 -f <filename>
```

---

### 3. **Sort by Last Name**
Sorts the student data alphabetically by their last name.

**Command:**
```bash
java p1 -l <filename>
```

---

### 4. **Search by FirstName**
Searches for a specific student record using their firstname.

**Command:**
```bash
java p1 -s <filename>
Enter FirstName: Name
```

---

## Notes
- Replace `<filename>` with the name of your CSV file, including its extension (e.g., `students.csv`).
- Ensure the CSV file is:
  1. Properly formatted.
  2. Saved through **VS Code** or another compatible text editor before use.
  3. Stored in the directory `D:\CsvFile`.

---

## Example
Assume you have a CSV file named `students.csv` stored in `D:\CsvFile`.

To sort by name, use:
```bash
java p1 -n students.csv
```

To search for a student by their FirstName, use:
```bash
java p1 -s students.csv
Enter FirstName: KAN
```

---

## Additional Features
- You can double-click the `p1` file to open it in **VS Code** or any text editor to review or edit its content.
- Open a terminal in **VS Code** or another terminal application and type the commands directly to run the program.
