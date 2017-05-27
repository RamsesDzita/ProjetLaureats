package model;

import model.base.BasePosterPK;

public class PosterPK extends BasePosterPK {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public PosterPK () {}
	
	public PosterPK (
		model.Emploi _idEmploi,
		model.Internaute _idInternaute) {

		super (
		_idEmploi,
		_idInternaute);
	}
/*[CONSTRUCTOR MARKER END]*/
}