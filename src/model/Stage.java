package model;

import model.base.BaseStage;

/**
 * This is the object class that relates to the stage table.
 * Any customizations belong here.
 */
public class Stage extends BaseStage {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Stage () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Stage (java.lang.Integer _idStage) {
		super(_idStage);
	}

	/**
	 * Constructor for required fields
	 */
	public Stage (
		java.lang.Integer _idStage,
		model.Evenementlaureat _idEvenementLaureat,
		java.lang.String _image,
		java.lang.String _descriptionStage,
		java.lang.String _domaineStage) {

		super (
			_idStage,
			_idEvenementLaureat,
			_image,
			_descriptionStage,
			_domaineStage);
	}

/*[CONSTRUCTOR MARKER END]*/
}