package Mod3_Week2_HW3;
import java.util.Scanner;


public abstract class Person implements PersonInterface {
    String name;
    int age;
    char gender;
//    int id;
    public  Person(){

    }

//    public Person(String name, int age, char gender){
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        id++;
//    }
    void setName (String _name)
    {
        name = _name;
    }
    void setAge (int _age)
    {
        age = _age;
    }
    void setGender (char _gender)
    {
        gender = _gender;
    }
    String getName() {
        return name;
    }
    int getAge(){
        return age;
    }
    char getGender(){
        return gender;
    }



    void personDisplay() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());

    }
    public void intToDouble(){
        double myDouble = age;
        System.out.println(myDouble);
    }


}
