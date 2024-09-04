package logica;
import java.util.Random;

public class CDocente extends CPersona{
    private String cursoDocente;
    private String facultadDocente;

    public CDocente() {
    }
    

    public CDocente(String cursoDocente, String facultadDocente, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.cursoDocente = cursoDocente;
        this.facultadDocente = facultadDocente;
    }
    
    
    public int calificarCurso(CCurso curso) {
        Random rand = new Random();
        int nota = rand.nextInt(21);
        return nota;
    }
    
    public String getCursoDocente() {
        return cursoDocente;
    }

    public void setCursoDocente(String cursoDocente) {
        this.cursoDocente = cursoDocente;
    }

    public String getFacultadDocente() {
        return facultadDocente;
    }

    public void setFacultadDocente(String facultadDocente) {
        this.facultadDocente = facultadDocente;
    }
    
    
    
}
