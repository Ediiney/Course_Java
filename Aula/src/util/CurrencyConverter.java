package util;

public class CurrencyConverter {

	public double Converter(double dollar, double reais) {
		double calc = dollar * reais ;
		double iof = calc*6 / 100;
		return calc + iof; 
	}
}
