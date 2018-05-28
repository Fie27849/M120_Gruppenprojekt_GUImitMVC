package mvc.model;

public class dreieck3d 
{
	/**
	 * Programm welches anhand der Koordinaten die Fläche eines Dreiecks im 3 Dimensionalen Raum berechnet
	 */
	public dreieck3d()
	{
		
	}
	/**
	 * Um die Fläche zu berechnen wird der Winkel Gamma benötigt
	 */
	public double gammabestimmen(double a, double b, double c)
	{
		double gamma = Math.acos((c * c - a * a - b * b) / (-2 * a * b));
		return gamma;
	}
	/**
	 * Hier werden die drei Seiten a,b,c berechnet.
	 * 
	 */
	public double[] seitenberechnen(int xa, int xb, int xc, int ya, int yb, int yc, int za, int zb, int zc)
	{
		double[] seiten = new double[3];
		double c = Math.sqrt(Math.pow((xa-xb), 2) + Math.pow((ya-yb), 2) + Math.pow((za-zb), 2));
		double a = Math.sqrt(Math.pow((xb-xc), 2) + Math.pow((yb-yc), 2) + Math.pow((zb-zc), 2));
		double b = Math.sqrt(Math.pow((xc-xa), 2) + Math.pow((yc-ya), 2) + Math.pow((zc-za), 2));
		
		seiten[0] = a;
		seiten[1] = b;
		seiten[2] = c;
		return seiten;
	}
	/**
	 * Berechnet anhand der Seiten a und b und dem Sinus des Winkels Gamma die Fläche des Dreiecks ABC
	 * @return Fläche
	 */
	public double flaechebestimmen(double a, double b,double gamma)
	{
		
		 double flaeche = 0.5 * a * b * Math.sin(gamma);
		 return flaeche;
	}
	
	
}
