package first_package;

public class Etudiant {
    private String nom;
    private String prenom;
    private UniteEnseignement[] unites;
    double[][] notes; // Index 0 pour DS, Index 1 pour examen

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.unites = new UniteEnseignement[10];
        notes = new double[unites.length][2];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public UniteEnseignement[] getUnites() {
        return unites;
    }

    public void setUnites(UniteEnseignement[] unites) {
        this.unites = unites;
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

    public void afficherUnites() {
        for (UniteEnseignement unite : unites) {
            if (unite != null) {
                System.out.println(unite.getNom());
                unite.afficherMatieres();
            }
        }
    }
        
    // Fonction pour ajouter une note pour une matière spécifique
    public void ajouterNote(Matiere matiere, String TypeNote, double[] note) {
        for (int i = 0; i < unites.length; i++) {
            if (unites[i] != null) {
                for (int j = 0; j < unites[i].getMatieres().length; j++) {
                    if (unites[i].getMatieres()[j] != null) {
                        if (unites[i].getMatieres()[j].getNom().equals(matiere.getNom())) {
                            if (TypeNote.equals("DS")) {
                                notes[i][0] = note[0];
                            } else if (TypeNote.equals("Examen")) {
                                notes[i][1] = note[1];
                            }
                        }
                    }
                }
            }
        }

    }
    

    public double[] getNotesForMatiere(String matiereName) {
        for (int i = 0; i < unites.length; i++) {
            if (unites[i] != null) {
                for (int j = 0; j < unites[i].getMatieres().length; j++) {
                    if (unites[i].getMatieres()[j] != null && unites[i].getMatieres()[j].getNom().equals(matiereName)) {
                        return notes[i];
                    }
                }
            }
        }
        return null; // return null if the matiereName was not found
    }


}
