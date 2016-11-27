package br.com.Academia.Controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.Academia.DAO.ManterAlunoDAO;
import br.com.Academia.bean.Informacoes;
import br.com.Academia.bean.ManterAluno;

@ManagedBean(name="ManterAlunoMB")
@ViewScoped
public class ManterAlunoMB {
	
private ManterAluno manteraluno = new ManterAluno();
	
	private List<ManterAluno> listaManterAluno;
	
	public String incluir() {
		ManterAlunoDAO maDAO = new ManterAlunoDAO();
		System.out.println(manteraluno.getId());
		maDAO.inserir(manteraluno);
		listaManterAluno = null;
		
		//Componente de mensagens do JSF:
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Registro efetuado com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
		
		return "index.xhtml";
	}

	public ManterAluno getmanteraluno() {
		return manteraluno;
	}

	public void setManterAluno(ManterAluno manteraluno) {
		this.manteraluno = manteraluno;
	}

	public List<ManterAluno> getlistaManterAluno() {
		if (listaManterAluno == null) {
			ManterAlunoDAO maDAO = new ManterAlunoDAO();
			listaManterAluno = maDAO.listar();
		}
		return listaManterAluno;
	}
	
	public void excluir(Informacoes informacoes) {
		ManterAlunoDAO maDAO = new ManterAlunoDAO();
		maDAO.excluir(informacoes, informacoes.getId());
		
		listaManterAluno = null;
		
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Registro excluído com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void setlistaManterAluno(List<ManterAluno> listaManterAluno) {
		this.listaManterAluno = listaManterAluno;
	}

}
