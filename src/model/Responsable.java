package model;

import model.base.BaseResponsable;

/**
 * This is the object class that relates to the responsable table.
 * Any customizations belong here.
 */
public class Responsable extends BaseResponsable {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Responsable () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Responsable (java.lang.Integer _idResponsable) {
		super(_idResponsable);
	}

	/**
	 * Constructor for required fields
	 */
	public Responsable (
		java.lang.Integer _idResponsable,
		model.Personne _idPersonne,
		java.lang.String _typeResponsabilite,
		java.lang.String _structure) {

		super (
			_idResponsable,
			_idPersonne,
			_typeResponsabilite,
			_structure);
	}

/*[CONSTRUCTOR MARKER END]*/
}