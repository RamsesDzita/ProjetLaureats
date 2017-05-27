package model;

import model.base.BaseAmitie;

/**
 * This is the object class that relates to the amitie table.
 * Any customizations belong here.
 */
public class Amitie extends BaseAmitie {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Amitie () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Amitie (model.AmitiePK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Amitie (
		model.AmitiePK _id,
		java.util.Date _dateamitie,
		java.util.Date _heureamitie) {

		super (
			_id,
			_dateamitie,
			_heureamitie);
	}

/*[CONSTRUCTOR MARKER END]*/
}