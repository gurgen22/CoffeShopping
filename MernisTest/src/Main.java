import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("tc numaras�"),
				"AD(B�Y�K)",
				"SOYAD(B�Y�K)",
				1995 // Do�um Y�l�
				);
		System.out.println("do�rulama :"+(result ? "ba�ar�l�": "ba�ar�s�z"));
		
		
	}

}
