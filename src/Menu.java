import javax.swing.*;
public class Menu {
	public static void menu() {
		String opcoes = JOptionPane.showInputDialog(null,"Escolha a conversão", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"},"Escolha").toString();

		String entrada = JOptionPane.showInputDialog("Digite um valor");
		
		if(opcoes == "Conversor de Moeda") {
			double valorRecebido = Double.parseDouble(entrada);
			Executa executa = new Executa();
			executa.executaMoeda(valorRecebido);
			int resposta = JOptionPane.showConfirmDialog(null,"Deseja Continuar?");
            if (resposta == JOptionPane.OK_OPTION){
                Menu.menu();
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
		}else {
			double valorRecebido = Double.parseDouble(entrada);
			Executa executa = new Executa();
			executa.executaTemperatura(valorRecebido);
			int resposta = JOptionPane.showConfirmDialog(null,"Deseja Continuar?");
            if (resposta == JOptionPane.OK_OPTION){
                Menu.menu();
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
		}
	}
}
