/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01_Polimorfismo;

/**
 *
 * @author berna
 */
public class ATV2_ExportadorPDF extends ATV2_Exportador {

    @Override
    public void exportar(String dados) {
        System.out.println("Gerando páginas e bloqueando edição para: " + dados);
    }
    
}
