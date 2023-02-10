
public class TestPerson {

	public static void main (String[] args) {
		
		Person manu = new Person("Emmanuel", "Macron", 43, "Elysee à Paris", new City("Amiens", "France"));
		Person poutine = new Person ("Vladimir", "Poutine", 66);
		Person biden = new Person("Joe", "Biden");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);

	}
}
