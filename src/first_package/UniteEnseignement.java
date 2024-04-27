package first_package;

public class UniteEnseignement {
    private String nom;
    private Matiere[] matieres;

    public UniteEnseignement(String nom) {
        this.nom = nom;
        matieres = new Matiere[10];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public UniteEnseignement() {
        matieres = new Matiere[10];
    }

    public Matiere[] getMatieres() {
        return matieres;
    }

    public void setMatieres(Matiere[] matieres) {
        this.matieres = matieres;
    }

    public void ajouterMatiere(Matiere matiere) {
        int index = -1;
        for (int i = 0; i < matieres.length; i++) {
            if (matieres[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            matieres[index] = matiere;
        } else {
            System.out.println("Plus d'espace pour ajouter des sujets.");
        }
    }

    public void afficherMatieres() {
        for (Matiere matiere : matieres) {
            if (matiere != null) {
                System.out.println(matiere.getNom());
            }
        }
    }
}
