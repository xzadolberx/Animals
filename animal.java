public class animal {
	public Boolean legs;

	public int setLegs (int legs)
	{
		return legs;
	}
	
	public String voice;

	public String setVoice (String voice)
	{
		this.voice = voice;
		//System.out.println (voice);
		return voice;
	}

	public void voice() {
		System.out.println(voice);
	}

	public static void main(String... args) {
		//animal cote = new cote();
		animal doge = new doge();
		animal animal = new animal();

		animal cote = new cote ("Дай жрать!",4);
		cote chernobyl_cote = new cote ("Проходи сталкер!", 6);

		doge.tmp(cote);
		doge.tmp(doge);
		doge.tmp(animal);
		doge.tmp(chernobyl_cote);
	}

	private void tmp(animal a) {
		animal.voice();
	}
}
