package br.com.Academia.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="manterfichaaluno")
public class ManterFichaAluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idaluno")
	private Informacoes idaluno;
	
	@ManyToOne
	@JoinColumn(name="idturma")
	private Informacoes idturma;
	
	@ManyToOne
	@JoinColumn(name="idprofessor")
	private ManterProfessor idprofessor;
	
	@ManyToOne
	@JoinColumn(name="idmodalidade")
	private Informacoes idmodalidade;
	
	@Column(name="graduacoes")
	private String graduacoes;
	
	@Column(name="modalidade")
	private String modalidade;
	
	@Column(name="turma")
	private String turma;
	
	@Column(name="periodo")
	private String periodo;
	
	@JoinColumn(name="nomeprofessor")
	private String nomeprofessor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Informacoes getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(Informacoes idaluno) {
		this.idaluno = idaluno;
	}

	public Informacoes getIdturma() {
		return idturma;
	}

	public void setIdturma(Informacoes idturma) {
		this.idturma = idturma;
	}

	public ManterProfessor getIdprofessor() {
		return idprofessor;
	}

	public void setIdprofessor(ManterProfessor idprofessor) {
		this.idprofessor = idprofessor;
	}

	public Informacoes getIdmodalidade() {
		return idmodalidade;
	}

	public void setIdmodalidade(Informacoes idmodalidade) {
		this.idmodalidade = idmodalidade;
	}

	public String getGraduacoes() {
		return graduacoes;
	}

	public void setGraduacoes(String graduacoes) {
		this.graduacoes = graduacoes;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNomeprofessor() {
		return nomeprofessor;
	}

	public void setNomeprofessor(String nomeprofessor) {
		this.nomeprofessor = nomeprofessor;
	}
	
	

}
