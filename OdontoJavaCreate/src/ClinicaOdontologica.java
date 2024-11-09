import java.util.ArrayList;
import java.util.Date;


public class ClinicaOdontologica{
    private ArrayList<Paciente> pacientes;
    private ArrayList<Consulta> consultas;

    public ClinicaOdontologica() {
        pacientes = new ArrayList<>();
        consultas = new ArrayList<>();
    }

    public void adicionarPaciente(String nome, String cpf) {
        pacientes.add(new Paciente(nome, cpf));
    }

    public void agendarConsulta(String cpf, Date dataConsulta) {
        Paciente paciente = encontrarPaciente(cpf);
        if (paciente != null) {
            consultas.add(new Consulta(paciente, dataConsulta));
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private Paciente encontrarPaciente(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    public void adicionarTratamento(String cpf, String tratamento) {
        Paciente paciente = encontrarPaciente(cpf);
        if (paciente != null) {
            paciente.adicionarTratamento(tratamento);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void listarConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println("Paciente: " + consulta.getPaciente().getNome() +
                    " - Data: " + consulta.getDataConsulta());
        }
    }
}

