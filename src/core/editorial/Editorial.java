/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.editorial;

import core.persona.Gerente;
import java.util.ArrayList;

/**
 *
 * @author fjuanc
 */
public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;
    private ArrayList<String> libros;
    private ArrayList<String> stands;

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public ArrayList<String> getLibros() {
        return libros;
    }

    public ArrayList<String> getStands() {
        return stands;
    }
    
}
