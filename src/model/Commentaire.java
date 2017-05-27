package model;

import model.base.BaseCommentaire;

/**
 * This is the object class that relates to the commentaire table.
 * Any customizations belong here.
 */
public class Commentaire extends BaseCommentaire {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Commentaire () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Commentaire (java.lang.Integer _idCommentaire) {
		super(_idCommentaire);
	}

	/**
	 * Constructor for required fields
	 */
	public Commentaire (
		java.lang.Integer _idCommentaire,
		model.Laureat _idLaureat,
		java.util.Date _date,
		java.util.Date _heure,
		java.lang.Integer _idProgrammeFormation,
		java.lang.String _texte) {

		super (
			_idCommentaire,
			_idLaureat,
			_date,
			_heure,
			_idProgrammeFormation,
			_texte);
	}

/*[CONSTRUCTOR MARKER END]*/
}