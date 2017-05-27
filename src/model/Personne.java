package model;

import model.base.BasePersonne;

/**
 * This is the object class that relates to the personne table.
 * Any customizations belong here.
 */
public class Personne extends BasePersonne {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Personne () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Personne (java.lang.Integer _idPersonne) {
		super(_idPersonne);
	}

	/**
	 * Constructor for required fields
	 */
	public Personne (
		java.lang.Integer _idPersonne,
		java.lang.String _motDePasse,
		java.lang.String _profil,
		java.lang.String _telephone,
		java.lang.String _login,
		java.lang.String _nom,
		java.lang.String _prenom,
		java.lang.String _email) {

		super (
			_idPersonne,
			_motDePasse,
			_profil,
			_telephone,
			_login,
			_nom,
			_prenom,
			_email);
	}

/*[CONSTRUCTOR MARKER END]*/
}