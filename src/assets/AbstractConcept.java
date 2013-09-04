package assets;

import java.util.ArrayList;
import java.util.HashSet;

public class AbstractConcept extends ConceptFamily{
	final String type = "abstract concept";
	HashSet<ArrayList<RealConcept>> concepts = new HashSet<ArrayList<RealConcept>>();
	Criterion criterion = new Criterion();
	public String getType(){
		return this.type;
	}
	public boolean addRealConcept(ArrayList<RealConcept> conceptArray){
		if(concepts.add(conceptArray))
			return true;
		else
			return false;
	}
	public boolean add(Object object){
		if(!(object.getClass() == ArrayList.class))
			return false;
		else{
			ArrayList tmp = (ArrayList) object;
			if(tmp.get(0).getClass() != RealConcept.class)
				return false;
		}
		if(this.addRealConcept((ArrayList<RealConcept>) object))
			return true;
		else
			return false;
	}

}
