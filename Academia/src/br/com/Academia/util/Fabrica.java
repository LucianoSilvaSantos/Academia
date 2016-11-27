package br.com.Academia.util;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.Academia.DAO.InformacoesDAO;
import br.com.Academia.bean.Informacoes;

@ApplicationScoped
@ManagedBean(eager = true)
public class Fabrica {
	
	private List<Informacoes> informacoes = popularInformacoes();
	
	private List<Informacoes> popularInformacoes(){
		InformacoesDAO iDAO = new InformacoesDAO();
		return iDAO.listar();
	}

}
