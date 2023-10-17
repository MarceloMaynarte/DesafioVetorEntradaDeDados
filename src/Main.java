import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas do aluno");
        int QuantidadeNotas = input.nextInt();

        double[] NotasAluno = new double[QuantidadeNotas];


        for (int i = 0; i < NotasAluno.length; i++) {
            System.out.println("Informe a nota" + (i + 1) +":");
             NotasAluno[i] = input.nextDouble();

        }
        double Media = QuantidadeNotas + NotasAluno.length /3;

        if(Media< 10){
            System.out.println("Sua nota é : " + Media + " Reprovado");

        }else {
            System.out.println("Sua nota é: " + Media + " Aprovado");

        }

    }
}

