// Main class
package first_package;

public class Main {
    public static void main(String[] args) {

        // // create two unite d'enseignement
        // UniteEnseignement ue1 = new UniteEnseignement("UE1");
        // UniteEnseignement ue2 = new UniteEnseignement("UE2");
        // //create two matieres in each unite d'enseignement
        // Matiere matiere1 = new Matiere("Mathematiques");
        // Matiere matiere2 = new Matiere("Physique");
        // Matiere matiere3 = new Matiere("Chimie");
        // Matiere matiere4 = new Matiere("Informatique");
        // // add matieres to unite d'enseignement
        // ue1.ajouterMatiere(matiere1);
        // ue1.ajouterMatiere(matiere2);
        // ue2.ajouterMatiere(matiere3);
        // ue2.ajouterMatiere(matiere4);
        // // create tow students
        // Etudiant etudiant1 = new Etudiant("Samar", "Mejri");
        // Etudiant etudiant2 = new Etudiant("Youssef", "Ketata");
        // // add unite d'enseignement to each student
        // etudiant1.ajouterUnite(ue1);
        // etudiant1.ajouterUnite(ue2);
        // etudiant2.ajouterUnite(ue1);
        // etudiant2.ajouterUnite(ue2);
        // // display the unite d'enseignement for each student
        // etudiant1.afficherUnites();
        // etudiant2.afficherUnites();
        // // display the matieres for each unite d'enseignement
        // ue1.afficherMatieres();
        // ue2.afficherMatieres();
        // // give notes to each student
        // etudiant1.notes[0][0] = 10;
        // etudiant1.notes[0][1] = 12;
        // etudiant1.notes[1][0] = 15;
        // etudiant1.notes[1][1] = 14;
        // etudiant2.notes[0][0] = 8;
        // etudiant2.notes[0][1] = 10;
        // etudiant2.notes[1][0] = 13;
        // etudiant2.notes[1][1] = 11;
        // // display the notes for each student
        // System.out.println("Notes de l'etudiant " + etudiant1.getNom() + " " + etudiant1.getPrenom());
        // System.out.println("DS1: " + etudiant1.notes[0][0]);
        // System.out.println("Examen1: " + etudiant1.notes[0][1]);
        // System.out.println("DS2: " + etudiant1.notes[1][0]);
        // System.out.println("Examen2: " + etudiant1.notes[1][1]);
        // System.out.println("Notes de l'etudiant " + etudiant2.getNom() + " " + etudiant2.getPrenom());
        // System.out.println("DS1: " + etudiant2.notes[0][0]);
        // System.out.println("Examen1: " + etudiant2.notes[0][1]);
        // System.out.println("DS2: " + etudiant2.notes[1][0]);
        // System.out.println("Examen2: " + etudiant2.notes[1][1]);
        // use menu 
        Menu menu = new Menu();
        menu.displayMenu();
        

    }
}