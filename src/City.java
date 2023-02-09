
public class City {
	// Données à transmettre au constructeur
	private String cityName;
	private String countryName;
	private int nbInhabitants;
	private static int counter=0; // 1.7 Variable statique utilisable pour compter les instances

	public City (String cityName, String countryName, int nbInhabitants) { // paramètres
		// initialisation constructeur (qui permet de générer des villes) = 1.1
		this.cityName = cityName;
		this.countryName = countryName;
		this.nbInhabitants = nbInhabitants;
		this.counter++;

	}
	// Nouveau constructeur qui génère par défaut un nom de pays inconnu (1.3)
	public City (String cityName, int nbInhabitants) {
		this.cityName = cityName;
		this.countryName = "unknown ";
		this.nbInhabitants = nbInhabitants;
		this.counter++;

	}
	// Génération des accesseurs (1.2)

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getNbInhabitants() {
		return nbInhabitants;
	}

	public void setNbInhabitants(int nbInhabitants) {

		if (nbInhabitants<this.nbInhabitants) {
			System.out.println("Valeur entrée trop petite");
		}
		else {
			this.nbInhabitants = nbInhabitants;
		}
	}
	
	public static int getCounter() {
		return counter;
	}
	public void setCounter() {
		
	counter=counter++;
	}
	// affichage des villes (simple)

	public void displayCity() {

		System.out.println(this.cityName+this.countryName+this.nbInhabitants);
	}
	// Affichage des villes (avec détails) = 1.4
	public void displayAttributes () {

		System.out.println("Ville de "+this.cityName+ " en "+this.countryName+" ayant "+this.nbInhabitants+ " habitants");
	}

	public String toString() { // Permet de stocker la string
		return "Ville de " + cityName +" en " +countryName+" ayant "+nbInhabitants+" habitants";//+ super.toString();
	}
	
}
