package set.operacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidade(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }


    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet){
            if(c.getCodigo()  == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
         convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

}
