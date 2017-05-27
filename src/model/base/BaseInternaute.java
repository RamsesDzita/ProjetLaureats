package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the internaute table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="internaute"
 */
public abstract class BaseInternaute  implements Serializable {

	public static String PROP_ID_PERSONNE = "IdPersonne";
	public static String PROP_ID_INTERNAUTE = "IdInternaute";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _idInternaute;

	// many to one
	private model.Personne _idPersonne;

	// collections
	private java.util.Set _posterSet;


	// constructors
	public BaseInternaute () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInternaute (java.lang.Integer _idInternaute) {
		this.setIdInternaute(_idInternaute);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseInternaute (
		java.lang.Integer _idInternaute,
		model.Personne _idPersonne) {

		this.setIdInternaute(_idInternaute);
		this.setIdPersonne(_idPersonne);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="native"
     *  column="idInternaute"
     */
	public java.lang.Integer getIdInternaute () {
		return _idInternaute;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idInternaute the new ID
	 */
	public void setIdInternaute (java.lang.Integer _idInternaute) {
		this._idInternaute = _idInternaute;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
     * @hibernate.property
     *  column=idPersonne
	 * not-null=true
	 */
	public model.Personne getIdPersonne () {
		return this._idPersonne;
	}

	/**
	 * Set the value related to the column: idPersonne
	 * @param _idPersonne the idPersonne value
	 */
	public void setIdPersonne (model.Personne _idPersonne) {
		this._idPersonne = _idPersonne;
	}


	/**
	 * Return the value associated with the column: PosterSet
	 */
	public java.util.Set getPosterSet () {
		return this._posterSet;
	}

	/**
	 * Set the value related to the column: PosterSet
	 * @param _posterSet the PosterSet value
	 */
	public void setPosterSet (java.util.Set _posterSet) {
		this._posterSet = _posterSet;
	}
	
	public void addToPosterSet (Object obj) {
		if (null == this._posterSet) this._posterSet = new java.util.HashSet();
		this._posterSet.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.base.BaseInternaute)) return false;
		else {
			model.base.BaseInternaute mObj = (model.base.BaseInternaute) obj;
			if (null == this.getIdInternaute() || null == mObj.getIdInternaute()) return false;
			else return (this.getIdInternaute().equals(mObj.getIdInternaute()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdInternaute()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdInternaute().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}