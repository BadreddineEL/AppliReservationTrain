package fr.demos.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("/trains")
@Produces("application/xml")

public class TrainResource {
	
	

    public TrainResource() {
    	
    	
    }
	
    
    

    @GET
    public  List<Train> getTrains() {
    	
    	System.out.println("Liste des trains");
    	return TrainBD.getTrains();
    	
    	
    }

    @GET
    @Path("numTrain-{id}")
    public Train getTrain(@PathParam("id") String id) {
    	
    	for (Train t1 : TrainBD.getTrains()) {
			if(t1.getNumTrain().equals(id)){
				System.out.println("train existe dans la liste");
				return t1;
			}
		}
    	System.out.println("train n'existe pas dans la BD");
    	return null;
  
    
    }
    

    @GET
    @Path("/recherche")
    public Train rechercheAvecCriteres(
    	@QueryParam("depart") String depart,
    	@QueryParam("arrivee") String arrivee,
    	@QueryParam("heuredepart") int heureDepart)
    	{
    	
    	for (Train ter : TrainBD.getTrains()){
    		
    		if(ter.getVilleDepart().equals(depart)&& ter.getVilleDepart().equals(arrivee)&& ter.getHeureDepart()==(heureDepart)){
    		 System.out.println("Alerte !");
    			return ter;
    		}
    	}	
    	 	
    	return null;
    }
    
    
     }





