package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the evenementadmin table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="evenementadmin"
 */
public abstract class BaseEvenementadmin  implements Serializable {

	public static String PROP_HEURE_EVENEMENT = "HeureEvenement";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_TYPE_EVENEMENT = "TypeEvenement";
	public static String PROP_DATE_EVENEMENT = "DateEvenement";
	public static String PROP_ID_EVENEMENT_ADMIN = "IdEvenementAdmin";
	public static String PROP_LIEU_EVENEMENT = "LieuEvenement";
	public static String PROP_ID_RESPONSABLE = "IdResponsable";
	public static String PROP_DOMAINE = "Domaine";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer _idEvenementAdmin;

	// fields
	private java.lang.String _lieuEvenement;
	private java.lang.String _domaine;
	private java.lang.String _typeEvenement;
	private java.util.Date _heureEvenement;
	private java.util.Date _dateEvenement;
	private java.lang.String _description;

	// many to one
	private model.Responsable _idResponsable;


	// constructors
	public BaseEvenementadmin () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseEvenementadmin (java.lang.Integer _idEvenementAdmin) {
		this.setIdEvenementAdmin(_idEvenementAdmin);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseEvenementadmin (
		java.lang.Integer _idEvenementAdmin,
		model.Responsable _idResponsable,
		java.lang.String _lieuEvenement,
		java.lang.String _domaine,
		java.lang.String _typeEvenement,
		java.util.Date _heureEvenement,
		java.util.Date _dateEvenement,
		java.lang.String _description) {

		this.setIdEvenementAdmin(_idEvenementAdmin);
		this.setIdResponsable(_idResponsable);
		this.setLieuEvenement(_lieuEvenement);
		this.setDomaine(_domaine);
		this.setTypeEvenement(_typeEvenement);
		this.setHeureEvenement(_heureEvenement);
		this.setDateEvenement(_dateEvenement);
		this.setDescription(_description);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="native"
     *  column="idEvenementAdmin"
     */
	public java.lang.Integer getIdEvenementAdmin () {
		return _idEvenementAdmin;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idEvenementAdmin the new ID
	 */
	public void setIdEvenementAdmin (java.lang.Integer _idEvenementAdmin) {
		this._idEvenementAdmin = _idEvenementAdmin;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: lieuEvenement
	 */
	public java.lang.String getLieuEvenement () {
		return _lieuEvenement;
	}

	/**
	 * Set the value related to the column: lieuEvenement
	 * @param _lieuEvenement the lieuEvenement value
	 */
	public void setLieuEvenement (java.lang.String _lieuEvenement) {
		this._lieuEvenement = _lieuEvenement;
	}


	/**
	 * Return the value associated with the column: domaine
	 */
	public java.lang.String getDomaine () {
		return _domaine;
	}

	/**
	 * Set the value related to the column: domaine
	 * @param _domaine the domaine value
	 */
	public void setDomaine (java.lang.String _domaine) {
		this._domaine = _domaine;
	}


	/**
	 * Return the value associated with the column: typeEvenement
	 */
	public java.lang.String getTypeEvenement () {
		return _typeEvenement;
	}

	/**
	 * Set the value related to the column: typeEvenement
	 * @param _typeEvenement the typeEvenement value
	 */
	public void setTypeEvenement (java.lang.String _typeEvenement) {
		this._typeEvenement = _typeEvenement;
	}


	/**
	 * Return the value associated with the column: heureEvenement
	 */
	public java.util.Date getHeureEvenement () {
		return _heureEvenement;
	}

	/**
	 * Set the value related to the column: heureEvenement
	 * @param _heureEvenement the heureEvenement value
	 */
	public void setHeureEvenement (java.util.Date _heureEvenement) {
		this._heureEvenement = _heureEvenement;
	}


	/**
	 * Return the value associated with the column: dateEvenement
	 */
	public java.util.Date getDateEvenement () {
		return _dateEvenement;
	}

	/**
	 * Set the value related to the column: dateEvenement
	 * @param _dateEvenement the dateEvenement value
	 */
	public void setDateEvenement (java.util.Date _dateEvenement) {
		this._dateEvenement = _dateEvenement;
	}


	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return _description;
	}

	/**
	 * Set the value related to the column: description
	 * @param _description the description value
	 */
	public void setDescription (java.lang.String _description) {
		this._description = _description;
	}


	/**
     * @hibernate.property
     *  column=idResponsable
	 * not-null=true
	 */
	public model.Responsable getIdResponsable () {
		return this._idResponsable;
	}

	/**
	 * Set the value related to the column: idResponsable
	 * @param _idResponsable the idResponsable value
	 */
	public void setIdResponsable (model.Responsable _idResponsable) {
		this._idResponsable = _idResponsable;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.base.BaseEvenementadmin)) return false;
		else {
			model.base.BaseEvenementadmin mObj = (model.base.BaseEvenementadmin) obj;
			if (null == this.getIdEvenementAdmin() || null == mObj.getIdEvenementAdmin()) return false;
			else return (this.getIdEvenementAdmin().equals(mObj.getIdEvenementAdmin()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdEvenementAdmin()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdEvenementAdmin().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}