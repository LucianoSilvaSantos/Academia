package br.com.Academia.bean;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="manterturma")
public class ManterTurma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idmodalidade")
	private ManterModalidade idmodalidade;
	
	@ManyToOne
	@JoinColumn(name="idprofessor")
	private ManterProfessor idprofessor;
	
	@ManyToOne
	@JoinColumn(name="idaluno")
	private Informacoes idaluno;
	
	@Column(name="turma")
	private String turma;
	
	@Column(name="diasemana")
	private String diasemana;
	
	@Column(name="horainicial")
	private Time horainicial;
	
	@Column(name="horafinal")
	private Time horafinal;
	
	@ManyToOne
	@JoinColumn(name="modalidade")
	private ManterModalidade modalidade;
	
	@Column(name="periodo")
	private String periodo;

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

	public ManterProfessor getIdprofessor() {
		return idprofessor;
	}

	public void setIdprofessor(ManterProfessor idprofessor) {
		this.idprofessor = idprofessor;
	}

	public Informacoes getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(Informacoes idaluno) {
		this.idaluno = idaluno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getDiasemana() {
		return diasemana;
	}

	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
	}

	public Time getHorainicial() {
		return horainicial;
	}

	public void setHorainicial(Time horainicial) {
		this.horainicial = horainicial;
	}

	public Time getHorafinal() {
		return horafinal;
	}

	public void setHorafinal(Time horafinal) {
		this.horafinal = horafinal;
	}

	public ManterModalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(ManterModalidade modalidade) {
		this.modalidade = modalidade;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	

}
