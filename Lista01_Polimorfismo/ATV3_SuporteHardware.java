/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01_Polimorfismo;

/**
 *
 * @author berna
 */
public class ATV3_SuporteHardware extends ATV3_TratamentoChamado{

    @Override
    public void encaminhar(String descricaoProblema) {
        System.out.println("O chamado foi ouvido e enviaremos um tecnico para sua casa para o problema de: "+descricaoProblema );
        }
    
}
