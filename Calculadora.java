import javax.swing.JOptionPane;
public class Calculadora {
	public static void main(String[] args) {
		
		while( true ) {
			int numero1 = Integer.parseInt( JOptionPane.showInputDialog( "Informe o primeiro n�mero: ") );
			int numero2 = Integer.parseInt( JOptionPane.showInputDialog( "Informe o segundo n�mero:") );
			int acao 	= Integer.parseInt( JOptionPane.showInputDialog( "Escolha um c�lculo b�sico: \n"
										  	+ "1 - Soma \n"
										  	+ "2 - Subtra��o \n"
										  	+ "3 - Multiplica��o \n"
										  	+ "4 - Divis�o \n"
										  	+ "5 - Sair do programa \n"
										  ));
			String msg = " ";
			double dResultado = 0;
			switch( acao ) {
				case 1: 
					dResultado = numero1 + numero2;
					msg        = "A soma �: ";
				break;
				case 2:
					dResultado = numero1 - numero2;
					msg		   = "A subtra��o �: ";
				break;
				case 3:
					dResultado = numero1 * numero2;
					msg 	   = "A multiplica��o �: ";
				break;
				case 4:
					if( numero2 != 0 ) {
						dResultado = numero1 / numero2;
						msg 	   = "A divis�o �:"; 
					} else {
						
					}
				break;
				case 5:
					System.exit(0);
				break;
				default:
					JOptionPane.showMessageDialog( null, "Op��o Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION );
			}
			mostraResultado( msg + dResultado );
		}
	}

	private static void mostraResultado( String resultado ) {
		JOptionPane.showMessageDialog( null, resultado, "Erro", JOptionPane.OK_CANCEL_OPTION );
	}
}
