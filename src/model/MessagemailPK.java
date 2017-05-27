package model;

import model.base.BaseMessagemailPK;

public class MessagemailPK extends BaseMessagemailPK {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public MessagemailPK () {}
	
	public MessagemailPK (
		model.Responsable _idResponsable,
		model.Laureat _idLaureat) {

		super (
		_idResponsable,
		_idLaureat);
	}
/*[CONSTRUCTOR MARKER END]*/
}