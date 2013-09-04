package assets;

import java.util.HashSet;

public class Criterion extends ConceptFamily{
	final String type = "criterion";
	HashSet<RealConcept> realConcepts = new HashSet<RealConcept>();
	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public boolean add(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

}
