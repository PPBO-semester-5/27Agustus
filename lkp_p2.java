class KonversiSuhuTest {
	public static void main(String[] args){
		double suhuCelcius = 39.0;
		double suhuFahrenheit = 102.2;
		System.out.println("\nPROGRAM KONVERSI SUHU");
		
		KonversiSuhu suhuC = new KonversiSuhu();
		double resultCtf = suhuC.toFahrenheit(suhuCelcius);
		System.out.println((suhuCelcius) + " Suhu dalam Celsius adalah " + (resultCtf) + " Fahrenheit");
		
		KonversiSuhu suhuF = new KonversiSuhu();
		double resultFtc = suhuF.toCelsius(suhuFahrenheit);
		System.out.println((suhuFahrenheit) + " Suhu dalam Fahrenheit adalah " + (resultFtc) + " Celsius");
	}
}
class KonversiSuhu {
    static double toFahrenheit(double C) {
        return C * 1.8 + 32;
    }
    static double toCelsius(double F) {
        return (F - 32) / 1.8;
    }
}