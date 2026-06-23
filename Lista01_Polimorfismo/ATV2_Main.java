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
public class ATV2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        ATV2_Exportador exportador = null;

        int resp = -1;

        while (resp != 0) {
            System.out.println("Digite o nome do arquivo que você quer exportar : ");
            String dados = sc.nextLine();

            System.out.println("                        ");
            System.out.println("Você Gostaria de Exportar ele :");
            System.out.println("==================");
            System.out.println("1 - PDF ");
            System.out.println("2 - CSV");
            System.out.println("3 - JSON");
            System.out.println("0 - SAIR ");
            System.out.println("==================");

            resp = sc2.nextInt();

            switch (resp) {
                case 1:
                    exportador = new ATV2_ExportadorPDF();

                    break;
                case 2:
                    exportador = new ATV2_ExportadorCSV();
                
                    break;
                case 3:
                    exportador = new ATV2_ExportadorJSON();

                    break;
                default:
                    System.out.println("Apenas os numeros listados");
                    break;

            }

            System.out.println("Exportando dados ");    
            exportador.exportar(dados);
            
        
    }
   
    
    }
    
    
    
    
}
