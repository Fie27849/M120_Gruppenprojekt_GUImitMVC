package mvc.template;
/**
 * Template wird nicht gestartet
 * @author Denis
 *
 */
public class model {

	private String name;

	public model(String name) {
		this.name = name;
	}

	public model() {
		this.name = "Ruedi";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
