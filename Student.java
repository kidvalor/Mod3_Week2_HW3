package Mod3_Week2_HW3;

public class Student extends Person{
double subjectone;
double subjecttwo;
double subjectthree;
int count = 3;

void setSubjectOne(double _subjectone) {
        subjectone = _subjectone;
    }
    double getSubjectOne() {
        return subjectone;
    }
    void setSubjectTwo(double _subjecttwo) {
        subjecttwo = _subjecttwo;
    }
    double getSubjectTwo() {
        return subjecttwo;
    }
    void setSubjectThree(double _subjectthree) {
        subjectthree = _subjectthree;
    }
    double getSubjectThree() {
        return subjectthree;
    }

    public void averageScore(){
        System.out.println("Average Score: " + (subjectone + subjecttwo + subjectthree)/count);

    }
    void displayStudent(){
    System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Subject 1: " + getSubjectOne());
        System.out.println("Subject 2: " + getSubjectTwo());
        System.out.println("Subject 3: " + getSubjectThree());
    }
    public void oldEnough(){
        if(age >= 18){
            System.out.println(name + " is a Adult Student");
        } else{
            System.out.println(name + " is a Minor Student");
        }
    }
}
