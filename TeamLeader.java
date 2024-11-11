public class TeamLeader extends Angajat{

    public TeamLeader(int nr , String nume,int tarifPerOra,int nrOreLucrate){
        super(nr,nume,tarifPerOra, nrOreLucrate);
    }
    public void SetSalariu(){
       super.salariu+=200;
    }
}
