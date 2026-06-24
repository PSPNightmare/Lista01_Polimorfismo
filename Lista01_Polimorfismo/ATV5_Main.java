/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01_Polimorfismo;

import java.util.Scanner;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class ATV5_Main {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        ATV5_ProcessadorVideo processarVideo = null;

        System.out.println("Digite o nome do arquivo: ");
        String nome = sc1.nextLine();

        int resp = -1;

        while (resp != 0) {

            System.out.println("1- Alta definição");
            System.out.println("2- Mobile");
            System.out.println("3- Apenas o Audio");

            resp = sc1.nextInt();

            switch (resp) {
                case 0:
                    System.out.println("            ");
                    break;
                case 1:
                    processarVideo = new ATV5_ProcessadorAltaDefinicao();
                    break;

                case 2:
                    processarVideo = new ATV5_ProcessadorMobile();
                    break;

                case 3:
                    processarVideo = new ATV5_ProcessadorApenasAudio();
                    break;

                default:
                    System.out.println("Apenas os listados");
                    break;

            }

            processarVideo.processar(nome);

        }

    }

}
