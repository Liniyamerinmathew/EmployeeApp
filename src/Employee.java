import java.util.Scanner;

public class Employee {
    public static Employee[] EmployeeArray = new Employee[5];
    public  String Empname;
    public  String Designation;
    public  String PhoneNumb;
    public String Email;
    public  int Empcode;
    public  int Salary;

    public void Employee() {

        Scanner n = new Scanner(System.in);

        System.out.println("Employee code: ");
        Empcode=n.nextInt();
        System.out.println("Employee Name: ");
       Empname=n.next();
        System.out.println("Designation: ");
       Designation=n.next();
        System.out.println("Salary ");
        Salary=n.nextInt();
        System.out.println("Phone number: ");
        PhoneNumb=n.next();
        System.out.println("Email: ");
        Email=n.next();
    }
    public static void AddEmp() {
        for (int i = 0; i < 5; i++) {
            Employee e = new Employee();
            EmployeeArray[i] = e;
        }
    }


    public static void main (String[] args){
            int option;
    Scanner sc = new Scanner(System.in);
        System.out.println("Choose your option : 1. Add Employee \n 2. View All \n 3. Search an Employee \n 4. Delete an Employee\n 5. Exit");
    option = sc.nextInt();
        switch (option) {
        case 1:
            AddEmp();
            break;
        case 2:
            ViewAll();
            break;
        case 3:
            SearchAnEmp();
            break;
        case 4:
            DeleteAnEmp();
            break;

        default:
            System.out.println("Invalid option");
}
     {

}


