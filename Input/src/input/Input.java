/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;
import java.util.Scanner;

/**
 *
 * @author azlin
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ListNum = new int[20];
        int a = 0;
        int resp = 0;
        String i = "0";
        System.out.println("Informe o valor alvo: ");
        resp = input.nextInt();
        
        while (!(i.equals("n"))){
            System.out.println("Informe o valor da lista: ");
            ListNum[a] = input.nextInt();
            System.out.println("Deseja continuar informando? (Y/n)");
            i = input.next();
            a++;
            }
                
        System.out.println("Finalizado");
        //int j = ListNum.length;
        for(int c = 0; c < ListNum.length; c++){
            for(int d = 0; d < ListNum.length; d++){
                if(ListNum[c] != 0 && ListNum[d] != 0 && ListNum[c] + ListNum[d] == resp){
                    System.out.print(ListNum[c] +" + " + ListNum[d] + " = ");
                    System.out.println(ListNum[c] + ListNum[d]);
                }
            }
        }   
    }
}
    

