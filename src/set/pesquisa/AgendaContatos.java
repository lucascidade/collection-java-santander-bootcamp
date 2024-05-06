package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato (){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contaoPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)) {
                contaoPorNome.add(c);
            }
        }
        return contaoPorNome;
    }

    public Contato atualizarContato(String nome, int numero){
        Contato contatoAtualizado  = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

}
