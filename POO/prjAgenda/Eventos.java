import javax.swing.JOptionPane;
import java.util.ArrayList;

class Eventos extends Item {
    private String name;
    private String description;
    private String date;
    private String hour;

    ArrayList<String> nome = new ArrayList<String> ();
    ArrayList<String> descricao = new ArrayList<String> ();
    ArrayList<String> data = new ArrayList<String> ();
    ArrayList<String> hora = new ArrayList<String> ();
    
    public Eventos() {
    	
    }
    // Getters e Setters
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

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
	
    public void Adicionar() {
        name = JOptionPane.showInputDialog(null, "Nome do evento:");
        description = JOptionPane.showInputDialog(null, "Descricao:");
        date = JOptionPane.showInputDialog(null, "Data:");
        hour = JOptionPane.showInputDialog(null, "Hora:");
        nome.add(name);
	    descricao.add(description);
	    data.add(date);
	    hora.add(hour);
    }
    
    public void Imprimir() {
    	for(int i=0; i<nome.size(); i++) {
			JOptionPane.showMessageDialog(null, "Nome: " + nome.get(i) + "\nDescrição: " + descricao.get(i)+"\nData: " + data.get(i)+"\nHora: " + hora.get(i));
		}
    }

    public void Voltar() {}
}
