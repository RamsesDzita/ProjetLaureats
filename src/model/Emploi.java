package model;

import model.base.BaseEmploi;

/**
 * This is the object class that relates to the emploi table.
 * Any customizations belong here.
 */
public class Emploi extends BaseEmploi {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Emploi () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Emploi (java.lang.Integer _idEmploi) {
		super(_idEmploi);
	}

	/**
	 * Constructor for required fields
	 */
	public Emploi (
		java.lang.Integer _idEmploi,
		model.Evenementlaureat _idEvenementLaureat,
		java.lang.String _image,
		java.lang.String _descriptionEmploi,
		java.lang.String _domaineEmploi) {

		super (
			_idEmploi,
			_idEvenementLaureat,
			_image,
			_descriptionEmploi,
			_domaineEmploi);
	}

/*[CONSTRUCTOR MARKER END]*/
}