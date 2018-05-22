package com.relatorio.trabalho.java;
import java.util.List;
import java.util.ArrayList;
public class principal {

	public static void main(String[] args) {
		List<Docente> docentes = new ArrayList();
		List<Discente> discentes = new ArrayList();
		List<Disciplina> disciplinas = new ArrayList();
		List<Curso> cursos = new ArrayList();
		List<Graduacao> graduacoes = new ArrayList();
		List<posGraduacao> posGraduacoes = new ArrayList();
		List<prodCien> producoes = new ArrayList();
		for(int i=0; i<args.length;i++) {
			if(args[i].equals("-d")) {
				Arquivos arq = new Arquivos();
				if(arq.lerArqDocent(docentes,args[++i])) {
					continue;
				}
				else break;
			}
			else if(args[i].equals("-a")) {
				Arquivos arq = new Arquivos();
				if(arq.lerArqDiscent(discentes, args[++i])) {
					continue;
				}
				else break;
			}
			else if(args[i].equals("-r")) {
				Arquivos arq = new Arquivos();
				if(arq.lerArqDisciplina(disciplinas, args[++i])) {
					continue;
				}
				else break;
			}
			else if(args[i].equals("-c")) {
				Arquivos arq = new Arquivos();
				if(arq.lerArqCurso(cursos, args[++i])) {
					continue;
				}
				else break;
			}
			else if(args[i].equals("-og")) {
				Arquivos arq = new Arquivos();
				if(arq.lerArqGrad(graduacoes, args[++i])) {
					continue;
				}
				else break;
			}
			else if(args[i].equals("-op")) {
				Arquivos arq = new Arquivos();
				if(arq.lerArqPos(posGraduacoes, args[++i])) {
					continue;
				}
				else break;
			}
			else if(args[i].equals("-p")) {
				Arquivos arq = new Arquivos();
				if(arq.lerArqProd(producoes, args[++i])) {
					continue;
				}
				else break;
			}
		}
	}

}
