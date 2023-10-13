package tp02_3;

public class Ingénieur extends Employe {
    private String spécialité;

    public Ingénieur(String nom, String prenom, String email, String telephone, double salaire, String spécialité) {
        super(nom, prenom, email, telephone, salaire);
        this.spécialité = spécialité;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", Ingénieur " +
                "spécialité='" + spécialité + '\'';
    }

    @Override
    public double calculerSalire() {
        return (getSalaire()*0.15)+getSalaire();
    }
}
