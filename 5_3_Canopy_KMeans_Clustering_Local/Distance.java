package edu.cmu;
/**
 *	10605 BigML
 *  Assignment7: K-Means Clustering with canopy selection on MapReduce
 *	Andrew id: qxi
 *	@author Qiangjian(Jason) Xi
 *	
 */
public class Distance {

	// Calculate Euclidean distance
	public static final double measure(String center, String v) {
		double sum = 0;
		
		String[] centerElements = center.split(",");
		String[] vElements = v.split(",");
		
		double[] centerElmInt = new double[centerElements.length];
		double[] vElmInt = new double[vElements.length];	
		
		// Change String to double
		for(int i = 0; i < centerElmInt.length; ++i) {	
			centerElmInt[i] = Double.parseDouble(centerElements[i]);
		}
		// Change String to double
		for(int i = 0; i < vElements.length; ++i) {	
			vElmInt[i] = Double.parseDouble(vElements[i]);
		}

		// calculate 
		for(int i = 1; i < vElements.length; ++i) {
			sum += (centerElmInt[i] - vElmInt[i]) * (centerElmInt[i] - vElmInt[i]);
		}

		return sum;
	}

}
