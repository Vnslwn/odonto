import java.util.ArrayList;
import java.util.Date;


public class Paciente {
    private String nome;
    private String cpf;
    private String historicoTratamentos;

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.historicoTratamentos = "";
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getHistoricoTratamentos() {
        return historicoTratamentos;
    }

    public void adicionarTratamento(String tratamento) {
        historicoTratamentos += tratamento + "\n";
    }
}

