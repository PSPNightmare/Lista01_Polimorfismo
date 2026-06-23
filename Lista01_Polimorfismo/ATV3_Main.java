/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01_Polimorfismo;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class ATV3_Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
         ATV3_TratamentoChamado chamado = null;

        int resp = -1;

        while (resp != 0) {
            System.out.println("Digite o problema: ");
            String problema = sc.nextLine();

            System.out.println("                        ");
            System.out.println("Você gostaria de cahmar qual assistencia:");
            System.out.println("==================");
            System.out.println("1 - Hardware ");
            System.out.println("2 - Rede");
            System.out.println("3 - Software");
            System.out.println("0 - SAIR ");
            System.out.println("==================");

            resp = sc2.nextInt();

            switch (resp) {
                case 1:
                    chamado = new ATV3_SuporteHardware();

                    break;
                case 2:
                    chamado = new ATV3_SuporteRede();
                
                    break;
                case 3:
                    chamado = new ATV3_SuporteSoftware();

                    break;
                default:
                    System.out.println("Apenas os numeros listados");
                    break;

            }

            System.out.println("Processando chamado... ");    
            chamado.encaminhar(problema);
        
        
        
        
        }
        
        
        
    }
    
}
