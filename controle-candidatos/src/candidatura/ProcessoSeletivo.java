package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {

        String [] candidatos = {"João", "Maria", "José", "Ana", "Heloisa"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    
    }
    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso com o candidato " + candidato);
            }
        }while (continuarTentando && tentativasRealizadas < 3); 

        if(atendeu){
            System.out.println("Conseguimos contato com o candidato " + candidato + " na tentativa " + tentativasRealizadas);
        }else{
            System.out.println("Não conseguimos contato com o candidato " + candidato + " após " + tentativasRealizadas + " tentativas");
        }
            
    }
    
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Heloisa"};
        System.out.println("Imprimindo a lista de candidatos selecionados informando o índice do elemento");
    
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O Candidato de número: " + (indice+1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");

        for(String candidato : candidatos){
            System.out.println("O Candidato selecionado foi: " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"João", "Maria", "José", "Ana", "Heloisa", "Lucas", "Fernanda", "Patrícia"};
    
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
        
            System.out.println("Candidato: " + candidato + " - Salário Pretendido: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado!");
                candidatosSelecionados++;
        }
            else{
                System.out.println("O candidato " + candidato + " não foi selecionado!");
            }
        candidatosAtual++;
    }
}

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("\nLigar para candidato!");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");


        }

       
    }
}