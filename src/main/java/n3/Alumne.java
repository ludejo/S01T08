package n3;

public class Alumne {
    private String nom;
    private int edat;
    private String curs;
    private double nota;

    public Alumne(String nom, int edat, String curs, double nota) {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
