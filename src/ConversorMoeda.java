import javax.swing.*;

public class ConversorMoeda {
	public void converteRealParaDolar(double valor){
        double dolar = valor / 5.23;
        dolar = (double) Math.round(dolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + dolar + " dólares");
    }

    public void converteRealParaEuro(double valor){
        double euro = valor / 5.52;
        euro = (double) Math.round(euro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + euro + " euros");
    }

    public void converteRealParaLibras(double valor){
        double libras = valor / 6.43;
        libras = (double) Math.round(libras * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem £ " + libras + " libras");
    }

    public void converteDolarParaReal(double valor){
        double real = valor * 5.23;
        real = (double) Math.round(real * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + real + " reais");
    }

    public void converteEuroParaReal(double valor){
        double moedaReais = valor * 5.52;
        moedaReais = (double) Math.round(moedaReais * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReais + " reais");
    }

    public void converteLibrasParaReal(double valor){
        double moedaReais = valor * 6.43;
        moedaReais = (double) Math.round(moedaReais * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem R$ " + moedaReais + " reais");
    }
}
