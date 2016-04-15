package fr.demos.rest;

import java.util.ArrayList;
import java.util.List;

public class TrainBD {

	
	   private static List<Train> trains = new ArrayList<Train>();


	    static {
	        trains.add(new Train("TR123", "Poitiers", "Paris", 1250));
	        trains.add(new Train("TR127", "Poitiers", "Paris", 1420));
	        trains.add(new Train("TR129", "Poitiers", "Paris", 1710));
	    }
		
	    
	    public TrainBD(){
	    	
	    }
	    

		public static List<Train> getTrains() {
			return trains;
		}


		@Override
		public String toString() {
			return "TrainBD [toString()=" + super.toString() + "]";
		}
	  
	    
	}

