package ifpr.paranavai.jogo.modelo;

import java.util.List;

public interface PersonagemDAO {
    public List<Personagem> buscarTodos();

    public Personagem buscarPorId(Integer id);

    public void inserir(Personagem personagem);
}
