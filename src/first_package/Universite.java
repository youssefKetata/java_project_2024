package first_package;

public class Universite {
    private Etudiant[] etudiants;
    private UniteEnseignement[] unites;
    private Matiere[] matieres;

    public Universite() {
        etudiants = new Etudiant[10];
        unites = new UniteEnseignement[10];
        matieres = new Matiere[10];
    }
    // getter and setter
    public Etudiant[] getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Etudiant[] etudiants) {
        this.etudiants = etudiants;
    }

    public UniteEnseignement[] getUnites() {
        return unites;
    }

    public void setUnites(UniteEnseignement[] unites) {
        this.unites = unites;
    }

    public Matiere[] getMatieres() {
        // loop through unites and get matieres
        int index = 0;
        for (UniteEnseignement unite : unites) {
            if (unite != null) {
                Matiere[] matieres = unite.getMatieres();
                for (Matiere matiere : matieres) {
                    if (matiere != null) {
                        this.matieres[index] = matiere;
                        index++;
                    }
                }
            }
        }
        return matieres;
    }

    public void setMatieres(Matiere[] matieres) {
        this.matieres = matieres;
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        int index = -1;
        for (int i = 0; i < etudiants.length; i++) {
            if (etudiants[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            etudiants[index] = etudiant;
        } else {
            System.out.println("Plus d'espace pour ajouter des etudiants.");
        }
    }

    public void ajouterUnite(UniteEnseignement unite) {
        int index = -1;
        for (int i = 0; i < unites.length; i++) {
            if (unites[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            unites[index] = unite;
        } else {
            System.out.println("Plus d'espace pour ajouter des unites.");
        }
    }

}
