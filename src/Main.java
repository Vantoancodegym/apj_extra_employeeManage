import java.util.Scanner;

public class Main {
    public static StaffManage staffManage=new StaffManage();
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new staff");
            System.out.println("2. Display all staff");
            System.out.println("3. Display staffs whose salary lower average");
            System.out.println("4. Display total of part time staffs 's salary");
            System.out.println("5. Sort and display all full time staffs base on increasing salary");
            System.out.println("0. Exit ");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewStaff();
                    break;
                case 2:
                    staffManage.displayAllStaff();
                    break;
                case 3:
                    staffManage.displayStaffHasLowerSalary();
                    break;
                case 4:
                    staffManage.displayTotalParttimeSalary();
                    break;
                case 5:
                    staffManage.sortAndDisplayFulltimeStaffBySalary();
                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice!=0);

    }
    public static void addNewStaff(){
        System.out.println("1. Add new fulltime staff");
        System.out.println("2. Add new parttime staff");
        int choice=Integer.parseInt(scanner.nextLine());
        boolean goodChoice=choice==1||choice==2;
        if (goodChoice){
            System.out.println("Enter staff id");
            int staffId=Integer.parseInt(scanner.nextLine());
            System.out.println("Enter full name");
            String fullName=scanner.nextLine();
            System.out.println("Enter mobile number");
            int mobileNumber=Integer.parseInt(scanner.nextLine());
            System.out.println("Enter age");
            int age=Integer.parseInt(scanner.nextLine());
            System.out.println("Enter email");
            String email=scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter bonus");
                    int bonus=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter penalty");
                    int penalty=Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter base salary");
                    int baseSalary=Integer.parseInt(scanner.nextLine());
                    Staff fulltimeStaff=new FulltimeStaff(staffId,fullName,mobileNumber,age,email,bonus,penalty,baseSalary);
                    staffManage.addNewStaff(fulltimeStaff);
                    break;
                case 2:
                    System.out.println("Enter total work hours");
                    int totalWorkHours=Integer.parseInt(scanner.nextLine());
                    Staff parttimeStaff=new ParttimeStaff(staffId,fullName,mobileNumber,age,email,totalWorkHours);
                    staffManage.addNewStaff(parttimeStaff);
                    break;
            }
        }else System.out.println("Wrong choice");
    }
}
