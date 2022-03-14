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

    //case 4 and 5
    public static final int NUMBER_OF_WEEKS = 20; //for one semester
    WeekOption []arrWeeks = new WeekOption[NUMBER_OF_WEEKS];
    int weekCounter;


    public int numberOfLabs() {
        //when trying to add weeks with 0 labs,prevent him instantly
        weekCounter = 0;
        for (int i = 0; i < nbInfo; i++)
            if (!arrInfo[i].getLabName().equalsIgnoreCase("NA"))
                weekCounter++;
        return weekCounter;
    }

    public void addNewWeek(int week) {

        int x = numberOfLabs();
        int index = week - 1; //0-16 lengths

        if (index >= NUMBER_OF_WEEKS || index < 0) {
            System.out.println("Wrong week number, please chose a valid number");
            //Week number you entered is bigger than number of weeks in the semester
            return;
        }

        arrWeeks[index] = new WeekOption(x);

        for (int i = 0; i < x; i++)
            arrWeeks[index].add(arrInfo[i].getLabName());

        System.out.println("Labs successfully saved to week " + week);
    }

    public void printSpecificWeekNumber(int week) {
        int index = week - 1;
        if (index >= NUMBER_OF_WEEKS || index < 0) {
            System.out.println("Wrong week number, please chose a valid number");
            //Week number you entered is bigger than number of weeks in the semester
            return;
        }
        if (arrWeeks[index] != null)
        arrWeeks[index].print();
        else
            System.out.println("Week " + week + " wasn't added yet");
    }

    public void printSpecificWeek() {
        if (weekCounter == 0) {
            System.out.println("No labs were added to specific week");
            return;
        }
        System.out.print("Enter week number to pint labs: ");
        int week = input.nextInt();

        printSpecificWeekNumber(week);
    }
    //end case 4 and 5
}
//for case 4 -> Weekly add and print
class WeekOption {
    private String[] LabName;
    private int nb;

    WeekOption(int size) {
        LabName = new String[size];
        nb = 0;
    }

    public void add(String e) {
        LabName[nb++] = e;
    }

    public void print() {
        for (int i = 0; i < nb; i++)
            System.out.println(LabName[i]);
    }
}