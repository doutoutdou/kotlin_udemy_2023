package challenge6.javacode;

public class Employee {

    private String firstname;
    private String lastName;
    private int startYear;
    private float[] salaryLast3Years;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public float[] getSalaryLast3Years() {
        return salaryLast3Years;
    }

    public void setSalaryLast3Years(float[] salaryLast3Years) {
        this.salaryLast3Years = salaryLast3Years;
    }

    public Employee(String firstname, String lastName, int startYear) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.startYear = startYear;
        this.salaryLast3Years = new float[3];
    }
}
