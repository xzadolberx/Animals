
public class Doge extends Animal {
	String color;
	String name;
	double height;
	double weight;

	static boolean Kot;

	public Doge() {
		setLegs(4);
	    setVoice("Bark!");
	}

	public Doge(int legs, String voice, String color, String name, double height, double weight, boolean Kot) {
		this.legs = legs;
		this.voice = voice;
		this.color = color;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.Kot = Kot;
	}

	Doge Mukhtar = new Doge (4, "GAF!", "yellow", "Mukhtar", 0.65, 37.2, false);
	Doge Kotopes = new Doge (4, "“еперь у мен€ весь мех в креме, и уши слиплись!", 
								"yellow and brown", "Kotopes", 0.40, 20.2, true);
}
