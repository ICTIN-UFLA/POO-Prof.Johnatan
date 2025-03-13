##  Exercício 1  - Classe e Construtor 

Escreva uma classe para representar um Aluno. Adicione atributos relacionados às características de um Aluno, como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. 

Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina. 

Escreva um programa para testar (criar o método main) essa classe, que pede as informações do aluno ao usuário e ao final informal o nome das disciplinas mostra as notas e mostra se o aluno foi aprovado ou não.


Classe Aluno.java

```Java
public  class Aluno {

String nome;

String matricula;

String curso;

String[] disciplinas = new String[3];

double[][] notasDisciplinas = new  double[3][4]; // 3 para as Disciplinas e a média

  

void mostrarInformaçoes(){

System.out.println("Nome: " + nome);

System.out.println("Matrícula: " + matricula);

System.out.println("Nome do curso: " + curso);

  

for (int  i=0; i<notasDisciplinas.length; i++){

System.out.println("Notas da disciplina " + disciplinas[i]);

for (int  j=0; j<notasDisciplinas[i].length; j++){

System.out.print(notasDisciplinas[i][j] + " ");

}

System.out.println();

}

}

  

boolean  verificarSituacao(int  indice){

  

if (obterMedia(indice) >= 7){

return  true;

}

  

return  false;

}

  

double obterMedia(int  indice) {

  

double  soma = 0;

  

for (int  i = 0; i < notasDisciplinas[indice].length; i++) {

soma += notasDisciplinas[indice][i];

}

  

double  media = soma / 4;

  

return  media;

}

}
```


Classe principal Main.java 

````Java 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.print("Entre com o nome do aluno: ");
		aluno.nome = scan.next();

		System.out.print("Entre com o nome do curso: ");
		aluno.curso = scan.next();

		System.out.print("Entre com a Matricula: ");
		aluno.matricula = scan.next();

		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Informe o nome da disciplina " + i);
			aluno.disciplinas[i] = scan.next();
		}

		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		aluno.mostrarInformaçoes();

		for (int i = 0; i < aluno.disciplinas.length; i++) {
			if (aluno.verificarSituacao(i)) {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - reprovado");
			}
		}

	}
}
```` 
