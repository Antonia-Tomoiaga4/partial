public class Echipa {
    Angajat[] echipa=new Angajat[10];
    private  int index=0;
    private int nrA=0;
    private static int nrD=0;
    private int nrT=0;
    private int nrM=0;

    public void addDeveloper(Developer d){
        if(index<10){
            if(d!=null){
                echipa[index++]=d;
            }
        }
        else {
            System.out.println("echipa plina");
        }
    }

    public void addTeamLeader( TeamLeader t){
        if(index<10){
            if(t!=null){
                echipa[index++]=t;
            }
        }
        else {
            System.out.println("echipa plina");
        }
    }

    public void addManger(Manager m){
        if(index<10){
            if(m!=null){
                echipa[index++]=m;
            }
        }
        else {
            System.out.println("echipa plina");
        }
    }

    public void listAngajati(){
        for(int i=0;i<index;i++){
            if(echipa[i]!=null){
                nrA++;
                System.out.println(echipa[i].getNume());
            }
        }
    }

    public void listLeader(){
        for(int i=0;i<index;i++){
            if(echipa[i]!=null){
                if(echipa[i] instanceof TeamLeader ){
                    nrT++;
                    System.out.println(echipa[i].getNume());
                }
            }
        }
    }

    public void listDeveloper(){
        for(int i=0;i<index;i++){
            if(echipa[i]!=null){
                if(echipa[i] instanceof Developer ){
                    nrD++;
                    System.out.println(echipa[i].getNume());
                }
            }
        }
    }

    public void  listManager(){
        for(int i=0;i<index;i++){
            if(echipa[i]!=null){
                if(echipa[i] instanceof Manager ){
                    nrM++;
                    System.out.println(echipa[i].getNume());
                }
            }
        }
    }

    public void listDesc(){
//        for(int i=0;i<7;i++){
//            for(int j=0;j<6;j++){
//                if(echipa[i].getSalariu()<echipa[i+1].getSalariu()){
//                    Angajat temp =echipa[i];
//                    echipa[i]=echipa[i+1];
//                    echipa[i+1]=temp;
//                }
//            }
//        }
        for(int i=0;i<7;i++){
            if(echipa[i]!=null){
                System.out.println(echipa[i].getNume() + " " + echipa[i].getSalariu());
            }
        }
    }

//    public String min(){
//        Developer min;
//        for(int i=0;i<10;i++){
//            if(echipa[i]!= null){
//                if(echipa[i] instanceof Developer){
//                    if(echipa[i].getNrTask()<echipa[i+1].getNrTask()){
//                        min=echipa[i];
//                    }
//                }
//            }
//        }
//        System.out.println(min.getNume() + min.getSalariu());
//
//    }
}
