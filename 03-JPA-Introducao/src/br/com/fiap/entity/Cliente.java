package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName ="SQ_T_CLIENTE", allocationSize = 1)
public class Cliente {
	
	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(generator="cliente", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_cliente", nullable = false, length = 100)
	private String nome;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;
	
	@Column(name="nr_cpf", length = 14)
	private String cpf;
	
	@Column(name="ds_genero", nullable = false)
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	@CreationTimestamp
	@Column(name="dt_cadastro", updatable=false)
	@Temporal(TemporalType.DATE)
	private Calendar dt_cadastro;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Column(name="st_vip")
	private boolean vip;
	
	@Transient
	private long cartao;
	
	

	public Cliente() {
		super();
	}	

	public Cliente(String nome, Calendar dt_nascimento, String cpf, Genero genero, byte[] foto, boolean vip) {
		super();
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.cpf = cpf;
		this.genero = genero;
		this.foto = foto;
		this.vip = vip;
	}
	
	public Cliente(int codigo, String nome, Calendar dt_nascimento, String cpf, Genero genero, byte[] foto, boolean vip) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.cpf = cpf;
		this.genero = genero;
		this.foto = foto;
		this.vip = vip;
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

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Calendar getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Calendar dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public long getCartao() {
		return cartao;
	}

	public void setCartao(int cartao) {
		this.cartao = cartao;
	}
	
	
	
}
