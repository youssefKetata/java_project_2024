package first_package;

public class Note {
    private double ds;
    private double examen;

    public Note() {
    }

    public Note(double ds, double examen) {
        this.ds = ds;
        this.examen = examen;
    }

    public double getDs() {
        return ds;
    }

    public void setDs(double ds) {
        this.ds = ds;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }
}
