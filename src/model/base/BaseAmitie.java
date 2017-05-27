package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the amitie table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="amitie"
 */
public abstract class BaseAmitie  implements Serializable {

	public static String PROP_DATEAMITIE = "Dateamitie";
	public static String PROP_HEUREAMITIE = "Heureamitie";
	public static String PROP_ID = "Id";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private model.AmitiePK _id;

	// fields
	private java.util.Date _dateamitie;
	private java.util.Date _heureamitie;


	// constructors
	public BaseAmitie () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAmitie (model.AmitiePK _id) {
		this.setId(_id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseAmitie (
		model.AmitiePK _id,
		java.util.Date _dateamitie,
		java.util.Date _heureamitie) {

		this.setId(_id);
		this.setDateamitie(_dateamitie);
		this.setHeureamitie(_heureamitie);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     */
	public model.AmitiePK getId () {
		return _id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _id the new ID
	 */
	public void setId (model.AmitiePK _id) {
		this._id = _id;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: dateamitie
	 */
	public java.util.Date getDateamitie () {
		return _dateamitie;
	}

	/**
	 * Set the value related to the column: dateamitie
	 * @param _dateamitie the dateamitie value
	 */
	public void setDateamitie (java.util.Date _dateamitie) {
		this._dateamitie = _dateamitie;
	}


	/**
	 * Return the value associated with the column: Heureamitie
	 */
	public java.util.Date getHeureamitie () {
		return _heureamitie;
	}

	/**
	 * Set the value related to the column: Heureamitie
	 * @param _heureamitie the Heureamitie value
	 */
	public void setHeureamitie (java.util.Date _heureamitie) {
		this._heureamitie = _heureamitie;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.base.BaseAmitie)) return false;
		else {
			model.base.BaseAmitie mObj = (model.base.BaseAmitie) obj;
			if (null == this.getId() || null == mObj.getId()) return false;
			else return (this.getId().equals(mObj.getId()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}