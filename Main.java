import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nr = scanner.nextInt();
        System.out.println(nr);
        Echipa echipa = new Echipa();
        Developer d1 = new Developer(1,"d1",100,200);
        Developer d2 = new Developer(2,"d1",62,11);
        Developer d3 = new Developer(3,"d3",277 ,22);
        Developer d4 = new Developer(4,"d4", 78,98);
        Manager m1 = new Manager(5,"m1", 44,22);
        TeamLeader t1 = new TeamLeader(6, "t1",12,90);
        TeamLeader t2 = new TeamLeader(7,"t1",90,78);

        echipa.addDeveloper(d1);
        echipa.addDeveloper(d2);
        echipa.addDeveloper(d3);
        echipa.addDeveloper(d4);
        echipa.addManger(m1);
        echipa.addTeamLeader(t1);
        echipa.addTeamLeader(t2);

        System.out.println("anagajati:");
         echipa.listAngajati();
         d1.rezolvaTask();
         d1.rezolvaTask();
         d1.rezolvaTask();
         d1.rezolvaTask();
         d1.rezolvaTask();
         d2.rezolvaTask();
         d3.rezolvaTask();
         d3.rezolvaTask();
         d4.rezolvaTask();


         echipa.listDesc();


    }
}
