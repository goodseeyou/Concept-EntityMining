package assets;

public class TextEntity extends EntityFamily{
	final String type = "text entity";
	final String text;
	final String language; 
	public TextEntity(String text, String lang){
		this.text = text;
		this.language = lang;
	}
	public String getType(){
		return this.type;
	}
	@Override
	public String getStringValue() {
		return this.text;
	}
	
}
