
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Company> arrCompany = new ArrayList<>();
    public static ArrayList<Employee> arrEmployee = new ArrayList<>();
    public static ArrayList<Link> arrLink = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe", 1);
        Employee employee2 = new Employee("Susan", 2);
        Collections.addAll(arrEmployee, employee1, employee2);
        Company company1 = new Company("Company1", 1);
        Company company2 = new Company("Company2", 2);
        Collections.addAll(arrCompany, company1, company2);
        Link link1 = new Link(1, 1, 1, "2019", "Scientist");
        Link link2 = new Link(2, 2, 2, "2018", "Biologist");
        Collections.addAll(arrLink, link1, link2);
        String answerAddCo;
        String answerAddEm;
        String answerAddLink;
        String answerAdd;
        do {
            System.out.println("Would you like to add a company, add an employee, add a link or quit?\nc for company, e for employee, l for link, q for quit");
            answerAdd = sc.next();
            switch (answerAdd) {
                case "c":
                    do {
                        System.out.println("Please enter Company ID: ");
                        int userCoID = sc.nextInt();
                        System.out.println("Please enter Company Name: ");
                        String userCoName = sc.next();
                        userCoName += sc.nextLine();
                        addNewCompany(userCoID, userCoName);
                        System.out.println("Would you like to add another company? (y/n)");
                        answerAddCo = sc.next();
                    } while (answerAddCo.equalsIgnoreCase("y"));
                    break;
                case "e":
                    do {
                        System.out.println("Please enter Employee ID: ");
                        int userEmID = sc.nextInt();
                        System.out.println("Please enter Employee Name: ");
                        String userEmployeeName = sc.next();
                        userEmployeeName += sc.nextLine();
                        addNewEmployee(userEmID, userEmployeeName);
                        System.out.println("Would you like to add another employee? (y/n)");
                        answerAddEm = sc.next();
                    } while (answerAddEm.equalsIgnoreCase("y"));
                    break;
                case "l":
                    do {
                        System.out.println("Please enter Link ID: ");
                        int userLink = sc.nextInt();
                        System.out.println("Please enter Employee ID: ");
                        int userLinkEmID = sc.nextInt();
                        System.out.println("Please enter Company ID: ");
                        int userLinkCoID = sc.nextInt();
                        addNewLink(userLink, userLinkEmID, userLinkCoID);
                        System.out.println("Would you like to add another link? (y/n)");
                        answerAddLink = sc.next();
                    } while (answerAddLink.equalsIgnoreCase("y"));
                    break;
            }
        }while (!answerAdd.equalsIgnoreCase("q"));

        for (Link l : arrLink) {
            for (Company c : arrCompany) {
                if (c.getCompanyID() == l.getCoID()) {
                    System.out.print(c.getCompanyName() + " ");
                    break;
                }
            }
            for (Employee e : arrEmployee) {
                if (e.getEmployeeID() == l.getPeopleID()) {
                    System.out.println(e.getEmployeeName());
                    break;
                }
            }
        }


    }

    public static void addNewEmployee(int x, String y) {
        Employee employee = new Employee();
        employee.setEmployeeID(x);
        employee.setEmployeeName(y);
        arrEmployee.add(employee);
    }

    public static void addNewCompany(int i, String j) {
        Company company = new Company();
        company.setCompanyID(i);
        company.setCompanyName(j);
        arrCompany.add(company);
    }

    public static void addNewLink(int a, int b, int c){
        Link link = new Link();
        link.setLinkID(a);
        link.setPeopleID(b);
        link.setCoID(c);
        arrLink.add(link);
    }

}



