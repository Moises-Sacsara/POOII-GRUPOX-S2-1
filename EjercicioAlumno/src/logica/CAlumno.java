package logica;

import java.util.List;

public class CAlumno extends CPersona{
    private String codigoAlumno;
    private List<CCurso> listaCursos;

    public CAlumno() {
    }

    public CAlumno(String codigoAlumno, List<CCurso> listaCursos, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.codigoAlumno = codigoAlumno;
        this.listaCursos = listaCursos;
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public List<CCurso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<CCurso> listaCursos) {
        this.listaCursos = listaCursos;
    }
    
    @Override
    public String toString(){
        return super.getNombre()+", "+codigoAlumno+", "+listaCursos;
    }
    
}
