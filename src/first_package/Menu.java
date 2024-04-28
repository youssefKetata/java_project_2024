package first_package;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    Universite universite = new Universite();
    public Menu() {
        scanner = new Scanner(System.in);
        
    }

    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Ajouter un étudiant");
        System.out.println("2. Ajouter un unite d'enseignement");
        System.out.println("3. Ajouter un matiere");
        System.out.println("4. Ajouter une note");
        System.out.println("5. Afficher tous les étudiants");
        System.out.println("6. Afficher tous les matieres");
        System.out.println("7. Afficher toutes les notes");
        System.out.println("8. Supprimer un étudiant");
        System.out.println("9. Quitter");
    }

    public void ajouterEtd() {
        System.out.println("Entrez le nom de l'étudiant:");
        String name = scanner.nextLine();
        System.out.println("Entrez le prenom de l'étudiant:");
        String prenom = scanner.nextLine();
        Etudiant etudiant = new Etudiant(name, prenom);
        universite.ajouterEtudiant(etudiant);
        if (etudiant != null) {
            System.out.println("Etudiant ajouté avec succès!");
        }
    }

    public void ajouterMt() {
        System.out.println("Entrez le nom de la matiere:");
        String name = scanner.nextLine();
        Matiere matiere = null;
        System.out.println("Entrez le nom de l'unité d'enseignement:");
        String ueName = scanner.nextLine();
        ueName = ueName.trim();
        UniteEnseignement[] unites = universite.getUnites();
        boolean uniteFound = false;
        for (UniteEnseignement unite : unites) {
            if (unite != null && unite.getNom().equals(ueName)) {
                matiere = new Matiere(name);
                unite.ajouterMatiere(matiere);
                uniteFound = true;
                break;
            }
        }
        if (!uniteFound) {
            System.out.println("Unité d'enseignement non trouvée!");
        }

        if (matiere != null) {
            System.out.println("Matiere ajoutée avec succès!");
        }
    }

    public void ajouterUE() {
        System.out.println("Entrez le nom de l'unité d'enseignement:");
        String name = scanner.nextLine();
        name = name.trim();
        UniteEnseignement unite = new UniteEnseignement(name);
        universite.ajouterUnite(unite);
        if (unite != null) {
            System.out.println(unite.getNom() + "  a été ajouté avec succès!");
        }
    }

    public void ajouterNote() {
        System.out.println("Entrez le nom de l'étudiant :");
        String etudiantNom = scanner.nextLine();
        System.out.println("Entrez le nom du sujet :");
        String MatiereNom = scanner.nextLine();
        System.out.println("Entrez le type de note (ds ou examen) :");
        String noteType = scanner.nextLine();
        System.out.println("Entrez la note :");
        double note = scanner.nextDouble();
        scanner.nextLine(); 
        Etudiant[] etudiants = universite.getEtudiants();
        Matiere[] matieres = universite.getMatieres();
        boolean etudiantFound = false;
        boolean matiereFound = false;
        for (Etudiant etudiant : etudiants) {
            if (etudiant != null && etudiant.getNom().equals(etudiantNom)) {
                etudiantFound = true;
                for (Matiere matiere : matieres) {
                    if (matiere != null && matiere.getNom().equals(MatiereNom)) {
                        matiereFound = true;
                        MatiereNote[] matiereNotes = etudiant.getMatiereNotes();
                        boolean found = false;
                        for (MatiereNote matiereNote : matiereNotes) {
                            if (matiereNote != null && matiereNote.getMatiere().getNom().equals(MatiereNom)) {
                                Note noteObj = matiereNote.getNote();
                                if (noteType.equals("ds")) {
                                    noteObj.setDs(note);
                                } else if (noteType.equals("examen")) {
                                    noteObj.setExamen(note);
                                }
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            Note newNote = new Note();
                            if (noteType.equals("ds")) {
                                newNote.setDs(note);
                            } else if (noteType.equals("examen")) {
                                newNote.setExamen(note);
                            }
                            etudiant.ajouterMatiereNote(matiere, newNote);
                        }
                    }
                }
                break;
            }
        }
        System.out.println("Note ajoutée avec succès!");
    }

    public void afficherEtudeants() {
        Etudiant[] etudiants = universite.getEtudiants();
        for (Etudiant etudiant : etudiants) {
            if (etudiant != null) {
                System.out.println(etudiant.getNom() + " " + etudiant.getPrenom());
            }
        }
    }

    public void afficherMatieres() {
        UniteEnseignement[] unites = universite.getUnites();
        for (UniteEnseignement unite : unites) {
            if (unite != null) {
                System.out.println("Unite d'Enseignement: " + unite.getNom());
                Matiere[] matieres = unite.getMatieres();
                if (matieres.length > 0) {
                    System.out.println("Matieres:");
                    for (Matiere matiere : matieres) {
                        if (matiere != null) {
                            System.out.println("\t" + matiere.getNom());
                        }
                    }
                } else {
                    System.out.println("No Matieres for this Unite d'Enseignement.");
                }
                System.out.println("--------------------");
            }
        }
    }

    public void afficherNotes() {
        Etudiant[] etudiants = universite.getEtudiants();
        for (Etudiant etudiant : etudiants) {
            if (etudiant != null) {
                System.out.println("Etudiant: " + etudiant.getNom());
                MatiereNote[] matiereNotes = etudiant.getMatiereNotes();
                if (matiereNotes.length > 0) {
                    System.out.println("Notes:");
                    for (MatiereNote matiereNote : matiereNotes) {
                        if (matiereNote != null) {
                            System.out.println("\t" + matiereNote.getMatiere().getNom() + " : " +
                            matiereNote.getNote().getDs() + " " + matiereNote.getNote().getExamen());
                        }
                    }
                } else {
                    System.out.println("No Notes for this Etudiant.");
                }
                System.out.println("--------------------");
            }
        }
    }

    public void exit() {
        System.out.println("Exiting the program...");
        System.exit(0);
    }

    public void run() {
        while (true) {
            displayMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez votre choix :");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ajouterEtd();
                    break;
                case 2:
                    ajouterUE();
                    break;
                case 3:
                    ajouterMt();
                    break;
                case 4:
                    ajouterNote();
                    break;
                case 5:
                    afficherEtudeants();
                    break;
                case 6:
                    afficherMatieres();
                    break;
                case 7:
                    afficherNotes();
                    break;
                case 8:
                    supprimerEtudiant();
                    break;
                case 9:
                    exit();
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    void supprimerEtudiant() {
        System.out.println("Entrez le nom de l'étudiant à supprimer:");
        String etudiantNom = scanner.nextLine();
        Etudiant[] etudiants = universite.getEtudiants();
        for (int i = 0; i < etudiants.length; i++) {
            if (etudiants[i] != null && etudiants[i].getNom().equals(etudiantNom)) {
                etudiants[i] = null;
                System.out.println("Etudiant supprimé avec succès!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.run();
    }
}
