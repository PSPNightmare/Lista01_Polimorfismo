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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        RegistradorLog Registros = null;

        int resp = -1;

        while (resp != 0) {
            System.out.println("Digite uma ação : ");
            String acao = sc.nextLine();

            System.out.println("                        ");
            System.out.println("Você gostaria salvar ele :");
            System.out.println("==================");
            System.out.println("1 - Arquivo ");
            System.out.println("2 - Banco de Dados");
            System.out.println("3 - Nuvem");
            System.out.println("0 - SAIR ");
            System.out.println("==================");

            resp = sc2.nextInt();

            switch (resp) {
                case 1:
                    Registros = new LogEmArquivo();

                    break;
                case 2:
                    Registros = new LogEmBancoDeDados();
                
                    break;
                case 3:
                    Registros = new LogNaNuvem();

                    break;
                default:
                    System.out.println("Apenas os numeros listados");
                    break;

            }

            System.out.println("Processando dados ");    
            Registros.Gravar(acao);
            
            
        }

    }
}
