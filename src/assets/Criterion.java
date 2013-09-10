package assets;

import java.util.HashSet;

public class Criterion extends ConceptFamily{
	final String type = "criterion";
	boolean isRought;
	boolean isInitialized = false;
	HashSet<RealConcept> realConcepts;
	
	public Criterion(){
		this.isRought = true;
	}
	public Criterion(HashSet<RealConcept> concepts){
		this.realConcepts = concepts;
		this.isRought = false;
		this.isInitialized = true;
	}
	@Override
	public String getType() {
		return this.type;
	}

	public boolean addRealConcept(RealConcept concept){
		if(this.realConcepts.add(concept))
			return true;
		else
			return false;
	}
	@Override
	public boolean add(Object object) {
		if(object.getClass() != RealConcept.class)
			return false;
		else{
			if(! this.isInitialized){
				this.realConcepts = new HashSet<RealConcept>();
			}
			if(this.addRealConcept((RealConcept)object))
				return true;
			else
				return false;
		}
	}

}
