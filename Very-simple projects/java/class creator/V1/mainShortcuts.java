import java.util.Scanner;
public class mainShortcuts {
    Scanner input = new Scanner(System.in);
    BackEnd b = new BackEnd();

    public void menu() { //main menu
        System.out.println("--------------------------------");
        System.out.println("Welcome!");
        System.out.println("1) Add new section");
        System.out.println("2) Show all sections");
        System.out.println("3) Add labs manually");
        System.out.println("4) exit");
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
            System.out.print("Class time: ");
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
}
