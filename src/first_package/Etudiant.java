package first_package;

public class Etudiant {
    private String nom;
    private String prenom;
    private UniteEnseignement[] unites;
    private MatiereNote[] matiereNotes;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.unites = new UniteEnseignement[10];
        matiereNotes = new MatiereNote[10];
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

    public MatiereNote[] getMatiereNotes() {
        return matiereNotes;
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

    public void ajouterMatiereNote(Matiere matiere, Note note) {
        for (int i = 0; i < matiereNotes.length; i++) {
            if (matiereNotes[i] == null) {
                matiereNotes[i] = new MatiereNote(matiere, note);
                return;
            }
        }
    }


    public void afficherMatiereNotes() {
        for (MatiereNote matiereNote : matiereNotes) {
            if (matiereNote != null) {
                System.out.println(matiereNote.getMatiere().getNom());
                System.out.println("DS: " + matiereNote.getNote().getDs());
                System.out.println("Examen: " + matiereNote.getNote().getExamen());
            }
        }
    }

    public double calculerMoyenne() {
        double moyenne = 0;
        int count = 0;
        for (MatiereNote matiereNote : matiereNotes) {
            if (matiereNote != null) {
                moyenne += matiereNote.getNote().getDs() + matiereNote.getNote().getExamen();
                count += 2;
            }
        }
        return moyenne / count;
    }
}
