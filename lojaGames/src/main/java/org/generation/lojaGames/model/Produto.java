package org.generation.lojaGames.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name = "tb_produto")
	public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull
		@Size(min = 1, max = 100)
		private String titulo;
		
		@NotNull
		@Size(min = 1, max = 250)
		private String descricao;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		@NotNull
		@Size(min = 1, max = 2)
		private String classificacao;
		
		private int anoLancamento;
		
		private double preco;
		
		private int estoque;

		private String nome;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setTitulo(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}

		public String getClassificacao() {
			return classificacao;
		}

		public void setClassificacao(String classificacao) {
			this.classificacao = classificacao;
		}

		public int getAnoLancamento() {
			return anoLancamento;
		}

		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getEstoque() {
			return estoque;
		}

		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}
		
		

	}


