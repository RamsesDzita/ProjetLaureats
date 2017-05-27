package model.base;

import net.sf.hibernate.Hibernate;
import net.sf.hibernate.Session;
import model.dao.ProgrammeformationDAO;

/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseProgrammeformationDAO extends model.dao._RootDAO {

	public static ProgrammeformationDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static ProgrammeformationDAO getInstance () {
		if (null == instance) instance = new ProgrammeformationDAO();
		return instance;
	}

	/**
	 * model.dao._RootDAO _RootDAO.getReferenceClass()
	 */
	public Class getReferenceClass () {
		return model.Programmeformation.class;
	}
	
	public model.Programmeformation load(java.lang.Integer key)
		throws net.sf.hibernate.HibernateException {
		return (model.Programmeformation) load(getReferenceClass(), key);
	}

	public model.Programmeformation load(java.lang.Integer key, Session s)
		throws net.sf.hibernate.HibernateException {
		return (model.Programmeformation) load(getReferenceClass(), key, s);
	}

	public model.Programmeformation loadInitialize(java.lang.Integer key, Session s) 
			throws net.sf.hibernate.HibernateException { 
		model.Programmeformation obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param programmeformation a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(model.Programmeformation programmeformation)
		throws net.sf.hibernate.HibernateException {
		return (java.lang.Integer) super.save(programmeformation);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param programmeformation a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(model.Programmeformation programmeformation, Session s)
		throws net.sf.hibernate.HibernateException {
		return (java.lang.Integer) super.save(programmeformation, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param programmeformation a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(model.Programmeformation programmeformation)
		throws net.sf.hibernate.HibernateException {
		super.saveOrUpdate(programmeformation);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param programmeformation a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(model.Programmeformation programmeformation, Session s)
		throws net.sf.hibernate.HibernateException {
		super.saveOrUpdate(programmeformation, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param programmeformation a transient instance containing updated state
	 */
	public void update(model.Programmeformation programmeformation) 
		throws net.sf.hibernate.HibernateException {
		super.update(programmeformation);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param programmeformation a transient instance containing updated state
	 * @param the Session
	 */
	public void update(model.Programmeformation programmeformation, Session s)
		throws net.sf.hibernate.HibernateException {
		super.update(programmeformation, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Integer id)
		throws net.sf.hibernate.HibernateException {
		super.delete(load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(java.lang.Integer id, Session s)
		throws net.sf.hibernate.HibernateException {
		super.delete(load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param programmeformation the instance to be removed
	 */
	public void delete(model.Programmeformation programmeformation)
		throws net.sf.hibernate.HibernateException {
		super.delete(programmeformation);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param programmeformation the instance to be removed
	 * @param s the Session
	 */
	public void delete(model.Programmeformation programmeformation, Session s)
		throws net.sf.hibernate.HibernateException {
		super.delete(programmeformation, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (model.Programmeformation programmeformation, Session s)
		throws net.sf.hibernate.HibernateException {
		super.refresh(programmeformation, s);
	}

    public String getDefaultOrderProperty () {
		return null;
    }

}