
public class Freaction {

	private String text;

	public Freaction(String text) {
		this.text = text;
	}
	public String toString() {
		return text;
	}
	
	public static void main(String[] args) {
		Freaction texte = new Freaction("toto");
		System.out.println(texte.toString());
	}
	
}
