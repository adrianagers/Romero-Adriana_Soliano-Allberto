package model;

public class Odontologos {
    private Integer id;
    private Integer Matricula;
    private String Nombre;
    private String Apellido;

    public Odontologos(Integer id, Integer matricula, String nombre, String apellido) {
        this.id = id;
        Matricula = matricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public Odontologos(Integer matricula, String nombre, String apellido) {
        Matricula = matricula;
        Nombre = nombre;
        Apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMatricula() {
        return Matricula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
