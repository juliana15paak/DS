import java.util.ArrayList;

import javax.swing.JOptionPane;

class Tarefas extends Item {
    private String name;
    private String description;
    private String date;
    private String finish;

    ArrayList<String> nome = new ArrayList<String> ();
    ArrayList<String> descricao = new ArrayList<String> ();
    ArrayList<String> prazo = new ArrayList<String> ();
    ArrayList<String> concluido = new ArrayList<String> ();
    
    public void Adicionar() {
        name = JOptionPane.showInputDialog(null, "Nome da tarefa:");
        description = JOptionPane.showInputDialog(null, "Descricao:");
        date = JOptionPane.showInputDialog(null, "Prazo:");
        finish = JOptionPane.showInputDialog(null, "Concluida?:");
        nome.add(name);
	    descricao.add(description);
	    prazo.add(date);
	    concluido.add(finish);
    }

    public void Imprimir() {
    	for(int i=0; i<nome.size(); i++) {
			JOptionPane.showMessageDialog(null, "Tarefa: " + nome.get(i) + "\nDescricao: " + descricao.get(i)+"\nPrazo: " + prazo.get(i) + "\nConcluida?: " + concluido.get(i));
		}
    }

    public void Voltar() {}

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFinish() {
        return finish;
    }

    public void sertFinish(String finish) {
        this.finish = finish;
    }
}
