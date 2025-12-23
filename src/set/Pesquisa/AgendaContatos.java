package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        //atributos
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Diogo", 1234);
        contatos.adicionarContato("Diogo 1", 1235);
        contatos.adicionarContato("Diogo 2", 1235);
        contatos.exibirContatos();
        contatos.atualizarNumeroContato("Diogo 2", 1236);
        contatos.exibirContatos();
    }
}
