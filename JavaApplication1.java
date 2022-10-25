package javaapplication1;
import java.util.Locale;
import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Aula de Algoritmos");

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o dia (número): ");
        int diaDaSemana = leitor.nextInt();
        String nomedoDiaDaSemana = ""; 
        switch(diaDaSemana)
        {
            case 1: nomedoDiaDaSemana = "Domingo"; break;
            case 2: nomedoDiaDaSemana = "Segunda-feira"; break; 
            case 3: nomedoDiaDaSemana = "Terça-Feira"; break;
            case 4: nomedoDiaDaSemana = "Quarta-Feira"; break;
            case 5: nomedoDiaDaSemana = "Quinta-Feira"; break;
            case 6: nomedoDiaDaSemana = "Sexta-Feira"; break;
            case 7: nomedoDiaDaSemana = "Sábado"; break; 
            
        }
        System.out.println("O dia da semana é " + nomedoDiaDaSemana + ".");
        leitor.close();
    

    
    
    
    }
}
