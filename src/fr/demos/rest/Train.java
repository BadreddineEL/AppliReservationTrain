package fr.demos.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "train")


public class Train {

	    private String numTrain;
	    
	    private String villeDepart;
	    
	    private String villeArrivee;
	    
	    private int heureDepart; // Format : 1230 = 12h30

	    public Train(){
	    	
	    	
	    	
	    }
	    public Train(String num, String villeD, String VilleA, int heure) {
	    	
	    	this.numTrain=num;
	    	this.villeDepart=villeD;
	    	this.villeArrivee=VilleA;
	    	this.heureDepart=heure;	
	    	
	    }

		public void setNumTrain(String numTrain) {
			this.numTrain = numTrain;
		}
		public void setVilleDepart(String villeDepart) {
			this.villeDepart = villeDepart;
		}
		public void setVilleArrivee(String villeArrivee) {
			this.villeArrivee = villeArrivee;
		}
		public int getHeureDepart() {
			return heureDepart;
		}

		public void setHeureDepart(int heureDepart) {
			this.heureDepart = heureDepart;
		}

		public String getNumTrain() {
			return numTrain;
		}

		public String getVilleDepart() {
			return villeDepart;
		}

		public String getVilleArrivee() {
			return villeArrivee;
		}

		@Override
		public String toString() {
			return "Train [numTrain=" + numTrain + ", villeDepart=" + villeDepart + ", villeArrivee=" + villeArrivee
					+ ", heureDepart=" + heureDepart + "]";
		}

	    
		
	}
	
	


