import java.util.ArrayList;
import java.util.Collections;

public class StaffManage {
    private ArrayList<Staff> staffList=new ArrayList<>();
    public void displayAllStaff(){
        System.out.println(staffList);
    }
    public void addNewStaff(Staff staff){
        staffList.add(staff);
    }
    public double getSalaryAverage(){
        double sumSalary=0;
        int staffAmount=staffList.size();
        if (staffAmount!=0){
        for (Staff staff:staffList) {
            sumSalary+=staff.getActualSalary();
        }
        double salaryAverage=sumSalary/staffAmount;
        return salaryAverage;
        }
        return 0;
    }
    public void displayStaffHasLowerSalary(){
        double salaryAverage=getSalaryAverage();
        for (Staff staff:staffList) {
            if (staff instanceof FulltimeStaff){
                int salary=staff.getActualSalary();
                if (salary<salaryAverage){
                    System.out.println(staff);
                }
            }
        }
    }
    public void displayTotalParttimeSalary(){
        int totalSalary=0;
        for (Staff staff:staffList) {
            if (staff instanceof ParttimeStaff){
                totalSalary+=staff.getActualSalary();
            }
        }
        System.out.println(totalSalary);
    }
    public ArrayList<FulltimeStaff> getFulltimeStaffList(){
        ArrayList<FulltimeStaff> fulltimeStaffList=new ArrayList<>();
        for (Staff staff:staffList) {
            if (staff instanceof FulltimeStaff){
                FulltimeStaff fulltimeStaff=(FulltimeStaff) staff;
                fulltimeStaffList.add(fulltimeStaff);
            }
        }
        return fulltimeStaffList;
    }
    public void sortAndDisplayFulltimeStaffBySalary(){
        ArrayList<FulltimeStaff> fulltimeStaffList=getFulltimeStaffList();
        ComparatorStaff comparatorStaff=new ComparatorStaff();
        Collections.sort(fulltimeStaffList,comparatorStaff);
        System.out.println(fulltimeStaffList);
    }
}
