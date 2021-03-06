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
@Table(name="manterendereco")
public class ManterEndereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="idprofessor")
	private ManterProfessor idprofessor;
	
	@ManyToOne
	@JoinColumn(name="idfuncionario")
	private ManterUsuario idfuncionario;
	
	@ManyToOne
	@JoinColumn(name="idaluno")
	private ManterAluno idaluno;
	
	@Column(name="rua")
	private String rua;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="complemento")
	private String complemento;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cep")
	private String cep;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="celular")
	private String celular;
	
	@Column(name="email")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ManterProfessor getIdprofessor() {
		return idprofessor;
	}

	public void setIdprofessor(ManterProfessor idprofessor) {
		this.idprofessor = idprofessor;
	}

	public ManterUsuario getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(ManterUsuario idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	public ManterAluno getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(ManterAluno idaluno) {
		this.idaluno = idaluno;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
