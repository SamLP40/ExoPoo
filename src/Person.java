/**
 * Programme qui affiche le nom/prénom/âge d'une personne, et
 * le lieu de naissance de celle-ci.
 * 
 * En construction ! (ex 1.9)
 * 
 * @author Le-porcherS @date 2023-2-10
 */
import java.util.ArrayList;
public class Person {

	private static Object cityName;
	public String firstName;
	public String lastName;
	public int age=0;
	public String address;
	public City birthLocation;
	
	public Person(String firstName, String lastName, int age, String address) {
		// Constructeur par défaut qui affiche toutes les données.
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.birthLocation = birthLocation;
	}
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = "unknown";
	}
	public Person(String lastName, String firstName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = "unknown";	
	}
	// (1.9) Constructeur qui doit utiliser l'objet cityName pour l'afficher (en construction)
	 public Person(String lastName, String firstName, int age, String address, City cityName) {
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.cityName = cityName;
		
	 }
	
	private String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	private City getBirthLocation() {
		return birthLocation;
	}
	private void setBirthLocation(City birthLocation) {
		this.birthLocation = birthLocation;
	}
	// Affichage en dur : avec ToString (1.8)
	public String toString() { // Permet de stocker le contenu à renvoyer (1ère méthode)
		return "Person [firstName= "+lastName+", lastName= "+firstName+", age= "+age+", address= "+address+"]";//
	}
	// Affichage automatisé = parcours d'un tableau d'éléments (ArrayList)
	
	// Constructeur générant un tableau contenant les données
	// qu'il place lui-même dans chaque case (1.8)
	public Person(String lastName, String firstName, String address) {
		ArrayList<String> d = new ArrayList<>();

		d.add(firstName);
		d.add(lastName);
		d.add(address);
		// à finir
	}
		
}

