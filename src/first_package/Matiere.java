package first_package;

public class Matiere {
    // matiere represnet a subject of a 'unite d'enseignement', each 
    // each sutdent need to have two grades for each matiere
    
    private String nom;

    public Matiere(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
