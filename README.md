# Student Data Sorting and Searching Program

This program is designed to sort and search student data from a CSV file. Follow the instructions below to use the program effectively.

## Prerequisites
1. Ensure you have **Java** installed on your system.
2. Prepare a CSV file containing the student data.
   - **Important:** The CSV file must be saved once through **Visual Studio Code (VS Code)** before using it with this program. This ensures proper formatting and compatibility.
3. Save the CSV file in the `D:\CsvFile` directory on your system.

## Supported Commands

### 1. **Sort by Name**
Sorts the student data alphabetically by their first name.

**Command:**
```bash
java p1 -n <filename>
```

---

### 2. **Sort by First ID**
Sorts the student data numerically by their first ID.

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

### 4. **Search by First ID**
Searches for a specific student record using their first ID.

**Command:**
```bash
java p1 -s <filename>
```

---

## Notes
- Replace `<filename>` with the name of your CSV file, including its extension (e.g., `students.csv`).
- Ensure the CSV file is:
  1. Properly formatted.
  2. Saved through **VS Code** before use.
  3. Stored in the directory `D:\CsvFile`.

## Example
Assume you have a CSV file named `students.csv` stored in `D:\CsvFile`.

To sort by name, use:
```bash
java p1 -n students.csv
```

To search for a student by their first ID, use:
```bash
java p1 -s students.csv
```

---

By following these instructions, you will be able to efficiently sort and search student data using this Java program. If you encounter any issues, double-check the formatting of your CSV file and its location.
