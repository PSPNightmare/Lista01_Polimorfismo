/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01_Polimorfismo;

/**
 *
 * @author BERNARDOMACHADODEBOR
 */
public class ATV5_ProcessadorApenasAudio extends ATV5_ProcessadorVideo{

    @Override
    public void processar(String nomeArquivo) {
        
        System.out.println("Arquivo " + nomeArquivo+ " processado apenas o audio");
        
    }
    
}
