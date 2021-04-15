
public class Cuenta {


	public static final int ESTANDAR = 0;
	public static final int PRESUPUESTO = 1;
	public static final int PREMIUM = 2;
	public static final int PREMIUM_PLUS = 3;

	static final double PORCENTAJE_TARIFA_CORREDOR = 0.0125;
	static final double DIAS_ANNO = 365.25;

	float capital;
	
	int nuevo;
	float interes;
	int diasActivo;

	int tipoCuenta;

	public float interesGanado() {

		float annos = (float) (diasActivo /  DIAS_ANNO);

		float interesCompuesto = capital * (float) Math.exp(interes * annos);
		
		return (interesCompuesto - capital);
	}

	public boolean isPremium() {

		if (tipoCuenta == Cuenta.PREMIUM || tipoCuenta == Cuenta.PREMIUM_PLUS) {
			return true;
		} else {
			return false;
		}
	}

	
	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}

	public int getDiasActivo() {
		return diasActivo;
	}

	public void setDiasActivo(int diasActivo) {
		this.diasActivo = diasActivo;
	}

	public int getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(int tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	
}
