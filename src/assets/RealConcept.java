package assets;

import java.util.HashSet;

public class RealConcept extends ConceptFamily{
	final String type = "real concept";
	HashSet<EntityFamily> entities = new HashSet<EntityFamily>();
	
	public String getType(){
		return this.type;
	}
	public boolean addEntity(EntityFamily entity){
		if(entities.add(entity)){
			return true;
		}
		else
			return false;
	}
	public boolean add(Object object){
		if(object.getClass()!=EntityFamily.class)
			return false;
		if(this.addEntity((EntityFamily) object))
			return true;
		else
			return false;
	}
}
