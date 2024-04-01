
package core.libro;

import core.editorial.Editorial;
import core.persona.Autor;
import java.util.ArrayList;

/**
 *
 * @author fjuanc
 */
public class Libro {
    protected String libro;
    protected ArrayList<Autor> autores;
    protected String isbn;
    protected String genero;
    protected String formato;
    protected double valor;
    protected Editorial editorial;

    public String getLibro() {
        return libro;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenero() {
        return genero;
    }

    public String getFormato() {
        return formato;
    }

    public double getValor() {
        return valor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    
    
}

