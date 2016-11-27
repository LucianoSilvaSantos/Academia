package br.com.Academia.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.Academia.Controller.FabricaConexao;

public abstract class DAOGenerico<T> {
	
private EntityManager em;
	
	private Class classe;
	
	public DAOGenerico(Class classe){
		em = FabricaConexao.obterConexao();
		this.classe = classe;
	}
	
	public void inserir(Object obj){
		em.getTransaction().begin(); //abrindo conexao
		em.persist(obj); //persistindo a informacao no banco
		em.getTransaction().commit(); //comitando a persistencia no banco
		em.close(); //fechando a conexao
	}
	public void atualizar(Object obj){
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
		em.close();
	}
	public void excluir(Object obj, Long i){
		em.getTransaction().begin();
		obj = em.find(obj.getClass(), i);
		em.remove(obj);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<T> listar(){
		Query query = em.createQuery("FROM " + classe.getName());
		return query.getResultList();
	}

}
