public class StudentManagmentSystem {
    public static String name;
    public static String dob;
    public static String branch;
    public static String regNo;
    public static byte age;


    private StudentManagmentSystem(String name,String dob, String branch) {
        this.name = name;
        this.dob = dob;
        this.branch = branch;

        genrateAge(dob);
        genrateRegNo(branch);
    }

    void genrateAge(String dob){
        String[] dobParts = dob.split("/");
        int year = Integer.parseInt(dobParts[2]);
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        age = (byte) (currentYear - year);
    }

    void genrateRegNo(String branch){

        regNo = 2024 + "B" + branch.toUpperCase() +"001";
    }

    void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Branch: " + branch);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + regNo);
    }
    public static void main(String[] args) {
        StudentManagmentSystem st1 = new StudentManagmentSystem("Om", "14/08/2005", "IT");
        st1.displayStudentDetails();
        System.out.println("-------------------------------------------------");
    }
}
