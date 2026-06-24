/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01_Polimorfismo;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class ATV4_AutenticadorToken extends ATV4_Autenticado{

    @Override
    public void validarAcesso(String credencial) {
        System.out.println("Validando o token: "+credencial);
    }
    
    
    
}
