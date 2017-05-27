package tabLaureat;

public class Laureat {
	
	private String nom ;
	private String prenom ;
	private String matricule ;
	private String email ;
	private String filiere ;
	private String faculte ;
	private String numero ;
	public Laureat(String nom, String prenom, String matricule, String email,
			String filiere, String faculte, String numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.email = email;
		this.filiere = filiere;
		this.faculte = faculte;
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getFaculte() {
		return faculte;
	}
	public void setFaculte(String faculte) {
		this.faculte = faculte;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

}
