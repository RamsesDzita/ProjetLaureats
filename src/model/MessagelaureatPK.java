package model;

import model.base.BaseMessagelaureatPK;

public class MessagelaureatPK extends BaseMessagelaureatPK {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public MessagelaureatPK () {}
	
	public MessagelaureatPK (
		model.Laureat _laureatrecepteur,
		model.Laureat _laureatemetteur) {

		super (
		_laureatrecepteur,
		_laureatemetteur);
	}
/*[CONSTRUCTOR MARKER END]*/
}