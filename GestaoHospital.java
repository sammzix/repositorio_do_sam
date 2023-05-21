import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestaoHospital {
    private List<Paciente> filaNormal;
    private List<Paciente> filaSevero;
    private List<Paciente> filaLeve;
    private List<Paciente> filaModerado;



    public GestaoHospital(){
        filaNormal = new ArrayList<>();
        filaSevero = new ArrayList<>();
        filaLeve = new ArrayList<>();
        filaModerado = new ArrayList<>();
    }
    Scanner ler = new Scanner(System.in);
    
    public void adcionar_paciente(){
        System.out.println("INforme o nome do paciente: ");
        String nome = ler.nextLine();
        System.out.println("Informe o CPF do paciente: ");
        String cpf = ler.nextLine();
        System.out.println("Informe a prioridade do paciente (0 - normal, 1 - leve, 2 - moderado, 3 - severo)");
        int prioridade = ler.nextInt();

        Paciente paciente = new Paciente(nome, cpf, prioridade);
        if(paciente.getPrioridade() == 0){
            filaNormal.add(paciente);
        }
        else if(paciente.getPrioridade() == 1){
            filaLeve.add(paciente);
        }
        else if(paciente.getPrioridade() == 2){
            filaModerado.add(paciente);
        }
        else if(paciente.getPrioridade() == 3){
            filaSevero.add(paciente);
        }
        else{
            System.out.println("Prioridade inválida");
            
        }

    }
    public void atender_Paciente() {
        if (!filaSevero.isEmpty()) {
            Paciente paciente = filaSevero.remove(0);
            System.out.println("Atendendo paciente severo: " + paciente.getNome());
        } else if (!filaModerado.isEmpty()) {
            Paciente paciente = filaModerado.remove(0);
            System.out.println("Atendendo paciente moderado: " + paciente.getNome());
        } else if (!filaLeve.isEmpty()) {
            Paciente paciente = filaLeve.remove(0);
            System.out.println("Atendendo paciente leve: " + paciente.getNome());
        } else if (!filaNormal.isEmpty()) {
            Paciente paciente = filaNormal.remove(0);
            System.out.println("Atendendo paciente normal: " + paciente.getNome());
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }
    public void num_Pacientes(){
        System.out.println("Pacientes severos: " + filaSevero.size());
        System.out.println("Pacientes normais: " + filaNormal.size());
        System.out.println("Pacientes leves: " + filaLeve.size() );
        System.out.println("Pacientes moderados: " + filaModerado.size());
        int totalPacientes = filaLeve.size() + filaModerado.size() + filaNormal.size() + filaSevero.size();
        System.out.println("Pacientes totais: " + totalPacientes);

    }   
    
    
    
    
}
