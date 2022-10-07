import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //Faça um programa que peça o tamanho de um arquivo para download (em MB)
         //e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado
          // de download do arquivo usando este link (em minutos).
            double tamanhoArquivo;
            double velocidadeLink;
            double tempoEmMinutos;
            double tempoEmSegundos;
        
          //1) Pedir o tamanho do arquivo
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o tamanho do arquivo em MB ");
            tamanhoArquivo = teclado.nextDouble();
            System.out.println("Digite a velocidade em MB/s ");
            velocidadeLink = teclado.nextDouble();
            teclado.close();

        // tarefa do computador   
        //2) converter de MB para Mb
        tamanhoArquivo = tamanhoArquivo * 8;
        //3)Calcular o tempo de download em minutos
        // tempo de download tamanho/velocidade
        //descobrir tempo em segundos
        tempoEmSegundos = tamanhoArquivo / velocidadeLink;
        tempoEmMinutos = tempoEmSegundos / 60;

        System.out.print("o tempo em minutos é " + tempoEmMinutos);
    }
}
