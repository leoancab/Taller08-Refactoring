import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    public add(List<Consulta> consultas){
        //this.add(consulta)
    }
    public remove(List<Consulta> consultas){
        //this.add(consulta)
    }
    public List<Consulta> getConsultas() {
        return /*Unmodificable */consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void getMedicamentos() {
        for(String medicamento: this.medicamentos){
        return System.out.println(medicamento);
        }
    }

    public void setMedicamentos(String medicamento) {
        this.medicamentos.add(medicamento);
    }
}
