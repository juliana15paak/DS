import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
    	Eventos eventos = new Eventos();
    	Anotacoes anotacoes = new Anotacoes();
    	Tarefas tarefas = new Tarefas();
    	Contatos contatos = new Contatos();
    	
    	int i=0;
        while (i != 3) {
        	String[] options = { "Eventos", "Anotacoes", "Tarefas", "Contatos" };
        	int mainMenu = JOptionPane.showOptionDialog(null, "Menu", "Agenda", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        	switch (mainMenu) {
	        case 0:
	        	String[] eventMenuOptions = {"Adicionar Evento", "Ver Eventos", "Voltar", "Sair"};
	            int eventMenuChoice = JOptionPane.showOptionDialog(null, "Eventos", "Eventos Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, eventMenuOptions, eventMenuOptions[0]);
	            if (eventMenuChoice == 0) {
	            	eventos.Adicionar();
	            }else if(eventMenuChoice == 1) {
	            	 eventos.Imprimir();
	            }else if(eventMenuChoice == 2) {
	                eventos.Voltar();
	            }else {System.exit(0);}
	            break;
	        case 1:
	            String[] anotacoesMenuOptions = {"Adicionar Anotacoes", "Ver Anotacoes", "Voltar", "Sair"};
	            int anotacoesMenuChoice = JOptionPane.showOptionDialog(null, "Anotacoes", "Anotacoes Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, anotacoesMenuOptions, anotacoesMenuOptions[0]);
	            if (anotacoesMenuChoice==0) {
	                anotacoes.Adicionar();
	            }else if (anotacoesMenuChoice==1) {
	                anotacoes.Imprimir();
	            }else if (anotacoesMenuChoice==2) {
	            	anotacoes.Voltar();
	            }else {System.exit(0);}
	            break;
	        case 2:
	            String[] tarefaMenuOptions = {"Adicionar Tarefa", "Ver Tarefas", "Voltar", "Sair"};
	            int tarefaMenuChoice = JOptionPane.showOptionDialog(null, "Tarefas", "Tarefas Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tarefaMenuOptions, tarefaMenuOptions[0]);
	            if (tarefaMenuChoice == 0) {
	                 tarefas.Adicionar();
	            }else if(tarefaMenuChoice == 1) {
	            	tarefas.Imprimir();
	            }else if (tarefaMenuChoice == 2) {
	            	tarefas.Voltar();
	            }else {System.exit(0);}
	                break;
	        case 3:
	            String[] contatoMenuOptions = {"Adicionar Contato", "Ver Contato", "Voltar", "Sair"};
	            int contatoMenuChoice = JOptionPane.showOptionDialog(null, "Contatos", "Contatos Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, contatoMenuOptions, contatoMenuOptions[0]);
	            if (contatoMenuChoice==0) {
	            	contatos.Adicionar();
	            }else if (contatoMenuChoice==1) {
	            	contatos.Imprimir();
	            }else if (contatoMenuChoice==2) {
	            	contatos.Voltar();
	            }else {System.exit(0);}
	                break;
	        default:
	            System.exit(0);
	        }
        }
    }
}
