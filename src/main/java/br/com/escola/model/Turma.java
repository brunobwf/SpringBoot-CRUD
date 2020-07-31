package br.com.escola.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_turma")
public class Turma {
	
	//Atributos
	@Id //Chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO-INCREMENT
	@Column(name = "id_turma")//NOME DO ATRIBUTO NA TABELA(Em java é uma coisa na tabela é outra)
	private long id;
	
	@Column(name = "nome_turma")//NOME DO ATRIBUTO NA TABELA(Em java é uma coisa na tabela é outra)
	@NotNull //Atributo não pode ser nulo
	private String turma;
	
	@Column(name = "ativo_turma")//NOME DO ATRIBUTO NA TABELA(Em java é uma coisa na tabela é outra)
	private boolean ativo;
	
	@OneToMany(mappedBy = "turma",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("turma")
	private List<Aluno> aluno;
	
	
	
	
	//Getters e Setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	

}
