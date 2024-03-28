
import java.util.*;

// Department class
class Department 
{
    private String deptCode;
    private String deptName;
    private String building;
    private int yearFounded;

    public Department(String deptCode, String deptName, String building, int yearFounded) 
    {
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.building = building;
        this.yearFounded = yearFounded;
    }

    // Getter Method
    public String getDeptCode() 
    {
        return deptCode;
    }

    public String getDeptName() 
    {
        return deptName;
    }

    public String getBuilding() 
    {
        return building;
    }

    public int getYearFounded() 
    {
        return yearFounded;
    }
}

// Person class as a base class for Teaching_Staff and Student_Details to accept values like id,name,mobilenumber,email,deptCode
class Person 
{
    private int id;
    private String name;
    private String mobileNumber;
    private String email;
    private String deptCode;

    public Person(int id, String name, String mobileNumber, String email, String deptCode) 
    {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.deptCode = deptCode;
    }


    // getter method
    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public String getMobileNumber() 
    {
        return mobileNumber;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getDeptCode() 
    {
        return deptCode;
    }
}

// Teaching_Staff class inheriting from Person
class Teaching_Staff extends Person 
{
    private String qualification;
    private Date dateOfJoining;

    public Teaching_Staff(int id, String name, String mobileNumber, String email, String deptCode, String qualification, Date dateOfJoining) 
    {
        super(id, name, mobileNumber, email, deptCode);
        this.qualification = qualification;
        this.dateOfJoining = dateOfJoining;
    }

    // getters

    public String getQualification() 
    {
        return qualification;
    }

    public Date getDateOfJoining() 
    {
        return dateOfJoining;
    }
}

// Student_Details class inheriting from Person
class Student_Details extends Person 
{
    private int teacherCode;

    public Student_Details(int id, String name, String mobileNumber, String email, String deptCode, int teacherCode) 
    {
        super(id, name, mobileNumber, email, deptCode);
        this.teacherCode = teacherCode;
    }

    public int getTeacherCode() 
    {
        return teacherCode;
    }
}

// Student_Marks class
class Student_Marks 
{
    private int studentId;
    private int semesterNumber;
    private int[] marks;

    public Student_Marks(int studentId, int semesterNumber, int[] marks) 
    {
        this.studentId = studentId;
        this.semesterNumber = semesterNumber;
        this.marks = marks;
    }

    public int getStudentId() 
    {
        return studentId;
    }

    public int getSemesterNumber() 
    {
        return semesterNumber;
    }

    public int[] getMarks() 
    {
        return marks;
    }

    public int calculateTotal() 
    {
        int total = 0;
        for (int mark : marks) 
        {
            total += mark;
        }

        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / (double) marks.length;
    }
}

public class Stud_info 
{
    public static void main(String[] args) 
    {
        // Create department objects
        Department cseDept = new Department("CSE", "Computer Science", "A-Building", 1990);
        Department eceDept = new Department("ECE", "Electronics and Communication", "C-Building", 1985);


        // Create teaching staff objects
        Teaching_Staff prof1 = new Teaching_Staff(101, "Adhyan Agrawal", "1234567890", "adhyan@gmail.com", "CSE", "PhD", new Date());
        Teaching_Staff prof2 = new Teaching_Staff(102, "Raj Lodha", "9876543210", "raj@gmail.com", "ECE", "M.Tech", new Date());

        // Create student details objects
        Student_Details student1 = new Student_Details(201, "Vinit", "2345678901", "vinit@gmail.com", "CSE", 101);
        Student_Details student2 = new Student_Details(202, "Mayur", "3456789012", "mayur@gmail.com", "ECE", 102);
       
        // Create student marks objects
        int[] marks1 = {80, 85, 90, 95};
        int[] marks2 = {75, 90, 95, 95};

        Student_Marks studentMarks1 = new Student_Marks(201, 1, marks1);
        Student_Marks studentMarks2 = new Student_Marks(202, 1, marks2);
        

        // Display details and calculate total and average marks
        System.out.println("Student 1 Details:");
        System.out.println("Total Marks: " + studentMarks1.calculateTotal());
        System.out.println("Average Marks: " + studentMarks1.calculateAverage());

        System.out.println("\nStudent 2 Details:");
        System.out.println("Total Marks: " + studentMarks2.calculateTotal());
        System.out.println("Average Marks: " + studentMarks2.calculateAverage());

        
    }
}
