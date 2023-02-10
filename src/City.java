/**
 * Classe contenant les constructeurs permettant de générer et d'afficher des villes, leur
 *  pays, et leur population. Chaque ville entrée est comptabilisée par un compteur.
 *  (ex. 1.1 - 1.8)
 *  
 *  @author Samuel Le Porcher - 2023
 */
public class City {
	// Données à transmettre au constructeur
	public String cityName;
	private String countryName;
	private int nbInhabitants;
	private static int counter=0; // 1.7 Variable statique utilisable pour compter les instances
	// Tous les objets auront le compteur en commun.

	public City (String cityName, String countryName, int nbInhabitants) { // paramètres
		// initialisation constructeur (qui permet de générer des villes) = 1.1
		this.cityName = cityName;
		this.countryName = countryName;
		this.nbInhabitants = nbInhabitants;
		this.counter++;
		/** @return the name/country/number of inhabitants from each entered city. **/
	}
	// Nouveau constructeur qui génère par défaut un nom de pays inconnu (1.3)
	public City (String cityName, int nbInhabitants) {
		this.cityName = cityName;
		this.countryName = "unknown ";
		this.nbInhabitants = nbInhabitants;
		this.counter++;
	}
	public City (String cityName, String countryName) {
		
		this.cityName = cityName;
		this.countryName = countryName;
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

		if (nbInhabitants<0) {
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
		/** @return city's description (short). **/
	}
	// 1.4
	public void displayAttributes () {

		System.out.println("Ville de "+this.cityName+ " en "+this.countryName+" ayant "+this.nbInhabitants+ " habitants");
		/** @return city's description (detailed). **/
	}

	public String toString() { // Permet de stocker la string
		return "Ville de " + cityName +" en " +countryName+" ayant "+nbInhabitants+" habitants";//+ super.toString();
	}

}
