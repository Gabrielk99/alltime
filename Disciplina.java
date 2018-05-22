package com.relatorio.trabalho.java;

public class Disciplina{
	private String codDisciplina;
	private String nome;
	private int carSemanal;
	private int carSemestral;
	private int codDoc;
	private double codCurs;
	
	public Disciplina (String cod,String n,int semanal,int semestral,int cd,double cc) {
		this.codDisciplina = cod;
		this.nome = n;
		this.carSemanal = semanal;
		this.carSemestral = semestral;
		this.codDoc = cd;
		this.codCurs = cc;
	}
}
