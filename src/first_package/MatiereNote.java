package first_package;

public class MatiereNote {
    private Matiere matiere;
    private Note note;

    public MatiereNote(Matiere matiere, Note note) {
        this.matiere = matiere;
        this.note = note;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}