package io.yawahbi.model;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import io.yawahbi.bean.Emprunt;
import io.yawahbi.bean.Etudiant;

public final class CreerEmprunt {
	
	
	private static final String CHAMP_REF  = "reference";
	private static final String CHAMP_DATE  = "date";
	private static final String CHAMP_PERIODE  = "periode";

	
	private String resultat;
	private Map<String, String> erreurs = new HashMap<String, String>();

	public String getResultat() {
	    return resultat;
	}

	public Map<String, String> getErreurs() {
	    return erreurs;
	}
	
	public Emprunt creer( HttpServletRequest request ) {
	    String reference = getValeurChamp( request, CHAMP_REF );
	    String date = getValeurChamp( request, CHAMP_DATE );
	    String periode = getValeurChamp( request, CHAMP_PERIODE);

	    Emprunt emprunt = new Emprunt();

	    try {
	        validationRef( reference );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_REF, e.getMessage() );
	    }
	    emprunt.setReference( reference);

	    try {
	    	validationDate( date );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_DATE, e.getMessage() );
	    }
	    emprunt.setDate( date );
	    
	    try {
	    	validationPeriode( periode );
	    } catch ( Exception e ) {
	        setErreur( CHAMP_PERIODE, e.getMessage() );
	    }
	    emprunt.setPeriode( periode );
	    
	    
	    if ( erreurs.isEmpty() ) {
	        resultat = "Succès de la creation d'emprunt.";
	    } else {
	        resultat = "Échec de la creation d'emprunt.";
	    }

	    return emprunt;
	}
	
	private void validationRef(String reference) throws Exception {
		if ( reference == null ) {
	        throw new Exception( "Merci de saisir une Reference." );
	    }
	}
	
	private void validationDate( String date ) throws Exception {
	    if ( date == null) {
	        throw new Exception( "Merci de saisir une Date." );
	    }
	}
	
	private void validationPeriode( String periode ) throws Exception {
	    if(periode!= null) {
	    	if( !(periode.equals("7") || periode.equals("15"))) {
		        throw new Exception( "Merci de saisir une période égale à 7 ou à 15" );
		    }
	    }else
	    {
	    	throw new Exception("Merci de Saisir une période");
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
