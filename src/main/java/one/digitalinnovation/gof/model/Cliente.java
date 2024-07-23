package one.digitalinnovation.gof.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	@ManyToMany
	private List<Cliente> relacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Cliente> getRelacao() {
		return relacao;
	}

	public void setRelacao(List<Cliente> relacao ) {
		this.relacao = relacao;
	}

}
