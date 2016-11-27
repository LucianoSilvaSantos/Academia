package br.com.Academia.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="informacoes")
public class Informacoes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToMany
	@JoinColumn(name = "id")
	private ManterModalidade idmodalidade;
	
	@ManyToMany
	@JoinColumn(name = "id")
	private ManterTurma idturma;
	
	@ManyToMany
	@JoinColumn(name = "id")
	private ManterAluno idaluno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ManterModalidade getIdmodalidade() {
		return idmodalidade;
	}

	public void setIdmodalidade(ManterModalidade idmodalidade) {
		this.idmodalidade = idmodalidade;
	}

	public ManterTurma getIdturma() {
		return idturma;
	}

	public void setIdturma(ManterTurma idturma) {
		this.idturma = idturma;
	}

	public ManterAluno getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(ManterAluno idaluno) {
		this.idaluno = idaluno;
	}
	
}
