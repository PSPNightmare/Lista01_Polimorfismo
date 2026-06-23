/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01_Polimorfismo;

/**
 *
 * @author berna
 */
public class LogEmBancoDeDados extends RegistradorLog {

    @Override
    public void Gravar(String acao) {
        System.out.println("Você logou no banco de dados " +acao);
    }
    
}
