package beans;

public class User {
	private int id;
    private String nom, prenom, login, password;
    
	public User() {}
	
	public User( String nom, String prenom, String login, String password) throws InvalidDataException {
		if (nom == null || prenom == null || login == null || password == null) {
			throw new InvalidDataException(" Données saisies incorrectes !");
		}
		
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}
	
	
    
	public User(int id, String nom, String prenom, String login, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password=" + password
				+ "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}


