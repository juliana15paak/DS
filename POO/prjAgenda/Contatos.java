import javax.swing.JOptionPane;
import java.util.ArrayList;

class Contatos extends Item {
	 	
	    ArrayList<String> name = new ArrayList<String> ();
	    ArrayList<String> phone = new ArrayList<String> ();
	    
	    //construtor e sobrecarga
	    public Contatos() {
	    	
	    }
	    public Contatos(String nome) {
	    	this.nome=nome;
	    }
	    
	    // Getters e Setters
	    private String nome;
	    public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		private String telefone;
		
	    public void Adicionar() {
            nome = JOptionPane.showInputDialog(null, "Nome:");
    	    telefone = JOptionPane.showInputDialog(null, "Telefone:");
    	    name.add(nome);
    	    phone.add(telefone);
	    }
    	public void Imprimir() {
    		for(int i=0; i<name.size(); i++) {
    			JOptionPane.showMessageDialog(null, "Nomes: " + name.get(i) + "\nTelefones: " + phone.get(i));
    		}
    	}

    	public void Voltar() {}
}
 