package model;

import model.base.BaseInternaute;

/**
 * This is the object class that relates to the internaute table.
 * Any customizations belong here.
 */
public class Internaute extends BaseInternaute {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Internaute () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Internaute (java.lang.Integer _idInternaute) {
		super(_idInternaute);
	}

	/**
	 * Constructor for required fields
	 */
	public Internaute (
		java.lang.Integer _idInternaute,
		model.Personne _idPersonne) {

		super (
			_idInternaute,
			_idPersonne);
	}

/*[CONSTRUCTOR MARKER END]*/
}