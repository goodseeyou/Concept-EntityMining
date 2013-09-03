package assets;

import java.util.HashSet;

public class AbstractConcept extends ConceptFamily{
	final String type = "abstract concept";
	HashSet<RealConcept> concepts = new HashSet<RealConcept>();
	public String getType(){
		return this.type;
	}
	public boolean addRealConcept(RealConcept concept){
		if(concepts.add(concept))
			return true;
		else
			return false;
	}
	public boolean add(Object object){
		if(!(object.getClass() == RealConcept.class))
			return false;
		if(this.addRealConcept((RealConcept) object))
			return true;
		else
			return false;
	}

}
