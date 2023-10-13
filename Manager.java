package tp02_3;

public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Manager " +
                "service='" + service + '\'';
    }

    @Override
    public double calculerSalire() {
        return getSalaire()*0.2+getSalaire();
    }
}

