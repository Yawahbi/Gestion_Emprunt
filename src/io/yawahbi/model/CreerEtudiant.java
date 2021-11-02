package io.yawahbi.model;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import io.yawahbi.bean.Etudiant;

public final class CreerEtudiant {
	
	
	private static final String CHAMP_NUM_APOGEE  = "numApogee";
	private static final String CHAMP_NOM  = "nom";
	private static final String CHAMP_PRENOM  = "prenom";
	private static final String CHAMP_TEL  = "numTel";
	private static final String CHAMP_EMAIL  = "adresseMail";
	private static final String CHAMP_FILIERE  = "filiere";
	
	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();

	public String getResultat() {
	    return resultat;
	}

	public Map<String, String> getErreurs() {
	    return erreurs;
	}
	
	public Etudiant creer( HttpServletRequest request ) {
	    String numApogee = getValeurChamp( request, CHAMP_NUM_APOGEE );
	    String nom = getValeurChamp( request, CHAMP_NOM );
	    String prenom = getValeurChamp( request, CHAMP_PRENOM );
	    String numTel = getValeurChamp( request, CHAMP_TEL );
	    String adresseMail = getValeurChamp( request, CHAMP_EMAIL );
	    String filiere = getValeurChamp( request, CHAMP_FILIERE );

	    Etudiant etudiant = new Etudiant();

	    try {
	        validationNumApogee( numApogee );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_NUM_APOGEE, e.getMessage() );
	    }
	    etudiant.setNumApogee( numApogee);

	    try {
	    	validationNom( nom );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_NOM, e.getMessage() );
	    }
	    etudiant.setNom( nom );
	    
	    try {
	    	validationPrenom( prenom );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_PRENOM, e.getMessage() );
	    }
	    etudiant.setPrenom( prenom );
	    
	    try {
	        validationNumTel( numTel );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_TEL, e.getMessage() );
	    }
	    etudiant.setNumTel( numTel );
	    
	    try {
	        validationEmail( adresseMail );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_EMAIL, e.getMessage() );
	    }
	    etudiant.setAdresseMail( adresseMail );
	    
	    try {
	    	validationFiliere( filiere );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_FILIERE, e.getMessage() );
	    }
	    etudiant.setFiliere( filiere );

	    if ( erreurs.isEmpty() ) {
	        resultat = "Succès de la creation d'etudiant.";
	    } else {
	        resultat = "Échec de la creation d'etudiant.";
	    }

	    return etudiant;
	}
	
	private void validationNumApogee(String numApogee) throws Exception {
		if ( numApogee != null ) {
	        if ( !numApogee.matches( "^[0-9]*$" ) ) {
	            throw new Exception( "Merci de saisir une numero apogee valide." );
	        }
	    } else {
	        throw new Exception( "Merci de saisir une numero apogee." );
	    }
	}
	
	private void validationNom( String nom ) throws Exception {
	    if ( nom == null ) {
	        throw new Exception( "Merci de saisir un nom." );
	    }
	}
	
	private void validationPrenom( String prenom ) throws Exception {
	    if ( prenom == null ) {
	        throw new Exception( "Merci de saisir un prenom." );
	    }
	}

	private void validationEmail( String adresseMail ) throws Exception {
	    if ( adresseMail != null ) {
	        if ( !adresseMail.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
	            throw new Exception( "Merci de saisir une adresse mail valide." );
	        }
	    } else {
	        throw new Exception( "Merci de saisir une adresse mail." );
	    }
	}
	
	private void validationNumTel( String numTel ) throws Exception {
	    if ( numTel != null ) {
	        if ( !numTel.matches( "\\d{9}" ) ) {
	            throw new Exception( "Merci de saisir un numero de telephone valide." );
	        }
	    } else {
	        throw new Exception( "Merci de saisir un numero de telephone." );
	    }
	}

	private void validationFiliere( String filiere ) throws Exception {
	    if ( filiere == null) {
	        throw new Exception( "Merci de saisir une filiere." );
	    }
	}


	private void setErreur( String champ, String message ) {
	    erreurs.put( champ, message );
	}

	private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
	    String valeur = request.getParameter( nomChamp );
	    if ( valeur == null || valeur.trim().length() == 0 ) {
	        return null;
	    } else {
	        return valeur.trim();
	    }
	}
}
