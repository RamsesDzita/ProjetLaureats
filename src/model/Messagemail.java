package model;

import model.base.BaseMessagemail;

/**
 * This is the object class that relates to the messagemail table.
 * Any customizations belong here.
 */
public class Messagemail extends BaseMessagemail {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Messagemail () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Messagemail (model.MessagemailPK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Messagemail (
		model.MessagemailPK _id,
		java.util.Date _heureenvoie,
		java.util.Date _dateenvoie,
		java.lang.String _texte) {

		super (
			_id,
			_heureenvoie,
			_dateenvoie,
			_texte);
	}

/*[CONSTRUCTOR MARKER END]*/
}