import java.util.Comparator;

public class ComparatorStaff implements Comparator<FulltimeStaff> {

    @Override
    public int compare(FulltimeStaff o1, FulltimeStaff o2) {
        int salary1=o1.getActualSalary();
        int salary2=o2.getActualSalary();
        if (salary1>salary2)return 1;
        if (salary1<salary2) return -1;
        return 0;
    }
}
