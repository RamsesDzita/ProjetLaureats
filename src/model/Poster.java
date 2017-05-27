package model;

import model.base.BasePoster;

/**
 * This is the object class that relates to the poster table.
 * Any customizations belong here.
 */
public class Poster extends BasePoster {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Poster () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Poster (model.PosterPK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Poster (
		model.PosterPK _id,
		java.util.Date _heureposte,
		java.util.Date _dateposte) {

		super (
			_id,
			_heureposte,
			_dateposte);
	}

/*[CONSTRUCTOR MARKER END]*/
}