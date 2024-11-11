public abstract class Angajat {
    protected int nr;
    protected  String nume;
    protected int tarifPeora ;
    protected int nrOreLucrate;
    protected int salariu;


   public Angajat(int nr, String nume, int tarifPerOra, int nrOreLucrate) {
       this.nr = nr;
       this.nume = nume;
       this.tarifPeora = tarifPeora;
       this.salariu=nrOreLucrate*tarifPerOra;
   }

    abstract void  SetSalariu();

   public String getNume(){
       return nume;
   }

   public int getSalariu(){
       return salariu;
   }

}
