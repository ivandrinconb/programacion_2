package co.edu.uniquindio.repositorio.model;

import java.util.ArrayList;

public class Universidad {
    private String nombre;

    private ArrayList<Estudiante> ListaEstudiantes= new ArrayList();
    private ArrayList<Curso> ListaCurso= new ArrayList();
    private ArrayList<Docente> ListaDocentes= new ArrayList();
    private Rector rector;


    public Universidad() {
    }

    public Universidad(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes(){
        return this.ListaEstudiantes;
    }
    public void setListaEstudiantes(ArrayList<Estudiante> ListaEstudiantes){
        this.ListaEstudiantes=ListaEstudiantes;
    }

    public ArrayList<Curso> getListaCurso(){
        return this.ListaCurso;
    }
    public void setListaCurso(ArrayList<Curso> ListaCurso){
        this.ListaCurso=ListaCurso;
    }

    public ArrayList<Docente> getListaDocentes() {
        return ListaDocentes;
    }

    public void setListaDocentes(ArrayList<Docente> listaDocentes) {
        ListaDocentes = listaDocentes;
    }
}
