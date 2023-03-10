/**
* Classe permettant d'instancier les objets générés par les constructeurs.
* Chaque ville entrée est comptabilisée par un compteur.
 *  (ex. 1.1 - 1.8)
 *  
 *  @author Samuel Le Porcher - 2023
 */
public class TestCity {

	public static void main (String[] args) {

		City Toulouse = new City("Toulouse ", " France ", 450000);
		City Galatini = new City("Galatini", " Italy ", 20000);
		City SaintGeours = new City("Saint Geours ", " France ", 2582);
		City Idron = new City("Idron ", " France ", 4682);
		City Rabat = new City("Rabat ", 577000); // Utilisation du nouveau constructeur

		System.out.printf("%,d\n", 4500000); // Afficher une string formatée contenue dans un objet = à voir plus tard
		Toulouse.setNbInhabitants(-15); // Modification par setter, avec valeur d'entrée trop petite (1.2)
		Toulouse.setNbInhabitants(Toulouse.getNbInhabitants() - 20000); // Retire 20 000 habitants à l'objet Toulouse
		Rabat.setCountryName("Maroc "); // Modification du nom de la ville par setter
		Toulouse.displayCity();
		Galatini.displayCity();
		SaintGeours.displayCity();
		Idron.displayCity();

		// Nouveau constructeur

		Rabat.displayCity();
			
		// Nouvelle méthode

		//	Toulouse.displayAttributes(); 
		// 1.5 => l'affichage de l'objet "Toulouse" va renvoyer l'adresse mémoire dans laquelle celui-ci est contenu
		// En l'occurrence, dans le constructeur City, à l'adresse suivante : City@7f63425a

		System.out.println(Toulouse); // Appel implicite de l'objet Toulouse
		// 1.6 => Les attributs stockés dans une méthode toString, vont être affichés ici via un system.out.println

		System.out.println(City.getCounter());
	}
	}

