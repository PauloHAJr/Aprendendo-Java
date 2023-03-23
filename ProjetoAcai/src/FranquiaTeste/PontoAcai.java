package FranquiaTeste;

import javax.swing.*;
import java.text.NumberFormat;

public class PontoAcai {
    public static void main(String[] args) {

        Acai a1 = new Acai();

        NumberFormat z = NumberFormat.getCurrencyInstance();

        String tamanho = JOptionPane.showInputDialog(null,"Escolha a opção: \nP - 300ml \nM - 500ml \nG - 700ml");

        String desejaSorvete = JOptionPane.showInputDialog(null,"Deseja sorvete: \nS - Sim \nN - Não");

        Boolean acrescimoSorvete;
        if (desejaSorvete.equals("S")|desejaSorvete.equals("s"))
            acrescimoSorvete = true;
        else
            acrescimoSorvete = false;

        a1.CalculaValor(acrescimoSorvete, tamanho);

        JOptionPane.showMessageDialog(null,"O valor é: "+z.format(a1.getValor()));
    }
}
