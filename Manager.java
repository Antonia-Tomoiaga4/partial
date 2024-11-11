public class Manager extends Angajat{
   private  int salariu;

    public Manager(int nr , String nume,int tarifPerOra,int nrOreLucrate){
        super(nr,nume,tarifPerOra, nrOreLucrate);

    }
    public void SetSalariu(){
        super.salariu+=300;
    }

}
