
package livedes6quest6tarde;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveDes6Quest6Tarde {

    /**
     * Uma loja tem 150 clientes cadastrados e deseja mandar uma correspondência
     * a cada um deles anunciando um bônus especial. Escreva um algoritmo que 
     * leia o nome do cliente e o valor das suas compras no ano passado e 
     * calcule um bônus de 10% se o valor das compras for menor que 500.000 e de
     * 15 %, caso contrário.
     */
    public static void main(String[] args) {
       int cont;
       String nome,perc="", res="                       LISTAGEM DOS BÔNUS                    \n\n"
               + "        NOME                        VALOR R$                       BÔNUS  \n";
       double valorCompra, bonus;
       
       for(cont=1; cont<=2;cont++){
           nome = JOptionPane.showInputDialog("Informe o nome:");
           valorCompra = Double.parseDouble(JOptionPane.
                   showInputDialog("Informe o valor da compra no ano passado:"));
           if(valorCompra <= 500000){
               bonus = valorCompra * 0.1;// (10.0/100.0)
               perc = "10%";
           }else{
               bonus = valorCompra * 0.15;// (15.0/100.0)
               perc = "15%";
           }
           res = res + " "+nome+" - R$"+valorCompra
                   +" - obteve - "+perc+" no valor de R$ "+bonus+"\n";
           
       }//fim do loop
       JOptionPane.showMessageDialog(null, res);
    }
    
}
