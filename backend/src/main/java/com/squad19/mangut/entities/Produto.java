package com.squad19.mangut.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@EmbeddedId
	private ProdutoPK id = new ProdutoPK();
	private String nome;
	private Double preco;
	private String quantidade;

	public Produto() {

	}

	public Produto(ProdutoPK id, String nome, Double preco, String quantidade) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public ProdutoPK getId() {
		return id;
	}

	public void setId(ProdutoPK id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
}