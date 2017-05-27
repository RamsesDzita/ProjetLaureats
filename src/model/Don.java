package model;

import model.base.BaseDon;

/**
 * This is the object class that relates to the don table.
 * Any customizations belong here.
 */
public class Don extends BaseDon {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Don () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Don (java.lang.Integer _idDon) {
		super(_idDon);
	}

	/**
	 * Constructor for required fields
	 */
	public Don (
		java.lang.Integer _idDon,
		model.Evenementlaureat _idEvenementLaureat,
		java.lang.String _image,
		java.lang.String _typeDon,
		java.lang.Integer _quantite) {

		super (
			_idDon,
			_idEvenementLaureat,
			_image,
			_typeDon,
			_quantite);
	}

/*[CONSTRUCTOR MARKER END]*/
}