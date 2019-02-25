package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * T_EMPRESA
 * 		cd_empresa(NUMBER) (PK) (Sequence SQ_T_EMPRESA)
 * 		*nm_fantasia (VARCHAR(50))
 * 		dt_abertura (DATE)
 * 		ds_status (VARCHAR)(Enum)
 * 		*nr_cnpj (VARCHAR(18))
 * 
 * */

@Entity
@Table(name="T_EMPRESA")
@SequenceGenerator(name="empresa", sequenceName="SQ_T_EMPRESA", allocationSize = 1)
public class Empresa {
	
	@Id
	@Column(name="cd_empresa")
	@GeneratedValue(generator="empresa", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_fantasia", nullable = false, length=50)
	private String nome;
	
	@Column(name="dt_abertura", updatable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dt_abertura;
	
	@Column(name="ds_status")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(name="nr_cnpj", nullable = false, length=18)
	private String cnpj;
	
	

	public Empresa(String nome, Calendar dt_abertura, Status status, String cnpj) {
		super();
		this.nome = nome;
		this.dt_abertura = dt_abertura;
		this.status = status;
		this.cnpj = cnpj;
	}
	
	

	public Empresa(int codigo, String nome, Calendar dt_abertura, Status status, String cnpj) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dt_abertura = dt_abertura;
		this.status = status;
		this.cnpj = cnpj;
	}



	public Empresa() {
		super();
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDt_abertura() {
		return dt_abertura;
	}

	public void setDt_abertura(Calendar dt_abertura) {
		this.dt_abertura = dt_abertura;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
