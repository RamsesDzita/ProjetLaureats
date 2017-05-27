package tabLaureat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;

import org.primefaces.event.RowEditEvent;

import login.Connexion;
import model.HibernateUtil;


@ManagedBean(name="serviceLaureat")
public class ServiceLaureat {

	/*private String texte ;
	
	FacesContext ctx = FacesContext.getCurrentInstance();
	Connexion connexion = (Connexion) ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(), "#{connexion}", Connexion.class).getValue(ctx.getELContext());
	public ServiceLaureat() {
		super();
		
		texte = connexion.getResponsabilite() ;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}*/
	private List<Laureat> laureats ;
	private Laureat selectedLaureat ;
	private List<Laureat> filteredLaureats;

	
	FacesContext ctx = FacesContext.getCurrentInstance();
	Connexion connexion = (Connexion) ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(), "#{connexion}", Connexion.class).getValue(ctx.getELContext());
	
	public ServiceLaureat() throws Exception {
		super();	
		laureats = createLaureat() ;
	}
	
	public List<Laureat> getLaureats() {
		return laureats;
	}
	public void setLaureats(List<Laureat> laureats) {
		this.laureats = laureats;
	}
	public Laureat getSelectedLaureat() {
		return selectedLaureat;
	}
	public void setSelectedLaureat(Laureat selectedLaureat) {
		this.selectedLaureat = selectedLaureat;
	}
	public List<Laureat> getFilteredLaureats() {
		return filteredLaureats;
	}
	public void setFilteredLaureats(List<Laureat> filteredLaureats) {
		this.filteredLaureats = filteredLaureats;
	}
	
	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Car Edited", ((Laureat) event.getObject()).getNom());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((Laureat) event.getObject()).getNom());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
public List<Laureat> createLaureat() throws Exception{
		
			laureats = new ArrayList<Laureat>();
			Session session  = HibernateUtil.currentSession();
			List list = session.find("from Laureat");
			Iterator it = list.iterator();
	
			while(it.hasNext()){
				model.Laureat modelLaureat = (model.Laureat)it.next();
		
				laureats.add(new Laureat(modelLaureat.getIdPersonne().getNom(),modelLaureat.getIdPersonne().getPrenom(),modelLaureat.getMatricule(),modelLaureat.getIdPersonne().getEmail(),modelLaureat.getOptionChoisie(),modelLaureat.getFaculte(),modelLaureat.getIdPersonne().getTelephone()));
			}
		return laureats ; 
		
	}
}
