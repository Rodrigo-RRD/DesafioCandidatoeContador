import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Rodrigo", "Marcio", "Edson", "Paula", "Sonia", "Diogenes", "Max", "Camilly",
                "Rodolfo" };
        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        Double salarioBase = 2000.0;

        while (candidatosSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionado++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(Double salarioPretendido) {
        Double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
