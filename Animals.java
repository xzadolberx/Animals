public class Animal {
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

	public void getVoice() {
		System.out.println (voice);
	}

	public static void main(String... args) {
		animal cote = new Cote();
		animal doge = new Doge();
		animal animal = new Animal();

		animal cote = new Cote ("Дай жрать!",4);
		Cote chernobyl_cote = new Cote ("Проходи сталкер!", 6);

		System.out.println(cote.legs);
		System.out.println(doge.legs);
		System.out.println(animal.legs);

		System.out.println("========");
		System.out.println(cote.voice);

		System.out.println(doge.voice);
		System.out.println(animal.voice);


		Animal animal = new Cote();
		//animal.climb(); //ошибка
		Cote cote = (Cote) animal;
		cote.climb(); // а теперь работает

		cote.climb ("Дерево", 3);
	}

	private void tmp(animal a) {

	}
}
