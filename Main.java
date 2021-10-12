package Mod3_Week2_HW3;

import java.util.*;

public abstract class Main {


    public static void main(String args[]) {
        String input;
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<Person>();

        do {
            System.out.println("Person Information");
            System.out.println("1. Add a new Student");
            System.out.println("2. Add a new Employee");
            System.out.println("3. Exit");

            System.out.print("Please enter either 1 to 3: ");
            input = (scanner.nextLine());

            if (input.equals("1")) {
                Student s1 = new Student();
                System.out.println("Please enter Student's Name: ");
                s1.setName(scanner.nextLine());
                System.out.println("Please enter Student's Age: ");
                s1.setAge(scanner.nextInt());
                System.out.println("Please enter Student's Gender: ");
                s1.setGender(scanner.next().charAt(0));
                System.out.println("Enter Student's First Subject Grade: ");
                s1.setSubjectOne(scanner.nextDouble());
                System.out.println("Enter Student's Second Subject Grade: ");
                s1.setSubjectTwo((scanner.nextDouble()));
                System.out.println("Enter Student's Third Subject Grade: ");
                s1.setSubjectThree((scanner.nextDouble()));
                persons.add(s1);
                s1.displayStudent();
                s1.intToDouble();
                s1.averageScore();
                s1.oldEnough();
            } else if (input.equals("2")) {
                Employee e1 = new Employee();
                System.out.println("Please enter Employee's Name: ");
                e1.setName(scanner.nextLine());
                System.out.println("Please enter Employee's Age: ");
                e1.setAge(scanner.nextInt());
                System.out.println("Please enter Employee's Gender: ");
                e1.setGender(scanner.next().charAt(0));
                System.out.println("Please enter Employee's Position: ");
                e1.setTitle(scanner.nextLine());
                System.out.println("Please enter Employee's Salary: ");
                e1.setSalary(scanner.nextDouble());
                System.out.println("Please enter Years With Company: ");
                e1.setYearsWithCompany(scanner.nextInt());
                persons.add(e1);
                e1.displayEmployee();
                e1.oldEnough();
            }
        } while (input.equals("4"));
        {
            System.out.println("Exit");
        }

    }
    }





