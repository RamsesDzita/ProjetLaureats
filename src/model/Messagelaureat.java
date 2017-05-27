package model;

import model.base.BaseMessagelaureat;

/**
 * This is the object class that relates to the messagelaureat table.
 * Any customizations belong here.
 */
public class Messagelaureat extends BaseMessagelaureat {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Messagelaureat () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Messagelaureat (model.MessagelaureatPK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Messagelaureat (
		model.MessagelaureatPK _id,
		java.util.Date _dateenvoi,
		java.util.Date _heureenvoie,
		java.lang.String _message) {

		super (
			_id,
			_dateenvoi,
			_heureenvoie,
			_message);
	}

/*[CONSTRUCTOR MARKER END]*/
}