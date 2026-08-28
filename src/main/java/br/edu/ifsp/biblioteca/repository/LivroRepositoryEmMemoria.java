import br.edu.ifsp.biblioteca.domain.Livro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class LivroRepositoryEmMemoria implements ILivroRepository {

    @Override
    public List<Livro> listarTodos() {
        return new ArrayList<>(this.livros.values());

        //        List<Livro> todosOsLivros = new ArrayList<>();
        //
        //        for (Livro livro : this.livros.values()) {
        //            todosOsLivros.add(livro);
        //        }
        //        return todosOsLivros;
    }

    @Override
    public Optional<Livro> buscarPorId(Long id) {
        return Optional.ofNullable(this.livros.get(id));
    }

        //
        //  }
        //
        //  return Optional.of(l);
    }

    @Override
    public Optional<Livro> buscarPorIsbn(String isbn) {

        List<Livro> colecaoLivros = new ArrayList<>(this.livros.values());

        // for each

        // for (Livro livro : colecaoLivros) {
        //      if (livro.getIsbn().equalsIgnoreCase(isbn)){
        //          return Optional.of(livro)
        //      }
        // }

        for (int i = 0; i < colecaoLivros.size(); i++){
            Livro livro = colecaoLivros.get(i);
            String livroIsbn = livro.getIsbn();
            if (livroIsbn.equalsIgnoreCase()) {
                return Optional.of(livro);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Livro> buscarPorTitulo(String titulo) {

        List<Livro> encontrados = new ArrayList<>();

        for(Livro livro : this.livros.values()) {
            String livroTitulo = livro.getTitulo().toLowerCase();

            if(livroTitulo.contains(titulo)) {
                encontrados.add(livro);
            }
        }

        return encontrados;
    }
}