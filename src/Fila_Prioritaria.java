
import java.util.Scanner;

/*
Atendendo ao Estatuto, escreva um programa que solicite a idade do usuário a ser atendido
a fim de encaminhá-lo para a fila comum, se a idade for menor que 60 anos, para a fila prioritária,
se a idade tiver 60 anos ou mais e para a “fila 80+”, se a idade for maior que 80 anos.
 */

/**
 * @author Geovane Silva Ramirez
 */

public class Fila_Prioritaria {
        public static void main(String args[]) {
        
            int idade;
    
 Scanner leitor = new Scanner(System.in);

 
    System.out.println ("DESCUBRA EM QUAL FILA DEVERÁ ESPERAR...");
 
    System.out.println ("Digite sua idade:");
    
    idade = leitor.nextInt();
    
    if (idade < 60) { 
        System.out.print ("Dirija-se para a Fila Comum");
        
    } else {
       
        if ( idade < 80 ) {
            
            System.out.print ("Dirija-se para a Fila Priorirária");
            
        } else {
            
            System.out.println ("Dirija-se para a Fila 80+");
            
        }   
                
                }
    
    }
    
}
