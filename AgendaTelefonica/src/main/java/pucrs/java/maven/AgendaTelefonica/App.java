package pucrs.java.maven.AgendaTelefonica;

public class App 
{
    public static void main( String[] args ) {
        
        AgendaTelefonica agenda = new AgendaTelefonica();
		
		agenda.inserir("Letícia", "111111111");
		agenda.inserir("Ana", "2222222222222");
		agenda.inserir("João", "333333333333");
		agenda.inserir("Maria", "44444444444");
		agenda.inserir("José", "555555555555");
		
		System.out.println(agenda.tamanho());
		System.out.println(agenda.buscarNumero("Letícia"));
		agenda.remover("Ana");
		System.out.println(agenda.tamanho());
		
    }
}
