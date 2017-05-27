package model;

import model.base.BaseProgrammeformation;

/**
 * This is the object class that relates to the programmeformation table.
 * Any customizations belong here.
 */
public class Programmeformation extends BaseProgrammeformation {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Programmeformation () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Programmeformation (java.lang.Integer _idProgrammeFormation) {
		super(_idProgrammeFormation);
	}

	/**
	 * Constructor for required fields
	 */
	public Programmeformation (
		java.lang.Integer _idProgrammeFormation,
		model.Evenementlaureat _idEvenementLaureat,
		java.lang.String _image,
		java.lang.String _suggestion,
		java.lang.String _justificatif) {

		super (
			_idProgrammeFormation,
			_idEvenementLaureat,
			_image,
			_suggestion,
			_justificatif);
	}

/*[CONSTRUCTOR MARKER END]*/
}