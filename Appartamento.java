public class Appartamento{
    private double mq;
    private String citta;
    private String indirizzo;
    private String classeEnergetica;
    private boolean pregiato;
    private String proprietario;
    private double prezzoMq;
    private int piano;
    private double valore;

    public Appartamento(String proprietario) {
        this.proprietario = proprietario;
    }

    public Appartamento(double mq, String citta, String indirizzo, String classeEnergetica, boolean pregiato, String proprietario, double prezzoMq, int piano) {
        this.mq = mq;
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.classeEnergetica = classeEnergetica;
        this.pregiato = pregiato;
        this.proprietario = proprietario;
        this.prezzoMq = prezzoMq;
        this.piano = piano;
    }

    public Appartamento(Appartamento a, int piano) {
        this.mq = a.mq;
        this.citta = a.citta;
        this.indirizzo = a.indirizzo;
        this.classeEnergetica = a.classeEnergetica;
        this.pregiato = a.pregiato;
        this.proprietario = a.proprietario;
        this.prezzoMq = a.prezzoMq;
        this.piano = piano;
        this.valore = a.valore;
    }

    public double getMq() {
        return mq;
    }

    public void setMq(double mq) {
        this.mq = mq;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getClasseEnergetica() {
        return classeEnergetica;
    }

    public void setClasseEnergetica(String classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }

    public boolean isPregiato() {
        return pregiato;
    }

    public void setPregiato(boolean pregiato) {
        this.pregiato = pregiato;
    }

    public String getProprietario() {
        return proprietario;
    }

    public double getPrezzoMq() {
        return prezzoMq;
    }

    public void setPrezzoMq(double prezzoMq) {
        this.prezzoMq = prezzoMq;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public double getValore() {
        return valore;
    }

    public void setValore() {
        double valore;
        if(pregiato){
            valore = prezzoMq+(prezzoMq/100)*15;
        }else{
            valore = prezzoMq;
        }
        this.valore = mq * valore;
    }

    public String toString() {
        String info = "";
        info += "\tmetri quadrati:\t" + mq + "\n";
        info += "\tcittà:\t" + citta + "\n";
        info += "\tindirizzo:\t" + indirizzo + "\n";
        info += "\tclasse energetica:\t" + classeEnergetica + "\n";
        info += "\tpregiato:\t" + pregiato + "\n";
        info += "\tproprietario:\t" + proprietario + "\n";
        info += "\tprezzo al metro quadrato:\t" + prezzoMq + "\n";
        info += "\tpiano:\t" + piano + "\n";
        info += "\tvalore:\t" + valore + "\n";
        return info;
    }
}