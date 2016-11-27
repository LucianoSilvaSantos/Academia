package br.com.Academia.Controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.Academia.DAO.InformacoesDAO;
import br.com.Academia.bean.Informacoes;

@ManagedBean(name="InformacoesMB")
@ViewScoped
public class InformacoesMB {
	
	private Informacoes informacoes = new Informacoes();
	
	private List<Informacoes> listaInformacoes;
	
	public String incluir() {
		InformacoesDAO iDAO = new InformacoesDAO();
		System.out.println(informacoes.getId());
		iDAO.inserir(informacoes);
		listaInformacoes = null;
		
		//Componente de mensagens do JSF:
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Registro efetuado com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
		
		return "index.xhtml";
	}

	public Informacoes getinformacoes() {
		return informacoes;
	}

	public void setInformacoes(Informacoes informacoes) {
		this.informacoes = informacoes;
	}

	public List<Informacoes> getListainformacoes() {
		if (listaInformacoes == null) {
			InformacoesDAO iDAO = new InformacoesDAO();
			listaInformacoes = iDAO.listar();
		}
		return listaInformacoes;
	}
	
	public void excluir(Informacoes informacoes) {
		InformacoesDAO iDAO = new InformacoesDAO();
		iDAO.excluir(informacoes, informacoes.getId());
		
		listaInformacoes = null;
		
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Registro excluído com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void setListainformacoes(List<Informacoes> listainformacoes) {
		this.listaInformacoes = listainformacoes;
	}

}
