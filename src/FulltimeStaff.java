public class FulltimeStaff extends Staff{
    private int bonus;
    private int penalty;
    private int baseSalary;
    public FulltimeStaff(int staffId, String fullName, int mobileNumber,
                         int age, String email, int bonus, int penalty, int baseSalary) {
        super(staffId, fullName, mobileNumber, age, email);
        this.bonus = bonus;
        this.penalty = penalty;
        this.baseSalary = baseSalary;
    }
    @Override
    public int getActualSalary(){
        int actualSalary=baseSalary+bonus-penalty;
        return actualSalary;
    }

    @Override
    public String toString() {
        return "FulltimeStaff{" +super.toString()+
                "bonus=" + bonus +
                ", penalty=" + penalty +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
