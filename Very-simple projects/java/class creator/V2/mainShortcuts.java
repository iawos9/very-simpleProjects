import java.util.Scanner;
public class mainShortcuts {
    Scanner input = new Scanner(System.in);
    BackEnd b = new BackEnd(); //case 1, case 2, case 3

    public void menu() { //main menu
        System.out.println("--------------------------------");
        System.out.println("1) Add new section");
        System.out.println("2) Show all sections");
        System.out.println("3) Add labs manually");
        System.out.println("4) Add all labs so specific week");
        System.out.println("5) Print labs for specific week");
        System.out.println("6) exit");
        System.out.println("--------------------------------");
        System.out.print("chose >> ");
    }

    public void addNewSection() { //add new section/class
        System.out.println("** Add new section **");
        System.out.print("Enter section number: ");
        int section = input.nextInt();
        int x = b.search(section);
        if (x == -1) { //means section number is available
            System.out.print("Enter teacher name: ");
            String tName = input.next();
            System.out.print("Subject name: ");
            String sName = input.next();
            System.out.print("Class time(AM): ");
            int cTime = input.nextInt();

            b.addSection(tName,sName,section,cTime);
        }
        else
            System.out.println("Not added! Section number already exists");
    }

    public void showSections() { //display all sections
        b.display();
    }

    public void addLab() { //add lab
        System.out.print("Enter section number: ");
        int section = input.nextInt();
        b.addLab(section);
    }

    public void addNewWeek() {
        if (b.numberOfLabs() == 0) {
            System.out.println("Labs aren't added, please add labs");
            return;
        }
        System.out.println("** Add labs not specific week **");
        System.out.print("Enter week number: ");
        int week = input.nextInt();
        b.addNewWeek(week);
    }

    public void printSpecificWeek() {
        b.printSpecificWeek();
    }
}
