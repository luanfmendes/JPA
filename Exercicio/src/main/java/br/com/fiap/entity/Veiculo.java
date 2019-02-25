package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Veiculo {
	
	private int codigo;
	
	private String ds_placa;
	
	private String ds_cor;
	
	private int nr_ano;
}
