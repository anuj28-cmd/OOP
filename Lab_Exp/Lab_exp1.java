package OOP.Lab_Exp;
import java.util.Scanner;

class Participant {

    private static int counter ; // Counter for generating unique registration IDs
    private String registrationId;
    private String name;
    private long contactNumber;
    private String branch;
    static{
        counter = 1001;
    }

    public Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        this.registrationId = "D"+(counter);
        counter++;    }

    public String getRegistrationId() {
        return registrationId;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }
}

public class Lab_exp1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter student1 name : ");
        String str1 = sc.nextLine();
        System.out.println("enter student1 contact number: ");
        long str1_con = sc.nextLong();
        System.out.println("enter student1 Branch : ");
        sc.nextLine();
        String str1_branch= sc.nextLine();

        Participant participant1 = new Participant(str1, str1_con, str1_branch);


        System.out.println("enter student2 name : ");
        String str2 = sc.nextLine();
        System.out.println("enter student2 contact number: ");
        long str2_con = sc.nextLong();
        System.out.println("enter student2 Branch : ");
        sc.nextLine();
        String str2_branch= sc.nextLine();
        Participant participant2 = new Participant(str2, str2_con, str2_branch);

        Participant[] participants = {participant1, participant2};

        for (Participant participant : participants) {
            System.out.print("Hi " + participant.getName() + "! Your registration id is "
                    + participant.getRegistrationId());
            System.out.println(" Your branch is: " + participant.getBranch());
            System.out.println(); 
        }
    }
}