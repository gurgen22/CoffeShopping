import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("tc numarasý"),
				"AD(BÜYÜK)",
				"SOYAD(BÜYÜK)",
				1995 // Doðum Yýlý
				);
		System.out.println("doðrulama :"+(result ? "baþarýlý": "baþarýsýz"));
		
		
	}

}
