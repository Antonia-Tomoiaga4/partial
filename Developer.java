public class Developer extends Angajat {

    private int nrTask=0;

    private static  int nrPr=1;
    public Developer(int nr , String nume,int tarifPerOra, int nrOreLucrate){
        super(nr,nume,tarifPerOra,nrOreLucrate);
    }
    public void SetSalariu(){
        super.salariu+=100;
    }
    public Developer(){
        super(10,"ANA",25,140);
    }
    public Developer(int salariu){
        this(20,"ALIN", 40,100);

    }
    public void rezolvaTask(){
        nrTask++;
    }
    public int  getNrTask(){
        return nrTask;
      //  nrPr++;

    }
}


