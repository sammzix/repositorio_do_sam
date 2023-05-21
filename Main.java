import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestaoHospital gestaoHospital = new GestaoHospital();
        Scanner ler = new Scanner(System.in);

        while (true) {
           
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar paciente à fila");
            System.out.println("2. Atender próximo paciente");
            System.out.println("3. Listar pacientes");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = ler.nextInt();
           
            switch (opcao){
                case 1:
                gestaoHospital.adcionar_paciente();
                break;

                case 2:
                gestaoHospital.atender_Paciente();
                break;

                case 3:
                gestaoHospital.num_Pacientes();
                break;

                case 4:
                System.out.println("Saindo...");
                System.exit(0);

                default:
                System.out.println("Opção inválida!");
                break;
                

            }
        }
    }
}


            

            


    
            

      
    

    

