package assets;

public class TextEntity extends EntityFamily{
	final String type = "text entity";
	final String text;
	public TextEntity(String text){
		this.text = text;
	}
	public String getType(){
		return this.type;
	}
	@Override
	public String getStringValue() {
		return this.text;
	}
	
}
