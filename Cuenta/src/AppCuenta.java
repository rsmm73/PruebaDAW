
public class AppCuenta {

	public static void main(String[] args) {
		
				
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setCapital(20000);
		cuenta1.setDiasActivo(200);
		cuenta1.setInteres((float) 2.25);
		cuenta1.setTipoCuenta(Cuenta.PREMIUM);
		
		
		Cuenta cuenta2 = new Cuenta();
		cuenta2.setCapital(36000);
		cuenta2.setDiasActivo(400);
		cuenta2.setInteres((float) 1.25);
		cuenta2.setTipoCuenta(Cuenta.ESTANDAR);
		
		Cuenta listaCuentas[] = new Cuenta[2];
		listaCuentas[0]= cuenta1;
		listaCuentas[1]= cuenta2;
		
		System.out.println("=Total=>"+calculoInteres(listaCuentas));
		
	}
	
	public static float calculoInteres(Cuenta cuentas[]) {

		float totalInteres = 0;
		float ganado=0;
		Cuenta cuenta;
		
		for (int i = 0; i < cuentas.length; i++) {
			cuenta = cuentas[i];
			ganado=0;
			
			if (cuenta.isPremium()) {
				ganado = (float) Cuenta.PORCENTAJE_TARIFA_CORREDOR * cuenta.interesGanado();
				totalInteres += ganado;
			}
			
			System.out.println("cuenta "+(i+1) + " intereses ganados ="+ganado);
		}
		
	
		return totalInteres;
	}
}
