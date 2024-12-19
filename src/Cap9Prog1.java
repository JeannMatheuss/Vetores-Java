import java.util.Scanner;   
public class Cap9Prog1 {
    public static void main(String[] args) {
        String[] vetNomeAluno = new String[10];
        float[] vetMediaFinal = new float[10];
        int contadorAlunos;
        float acumMedia = 0, mediaTurma;

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        for (contadorAlunos = 0; contadorAlunos < 10; contadorAlunos++) {
            System.out.println("Informe o nome do aluno(a) - " + (contadorAlunos + 1) + " : ");
            vetNomeAluno[contadorAlunos] = entrada.next();

            System.out.println("Informe sua média final: ");
            vetMediaFinal[contadorAlunos] = entrada.nextFloat();

            if (vetMediaFinal[contadorAlunos] >= 7.0) {
                System.out.println("Você está APROVADO(A): " + vetNomeAluno[contadorAlunos]);
            } else if (vetMediaFinal[contadorAlunos] >= 5.0) {
                System.out.println("Você está EM EXAME: " + vetNomeAluno[contadorAlunos]);
            } else {
                System.out.println("Você está REPROVADO(A): " + vetNomeAluno[contadorAlunos]);
            }

            acumMedia += vetMediaFinal[contadorAlunos];
            System.out.println();
        }

        // Cálculo da média da turma
        mediaTurma = acumMedia / 10;
        System.out.println("\nA média da turma é: " + mediaTurma);

        // Classificação dos alunos
        for (contadorAlunos = 0; contadorAlunos < 10; contadorAlunos++) {
            if (vetMediaFinal[contadorAlunos] > mediaTurma) {
                System.out.println(vetNomeAluno[contadorAlunos] + " - Média: " + vetMediaFinal[contadorAlunos] + " - Bom Aluno(a).");
            } else if (vetMediaFinal[contadorAlunos] < mediaTurma) {
                System.out.println(vetNomeAluno[contadorAlunos] + " - Média: " + vetMediaFinal[contadorAlunos] + " - Aluno(a) com baixo desempenho.");
            } else {
                System.out.println(vetNomeAluno[contadorAlunos] + " - Média: " + vetMediaFinal[contadorAlunos] + " - Bom Aluno(a).");
            }
        }

        entrada.close();
    }
}
