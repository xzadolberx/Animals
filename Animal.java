public class Animal {
	public int legs;

	public int setLegs(int legs)
	{
		return legs;
	}
	
	public String voice;

	public String setVoice(String voice)
	{
		this.voice = voice;
		//System.out.println (voice);
		return voice;
	}

	public void getVoice() 
	{
		System.out.println(voice);
	}

	public static void main(String... args) {
		Animal cote = new Cote();
		Animal doge = new Doge();
		Animal animal = new Animal();

		Animal coteWithConstructor = new Cote("Дай жрать!",4);
		Cote chernobyl_cote = new Cote("Проходи сталкер!", 6);

		System.out.println(cote.legs);
		System.out.println(doge.legs);
		System.out.println(animal.legs);

		System.out.println("========");
		System.out.println(cote.voice);

		System.out.println(doge.voice);
		System.out.println(animal.voice);


		Animal animalLikeCote = new Cote();
		//animal.climb(); //ошибка
		Cote coteWhatBeenAnimal = (Cote) animalLikeCote;
		//cote.climb(); // а теперь работает

		//animalLikeCote.climb ("Дерево", 3);
		coteWhatBeenAnimal.climb ("Дерево", 3);
	}

	private void tmp(Animal a) {}
}
