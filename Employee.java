package Mod3_Week2_HW3;

public class Employee extends Person{
String title;
double salary;
int yearsWithCompany;

    void setTitle(String _title) {
        title = _title;
    }
     String getTitle() {
        return title;
    }

    void setSalary(double _salary) {
        salary = _salary;
    }
    double getSalary() {
        return salary;
    }
    void setYearsWithCompany(int _yearsWithCompany) {
        yearsWithCompany = _yearsWithCompany;
    }
    int getYearsWithCompany() {
        return yearsWithCompany;
    }

    void displayEmployee(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Title: " + getTitle());
        System.out.println("Salary: " + getSalary());
        System.out.println("Years With Company: " + getYearsWithCompany());
    }


    public void averageScore() {

    }

    public void oldEnough(){
        if(age >= 18){
            System.out.println(name + " is a Adult and can be hired");
        } else{
            System.out.println(name + " is a Minor and cannot be hired");
        }
    }

}
