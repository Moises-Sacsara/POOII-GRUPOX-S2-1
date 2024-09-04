package logica;

public class CCurso {
    private String nombreCurso;
    private int nota;

    
    public CCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString(){
        return "Curso: "+this.nombreCurso;
    }
    
    
}
