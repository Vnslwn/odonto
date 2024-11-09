package org.example;

public class Consulta {

    public int idDentista;
    public String paciente;
    public String data;

    public Consulta(){}

    public Consulta(int idDentista, String paciente, String data) {
        this.idDentista = idDentista;
        this.paciente = paciente;
        this.data = data;
    }
}
