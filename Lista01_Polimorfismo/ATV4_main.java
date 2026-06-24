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
public class ATV4_main {
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        ATV4_Autenticado autenticado = null;
        
        int resp = -1;
        String senha = "  " ;
        
        while (resp != 0){
        System.out.println("Escolha uma opção");
        System.out.println("==================");
        System.out.println("1. Senha");
        System.out.println("2. Biometria");
        System.out.println("3. Token");
        System.out.println("0. SAIR");
        
        resp = sc1.nextInt();
        
        switch (resp){
            case 1 :
                autenticado = new ATV4_AutenticadorSenha ();
                System.out.println("Digite sua senha");
                senha = sc2.nextLine();
                autenticado.validarAcesso(senha);
                break;
                
            case 2:
                autenticado = new ATV4_AutenticadorBiometrico();
                autenticado.validarAcesso(senha);
                break;
                
            case 3:
                autenticado = new ATV4_AutenticadorToken();
                System.out.println("Digite seu token ");
                senha = sc2.nextLine();
                autenticado.validarAcesso(senha);
                break;
                
            default :
                System.out.println("Apenas os listados");
                break;
                
        }
        
        
        
        
        }
        
        
        
        
    }
}
