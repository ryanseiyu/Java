package br.com.dio;
import br.com.dio.model.Gato;
public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        /*System.out.println("Hello world!");*/
        Livro livro1 = new Livro("DotA 2", 100);
        System.out.println(livro1);
    }
}
class Livro {
    private String nome;
    private Integer numPaginas;
    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
    @Override
    public String toString() {
        return "Livro{" + "nome='" + nome + '\'' + ", numPaginas=" + numPaginas + '}';
    }
}

