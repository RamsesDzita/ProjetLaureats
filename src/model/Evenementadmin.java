package model;

import model.base.BaseEvenementadmin;

/**
 * This is the object class that relates to the evenementadmin table.
 * Any customizations belong here.
 */
public class Evenementadmin extends BaseEvenementadmin {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Evenementadmin () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Evenementadmin (java.lang.Integer _idEvenementAdmin) {
		super(_idEvenementAdmin);
	}

	/**
	 * Constructor for required fields
	 */
	public Evenementadmin (
		java.lang.Integer _idEvenementAdmin,
		model.Responsable _idResponsable,
		java.lang.String _lieuEvenement,
		java.lang.String _domaine,
		java.lang.String _typeEvenement,
		java.util.Date _heureEvenement,
		java.util.Date _dateEvenement,
		java.lang.String _description) {

		super (
			_idEvenementAdmin,
			_idResponsable,
			_lieuEvenement,
			_domaine,
			_typeEvenement,
			_heureEvenement,
			_dateEvenement,
			_description);
	}

/*[CONSTRUCTOR MARKER END]*/
}