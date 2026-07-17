import java.util.Scanner;

class Livro {

    int codigo;
    String titulo;
    String autor;
    int ano;
    boolean disponivel;

    public Livro(int codigo, String titulo, String autor, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
    }

}

class Aluno {

    String nome;
    String curso;
    String matricula;

    public Aluno(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

}

class Emprestimo {

    int codigoLivro;
    String matriculaAluno;
    String data;

    public Emprestimo(int codigoLivro, String matriculaAluno, String data) {
        this.codigoLivro = codigoLivro;
        this.matriculaAluno = matriculaAluno;
        this.data = data;
    }

}

public class questao2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Livro[] livros = new Livro[4];
        Aluno[] alunos = new Aluno[5];
        Emprestimo[] emprestimos = new Emprestimo[4];

        int totalEmprestimos = 0;

        // Cadastro dos livros

        System.out.println("===== CADASTRO DE LIVROS =====");

        for (int i = 0; i < livros.length; i++) {

            System.out.println("\nLivro " + (i + 1));

            System.out.print("Código: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Título: ");
            String titulo = scanner.nextLine();

            System.out.print("Autor: ");
            String autor = scanner.nextLine();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            livros[i] = new Livro(codigo, titulo, autor, ano);

        }

        // Cadastro dos alunos

        System.out.println("\n===== CADASTRO DE ALUNOS =====");

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("\nAluno " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Curso: ");
            String curso = scanner.nextLine();

            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();

            alunos[i] = new Aluno(nome, curso, matricula);

        }

        // Empréstimos

        String resposta;

        do {

            System.out.println("\n===== NOVO EMPRÉSTIMO =====");

            System.out.print("Código do livro: ");
            int codigoLivro = scanner.nextInt();
            scanner.nextLine();

            Livro livroEncontrado = null;

            for (Livro livro : livros) {

                if (livro.codigo == codigoLivro) {
                    livroEncontrado = livro;
                    break;
                }

            }

            if (livroEncontrado == null) {

                System.out.println("Livro não encontrado.");

            } else if (!livroEncontrado.disponivel) {

                System.out.println("Livro já está emprestado.");

            } else {

                System.out.print("Matrícula do aluno: ");
                String matricula = scanner.nextLine();

                System.out.print("Data do empréstimo: ");
                String data = scanner.nextLine();

                emprestimos[totalEmprestimos] =
                        new Emprestimo(codigoLivro, matricula, data);

                totalEmprestimos++;

                livroEncontrado.disponivel = false;

                System.out.println("Empréstimo realizado com sucesso.");

            }

            System.out.print("Deseja realizar outro empréstimo? (S/N): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("S") &&
                totalEmprestimos < emprestimos.length);

        // Livros disponíveis

        System.out.println("\n===== LIVROS DISPONÍVEIS =====");

        for (Livro livro : livros) {

            if (livro.disponivel) {

                System.out.println(livro.codigo + " - " + livro.titulo);

            }

        }

        // Livros emprestados

        System.out.println("\n===== LIVROS EMPRESTADOS =====");

        for (Livro livro : livros) {

            if (!livro.disponivel) {

                System.out.println(livro.codigo + " - " + livro.titulo);

            }

        }

        // Relação dos empréstimos

        System.out.println("\n===== RELAÇÃO DOS EMPRÉSTIMOS =====");

        for (int i = 0; i < totalEmprestimos; i++) {

            Emprestimo e = emprestimos[i];

            String tituloLivro = "";

            for (Livro livro : livros) {

                if (livro.codigo == e.codigoLivro) {
                    tituloLivro = livro.titulo;
                }

            }

            System.out.println("----------------------------");
            System.out.println("Livro: " + tituloLivro);
            System.out.println("Matrícula: " + e.matriculaAluno);
            System.out.println("Data: " + e.data);

        }

        scanner.close();

    }

}