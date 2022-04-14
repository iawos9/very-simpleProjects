import java.util.*;

public class meow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        hero earth = new hero();
        hero qop = new hero();
        hero sylla= new hero();
        hero arc = new hero();
        hero invo = new hero();
        hero brood = new hero();
        hero nort = new hero();
        hero mepoo = new hero();
        hero morph = new hero();
        hero sf = new hero();
        hero huskar = new hero();
        hero lanaya = new hero();
        hero wind = new hero();
        hero tinker = new hero();
        hero mirana = new hero();
        hero sven = new hero();
        hero kunkka = new hero();
        hero lina = new hero();
        hero monkey = new hero();
        hero ursa = new hero();
        hero storm = new hero();
        hero furion = new hero();
        hero magnus = new hero();
        hero phantom = new hero();
        hero ogre = new hero();
        hero balanar = new hero();
        hero doom = new hero();
        hero pudge = new hero();
        hero razor = new hero();
        hero slark = new hero();
        hero techies = new hero();
        hero lesh = new hero();
        hero legion = new hero();
        hero magina = new hero();

        //7.00e6
        earth.add(1,"5:40",false);
        qop.add(1,"56",true);
        sylla.add(1,"1:39:50",true);
        arc.add(1,"2:26:05",true);
        invo.add(1,"3:00:33",true);

        earth.add(2,"4:40",false);
        brood.add(2,"28:08",true);
        nort.add(2,"1:09:50",true);
        mepoo.add(2,"1:57:40",true);
        morph.add(2,"2:39:10",true);
        sf.add(2,"3:33:30",true);

        huskar.add(3,"16",true);
        lanaya.add(3,"46:20",true);
        wind.add(3,"1:08:55",true);

        invo.add(4,"7:20",true);
        invo.add(4,"50:55",true);

        tinker.add(5,"2:29:55",true);

        mepoo.add(6,"2:30",true);

        mirana.add(7,"4:25",true);

        sven.add(8,"6:06",false);
        kunkka.add(8,"58:35",false);
        lina.add(8,"1:42:20",true);
        morph.add(8,"2:19:50",false);
        sf.add(8,"2:53:50",true);
        brood.add(8,"3:52:10",true);

        sylla.add(9,"6:10",true);
        huskar.add(9,"43:50",true);
        monkey.add(9,"1:37:50",false);
        ursa.add(9,"2:09:30",false);
        wind.add(9,"2:23:50",true);
        brood.add(9,"2:57:15",true);
        storm.add(9,"3:22:05",true);

        monkey.add(10,"3:44",true);
        furion.add(10,"48:05",true);
        magnus.add(10,"1:39:20",true);

        ursa.add(11,"7:30",false);
        phantom.add(11,"52:22",false);
        ogre.add(11,"1:27:25",false);
        balanar.add(11,"2:03:20",true);

        brood.add(12,"3:10",true);
        doom.add(12,"33:15",false);
        pudge.add(12,"1:24:33",true);
        invo.add(12,"2:24:25",true);

        razor.add(13,"5:00",true);
        slark.add(13,"1:02:37",false);
        techies.add(13,"1:37:10",false);
        sf.add(13,"2:25:33",true);

        lesh.add(14,"4:44",true); //me vs him xD
        legion.add(14,"1:10:44",false);
        ursa.add(14,"1:45:10",false);
        brood.add(14,"2:14:25",true);
        mepoo.add(14,"2:52:42",true);
        techies.add(14,"10:33",false);

        //7.03b2
        tinker.add(455,"11:20",true);
        magina.add(455,"1:21:15",false);
        
        sf.print();
        //or any other hero



    }
}
class hero {
    private data[] arr;
    private int nbD;

    public hero() {
        arr = new data[50];
    }

    public void add(int nb, String min, boolean mid) {
        arr[nbD] = new data();
        arr[nbD].add(nb,min,mid);
        nbD++;
    }
   public void print() {
        for (int i = 0; i < nbD;i++)
            arr[i].print();
   }
}

class data {
    private int nbStream;
    private String min;
    private boolean middle;

    public void add(int nb, String min, boolean middle) {
       nbStream = nb;
       this.min = min;
       this.middle = middle;
    }

    public void print() {
        System.out.print("Stream Number: " + getNbStream() + " , ");
        System.out.print("Minute: " + getMin() + " , ");
        if (getMiddle())
            System.out.println("Mid? Yes");
        else
            System.out.println("Mid? No");
    }

    public int getNbStream() {
        return nbStream;
    }

    public String getMin() {
        return min;
    }

    public boolean getMiddle() {
        return middle;
    }
}

//iawos9 :) - BACK TO DOTA YT CHANNEL
//2022/04/14
