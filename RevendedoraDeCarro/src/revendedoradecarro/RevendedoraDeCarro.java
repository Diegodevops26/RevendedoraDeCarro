/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revendedoradecarro;

import javax.swing.JOptionPane;
/**
 *
 * @author diego
 */
public class RevendedoraDeCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double salarioMinimo = 1320.00;
        double comissao = 0.08652;
        double valeAlimentacao = 552.00;
        double valeTransporte = 390.00;
        
        double salarioBruto = 2 * salarioMinimo + valeAlimentacao + valeTransporte;
        double vendas = 0.00f;
        
        int cv = JOptionPane.showConfirmDialog(null,"O funcionário realizou vendas de veículos no mês?");
          if(cv == JOptionPane.YES_OPTION){
            boolean entradaValida = false;
            while (!entradaValida) {
                try {
                    vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das vendas no mês:"));
                    if (vendas <= 0) {
                        throw new Exception();
                    }
                    entradaValida = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Digite um valor maior que zero.");
                }
            }
            salarioBruto += vendas * comissao;
        }
          
        double descontoINSS = salarioBruto * 0.09;
        double descontoIR = salarioBruto * 0.115;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        
        JOptionPane.showMessageDialog(null, "Salário bruto: R$ " + salarioBruto + "\nSalário líquido: R$ " + salarioLiquido);
           
    }
    
}
