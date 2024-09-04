package logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CMatricula {
    private final List<CAlumno> productos;
    
    public CMatricula() {
    productos= new ArrayList<>();
    }
    public void agregarProducto(CAlumno alumnos){
    productos.add(alumnos);
    }
    public void guardarProducto(String nombreArchivo){
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (CAlumno producto : productos) {
                bw.write(producto.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los productos en el archivo: " + e.getMessage());
    }
}
}
