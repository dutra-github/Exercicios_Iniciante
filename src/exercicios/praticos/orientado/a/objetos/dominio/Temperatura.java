package exercicios.praticos.orientado.a.objetos.dominio;
//7.Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
// F=(9*C+160) / 5,  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
public class Temperatura {
    private double celsius, fahrenheit;

    public void convertCelsiusFahrenheit(){
        setFahrenheit((9*getCelsius()+160)/5);
    }

    public void convertFahrenheitCelsius(){
        setCelsius((getFahrenheit() - 32) * 5/9);

    }
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

}
