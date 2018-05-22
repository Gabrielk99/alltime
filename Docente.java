package com.relatorio.trabalho.java;

public class Docente{
	private int codDocente;
	private String nome;
	private Departamento dep;


	public Docente ( int cd,String n, Departamento d) {
		this.nome = n;
		this.dep = d;
		this.codDocente = cd;
	}
}
