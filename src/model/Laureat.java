package model;

import model.base.BaseLaureat;

/**
 * This is the object class that relates to the laureat table.
 * Any customizations belong here.
 */
public class Laureat extends BaseLaureat {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Laureat () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Laureat (java.lang.Integer _idLaureat) {
		super(_idLaureat);
	}

	/**
	 * Constructor for required fields
	 */
	public Laureat (
		java.lang.Integer _idLaureat,
		model.Personne _idPersonne,
		java.lang.String _matricule,
		java.lang.String _diplomePrepare,
		java.lang.String _parcours,
		java.lang.String _optionChoisie,
		java.lang.String _conseillerFormation,
		java.lang.String _objectifAvantForm,
		java.lang.String _objectifAtteint,
		java.lang.String _situationProAvant,
		java.lang.String _faculte,
		java.lang.String _typeFormation,
		java.lang.String _interet) {

		super (
			_idLaureat,
			_idPersonne,
			_matricule,
			_diplomePrepare,
			_parcours,
			_optionChoisie,
			_conseillerFormation,
			_objectifAvantForm,
			_objectifAtteint,
			_situationProAvant,
			_faculte,
			_typeFormation,
			_interet);
	}

/*[CONSTRUCTOR MARKER END]*/
}