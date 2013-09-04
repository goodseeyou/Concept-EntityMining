package algorithms;

import java.util.ArrayList;
import java.util.HashSet;

import assets.*;

public abstract class Learner {
	public abstract void trainRealConcept(HashSet<EntityFamily> entities); // by set of entities
	public abstract void trainAbstractConcept(ArrayList<RealConcept> realConcepts, Criterion criterion); // vector of entities and criterion 
	
	public abstract Criterion getCriterion(ArrayList<EntityFamily> entities); // 最能代表的real concept 組
	public abstract ArrayList<RealConcept> getRealConcepts(HashSet<EntityFamily> entities); // 包含entities的 real concept query
	public abstract AbstractConcept getAbstractConcept(ArrayList<RealConcept> concepts, Criterion criterion);
	public abstract ArrayList<RealConcept> standForAbstractConept(AbstractConcept abstractConcept);
	public abstract ArrayList<EntityFamily> standForRealConcepts(ArrayList<RealConcept> concepts);
	
	
	
}
