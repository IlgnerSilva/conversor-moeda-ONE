import javax.swing.*;
public class Executa {
	
	
	public void executaMoeda(double valor) {
			ConversorMoeda moeda = new ConversorMoeda();
			String moedaConversao = JOptionPane.showInputDialog(null, "Escolha a conversão de moedas", "Moedas",
	                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Reais para Dólar", "Reais para Euros", "Reais para Libras", "Dólar para Reais", "Euros para Reais", "Libras para Reais"}, "Escolha").toString();
		switch(moedaConversao) {
			case "Reais para Dólar":
				moeda.converteRealParaDolar(valor);
				break;
			case "Reais para Euros":
				moeda.converteRealParaEuro(valor);
				break;
			case "Reais para Libras":
				moeda.converteRealParaLibras(valor);
				break;
			case "Dólar para Reais":
				moeda.converteDolarParaReal(valor);
				break;
			case "Euros para Reais":
				moeda.converteEuroParaReal(valor);
				break;
			case "Libras para Reais": 
				moeda.converteRealParaLibras(valor);
				break;	
		}
	}
	public void executaTemperatura(double valor) {
		ConversorTemperatura temperatura = new ConversorTemperatura();
		String temperaturaConversao = JOptionPane.showInputDialog(null, "Escolha a tempratura para converter", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Celsius para Fahrenheit" , "Celsius para Kelvin" , "Fahrenheit para Celsius", "Kelvin para Celsius"}, "Escolha").toString();
		switch(temperaturaConversao) {
			case "Celsius para Fahrenheit":
				temperatura.converterCelsiusParaFahrenheit(valor);
				break;
			case "Celsius para Kelvin":
				temperatura.converterCelsiusParaKelvin(valor);
				break;
			case "Fahrenheit para Celsius":
				temperatura.converterFahrenheitParaCelsius(valor);
				break;
			case "Kelvin para Celsius":
				temperatura.converterKelvinParaCelsius(valor);
		}
	}
}
