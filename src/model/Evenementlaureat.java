package model;

import model.base.BaseEvenementlaureat;

/**
 * This is the object class that relates to the evenementlaureat table.
 * Any customizations belong here.
 */
public class Evenementlaureat extends BaseEvenementlaureat {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Evenementlaureat () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Evenementlaureat (java.lang.Integer _idEvenementLaureat) {
		super(_idEvenementLaureat);
	}

	/**
	 * Constructor for required fields
	 */
	public Evenementlaureat (
		java.lang.Integer _idEvenementLaureat,
		model.Laureat _idLaureat,
		java.lang.String _nomEvenement,
		java.util.Date _heurePublication,
		java.util.Date _datePublication,
		java.lang.String _description) {

		super (
			_idEvenementLaureat,
			_idLaureat,
			_nomEvenement,
			_heurePublication,
			_datePublication,
			_description);
	}

/*[CONSTRUCTOR MARKER END]*/
}