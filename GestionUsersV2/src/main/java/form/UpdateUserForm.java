package form;
import java.util.HashMap;
import java.util.Map;

import beans.User;
import dao.UserDao;
import jakarta.servlet.http.HttpServletRequest;


public class UpdateUserForm {
User user = new User();
	
	private static final String CHAMP_NOM = "nom";
	private static final String CHAMP_PRENOM = "prenom";
	private static final String CHAMP_LOGIN = "login";
	private static final String CHAMP_PASSWORD = "password";
	private static final String CHAMP_PASSWORD_BIS = "passwordBis";

    private static final String EMPTY_FIELD_ERROR_MESSAGE = "Vous devez renseigner ce champs";
    private static final String WRONG_PASSWORD_ERROR_MESSAGE = " Vos mots de passe ne sont pas conformes";
	
	
	private HttpServletRequest request;
	private Map<String, String> erreurs;
	private boolean status;
	private String statusMessage;

	
	public User getUser() {
		return user;
	}
	
	public static String getChampNom() {
		return CHAMP_NOM;
	}

	public static String getChampPrenom() {
		return CHAMP_PRENOM;
	}

	public static String getChampLogin() {
		return CHAMP_LOGIN;
	}

	public static String getChampPassword() {
		return CHAMP_PASSWORD;
	}

	public static String getChampPasswordBis() {
		return CHAMP_PASSWORD_BIS;
	}

	public static String getEmptyFieldErrorMessage() {
		return EMPTY_FIELD_ERROR_MESSAGE;
	}

	public static String getWrongPasswordErrorMessage() {
		return WRONG_PASSWORD_ERROR_MESSAGE;
	}
	
	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public boolean isStatus() {
		return status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	
	public UpdateUserForm(HttpServletRequest request) {
		this.request = request;
		this.erreurs = new HashMap<String, String>();
	}
	
	public boolean add () {
		String nom  = getParameter(CHAMP_NOM);
		String prenom  = getParameter(CHAMP_PRENOM);
		String login  = getParameter(CHAMP_LOGIN);
		String password  = getParameter(CHAMP_PASSWORD);
		String passwordBis  = getParameter(CHAMP_PASSWORD_BIS);
		
		user = new User(nom, prenom, login, password);
		
		
		validerChamps(CHAMP_NOM, CHAMP_PRENOM, CHAMP_LOGIN, CHAMP_PASSWORD, CHAMP_PASSWORD_BIS );
		validerPassword();
		
		
		if (erreurs.isEmpty()) {
			status = true;
			statusMessage = "Modifié effectué avec succès";
			UserDao.update(user);
		} else {
			status = false;
			statusMessage = "Echec de la modification";
		}
		return status;
	}
	
	public String getParameter (String champ) {
		String valeur = this.request.getParameter(champ);
		
		return (valeur == null || valeur.trim().isEmpty()) ? null : valeur.trim();
	}
	
	public void validerChamps ( String ...champs) {
		for(String champ : champs) {
			if (this.getParameter(champ) == null ) {
				erreurs.put(champ, EMPTY_FIELD_ERROR_MESSAGE);
			}
		}
	}
	
	public void validerPassword() {
		String password = this.getParameter(CHAMP_PASSWORD);
		String passwordBis = this.getParameter(CHAMP_PASSWORD_BIS);
		
		if (password != null && !password.equals(passwordBis)) {
			erreurs.put(CHAMP_PASSWORD, WRONG_PASSWORD_ERROR_MESSAGE);
			erreurs.put(CHAMP_PASSWORD_BIS, WRONG_PASSWORD_ERROR_MESSAGE);

		}
	}
}
