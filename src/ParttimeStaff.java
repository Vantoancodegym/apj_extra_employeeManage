public class ParttimeStaff extends Staff{
    public static final int WAGE_PER_AN_HOUR = 100000;
    private int taltolWorkHours;

    public ParttimeStaff(int staffId, String fullName, int mobileNumber, int age, String email, int taltolWorkHours) {
        super(staffId, fullName, mobileNumber, age, email);
        this.taltolWorkHours = taltolWorkHours;
    }
    @Override
    public int getActualSalary(){
        int actualSalary= taltolWorkHours * WAGE_PER_AN_HOUR;
        return actualSalary;
    }

    @Override
    public String toString() {
        return "ParttimeStaff{" +super.toString()+
                "taltolWorkTime=" + taltolWorkHours +
                '}';
    }
}
