package login;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import org.primefaces.event.SelectEvent;
@ManagedBean(name="connexion")
public class Connexion {
	
	private String motDePasse ;
	
	private String responsabilite ;
	private  List<SelectItem> responsabilites;
	
	private String resp ;
	private  List<String> reps;

	public Connexion() {
		super();
		
		SelectItemGroup g1 = new SelectItemGroup("FACULTES");
		g1.setSelectItems(new SelectItem[]{new SelectItem("fs", "fs"),new SelectItem("falsh", "falsh"),new SelectItem("fseg", "fseg"),new SelectItem("fse", "fse")});
		
		SelectItemGroup g2 = new SelectItemGroup("FILIERES");
		g2.setSelectItems(new SelectItem[]{new SelectItem("informatique", "informatique"),new SelectItem("physique", "physique"),new SelectItem("mathematique", "mathematique"),new SelectItem("chimie", "chimie")});
	
		SelectItemGroup g3 = new SelectItemGroup("ECOLES");
		g3.setSelectItems(new SelectItem[]{new SelectItem("ens", "ens"),new SelectItem("ensp", "ensp"),new SelectItem("enspt", "enspt"),new SelectItem("iut", "iut")});

		responsabilites = new ArrayList<SelectItem>();
		responsabilites.add(g1);
		responsabilites.add(g2);
		responsabilites.add(g3);
		
		reps = new ArrayList<String>();
		reps.add("recteur");
		reps.add("Doyen");
		reps.add("Chef de departement");
		reps.add("Directeur");
		
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public String getResponsabilite() {
		return responsabilite;
	}

	public void setResponsabilite(String responsabilite) {
		this.responsabilite = responsabilite;
	}

	public List<SelectItem> getResponsabilites() {
		return responsabilites;
	}

	public void setResponsabilites(List<SelectItem> responsabilites) {
		this.responsabilites = responsabilites;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public List<String> getReps() {
		return reps;
	}

	public void setReps(List<String> reps) {
		this.reps = reps;
	}
	
	public List<String> methodeList(String text){
		return reps;
	}
	
	public String  mamethod(){
		
		String redirect="";
		
		if(this.getResp().equals("Doyen")){
			System.out.println("connexion reussie"+this.getResp()+" ****** ");
			redirect = "responsable";
		}else {
			redirect = "";
			System.out.println("erreur");
		}
		
		return redirect;
	}
	
	/**if(this.getResp() == "" || this.getResponsabilite()== "" || this.getMotDePasse()== ""){
	FacesContext context = FacesContext.getCurrentInstance();
	context.addMessage("message", new FacesMessage(FacesMessage.SEVERITY_WARN,"Warning!", "Champs requis"));
	}else{
	System.out.println("*RESPONSABLE :**///n"+this.getResp()+"*RESPONSABILITE :**"+this.getResponsabilite()+"*MOT DE PASSE :**"+this.getMotDePasse());
	//}
	
}
