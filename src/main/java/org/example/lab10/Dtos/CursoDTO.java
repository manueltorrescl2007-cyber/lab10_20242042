package org.example.lab10.Dtos;

public class CursoDTO {
    private int id_curso;
    private int codigo;
    private String nombre;
    private int creditos;
    private DocenteDTO id_docente;

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public DocenteDTO getId_docente() {
        return id_docente;
    }

    public void setId_docente(DocenteDTO id_docente) {
        this.id_docente = id_docente;
    }


}
