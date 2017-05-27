package model;

import model.base.BaseAmitiePK;

public class AmitiePK extends BaseAmitiePK {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public AmitiePK () {}
	
	public AmitiePK (
		model.Laureat _amitierecepteur,
		model.Laureat _amitieemetteur) {

		super (
		_amitierecepteur,
		_amitieemetteur);
	}
/*[CONSTRUCTOR MARKER END]*/
}