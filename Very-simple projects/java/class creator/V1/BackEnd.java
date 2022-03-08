import java.util.Scanner;

public class BackEnd {
    Scanner input = new Scanner(System.in);

    private Information[] arrInfo; //an array of information class
    private int nbInfo; //counter
    private static final int MAX_SIZE = 20;

    public BackEnd() {
        arrInfo = new Information[MAX_SIZE];
        nbInfo = 0;
    }

    public void addSection(String teacherName, String subjectName, int sectionNumber, int classTime) {
        if (arrInfo.length == nbInfo) { //means array is full, won't add
            System.out.println("Not added! ... is full");
            return;
        }
        arrInfo[nbInfo] = new Information(); //creating an object to use setters
        arrInfo[nbInfo].setTeacherName(teacherName);
        arrInfo[nbInfo].setSubjectName(subjectName);
        arrInfo[nbInfo].setSectionNumber(sectionNumber);
        arrInfo[nbInfo].setClassTime(classTime);
        nbInfo++;
        System.out.println("Section successfully added!");
    }

    public int search(int sectionNumber) { //find index of array using section number
        for (int i = 0; i < nbInfo; i++)
            if (arrInfo[i].getSectionNumber() == sectionNumber)
                return i;
        return -1;
    }

    public String labStatusPrint(int x) {
            if (!arrInfo[x].getLabName().equalsIgnoreCase("NA"))
                return "updated!";
        return "added!";
    }

    public void addLab(int sectionNumber) { //add new Lab Name using section number
        int index = search(sectionNumber);
        if (index == -1) {
            System.out.println("Section number not found!");
            return;
        }

        System.out.print("Enter Lab name: ");
        String Lab = input.next();

        for (int i = 0; i < nbInfo; i++) //check if lab available to book it
            if (arrInfo[i].getLabName().equalsIgnoreCase(Lab)) {
                System.out.println("Lab is already taken by section number: " + arrInfo[i].getSectionNumber());
                return;
            }

        String t; //to change add message
        if (!arrInfo[index].getLabName().equalsIgnoreCase("NA"))
            t = "updated!";
        else
            t = "added!";

        arrInfo[index].setLabName(Lab);
        System.out.println("Lab successfully " + t);
    }

    public void display() { //show status
        if (nbInfo == 0) {
            System.out.println("There's no sections to display");
            return;
        }
        for (int i = 0; i < nbInfo; i++)
            arrInfo[i].display();
    }
}
