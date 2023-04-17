import javax.swing.*;

public class ConversorTemperatura {
	public void converterCelsiusParaFahrenheit(double valor){
        double fahrenheit = valor / 5.23;
        fahrenheit = valor * 1.8 + 32;
        JOptionPane.showMessageDialog(null, valor + "°C é equivalente à " + Math.round(fahrenheit) + " °F.");
    }

    public void converterCelsiusParaKelvin(double valor){
        double kelvin = valor / 5.23;
        kelvin = valor + 273;
        JOptionPane.showMessageDialog(null, valor + "°C é equivalente à " + Math.round(kelvin) + " K.");
    }

    public void converterFahrenheitParaCelsius(double valor){
        double celsius = valor / 5.23;
        celsius = (valor - 32) / 1.8;
        JOptionPane.showMessageDialog(null, valor + "°F é equivalente à " + Math.round(celsius) + " °C.");
    }

    public void converterKelvinParaCelsius(double valor){
        double celsius = valor / 5.23;
        celsius = valor - 273;
        JOptionPane.showMessageDialog(null, valor + "K é equivalente à " + Math.round(celsius) + " °C.");
    }
}
