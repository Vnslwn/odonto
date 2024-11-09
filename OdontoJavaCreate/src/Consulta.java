import java.util.ArrayList;
import java.util.Date;


public class Consulta {
    private Paciente paciente;
    private Date dataConsulta;

    public Consulta(Paciente paciente, Date dataConsulta) {
        this.paciente = paciente;
        this.dataConsulta = dataConsulta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }
}

