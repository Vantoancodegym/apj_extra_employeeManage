public class Staff {
    private int staffId;
    private String fullName;
    private int mobileNumber;
    private int age;
    private String email;
    public Staff(){}

    public Staff(int staffId, String fullName, int mobileNumber, int age, String email) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.email = email;
    }

    public int getStaffId() {
        return staffId;
    }
    public int getActualSalary(){
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                "staffId=" + staffId +
                ", fullName='" + fullName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
