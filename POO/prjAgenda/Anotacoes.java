import java.util.ArrayList;

import javax.swing.JOptionPane;

class Anotacoes extends Item {
	private String title;
	private String note;
	
	ArrayList<String> titulo = new ArrayList<String> ();
    ArrayList<String> anotacao = new ArrayList<String> ();
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
    public void Adicionar() {
    	title = JOptionPane.showInputDialog(null, "Titulo:");
        note = JOptionPane.showInputDialog(null, "Anotacao:");
        titulo.add(title);
        anotacao.add(note);
    }
    public void Imprimir() {
    	for(int i=0; i<titulo.size(); i++) {
			JOptionPane.showMessageDialog(null, "Titulo: " + titulo.get(i) + "\nAnotacao: " + anotacao.get(i));
		}
    }
    public void Voltar() {}
}
