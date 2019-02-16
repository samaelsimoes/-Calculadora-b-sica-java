import javax.swing.JOptionPane;
public class Calculadora {
	public static void main(String[] args) {
		
		while( true ) {
			int numero1 = Integer.parseInt( JOptionPane.showInputDialog( "Informe o primeiro número: ") );
			int numero2 = Integer.parseInt( JOptionPane.showInputDialog( "Informe o segundo número:") );
			int acao 	= Integer.parseInt( JOptionPane.showInputDialog( "Escolha um cálculo básico: \n"
										  	+ "1 - Soma \n"
										  	+ "2 - Subtração \n"
										  	+ "3 - Multiplicação \n"
										  	+ "4 - Divisão \n"
										  	+ "5 - Sair do programa \n"
										  ));
			String msg = " ";
			double dResultado = 0;
			switch( acao ) {
				case 1: 
					dResultado = numero1 + numero2;
					msg        = "A soma é: ";
				break;
				case 2:
					dResultado = numero1 - numero2;
					msg		   = "A subtração é: ";
				break;
				case 3:
					dResultado = numero1 * numero2;
					msg 	   = "A multiplicação é: ";
				break;
				case 4:
					if( numero2 != 0 ) {
						dResultado = numero1 / numero2;
						msg 	   = "A divisão é:"; 
					} else {
						
					}
				break;
				case 5:
					System.exit(0);
				break;
				default:
					JOptionPane.showMessageDialog( null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION );
			}
			mostraResultado( msg + dResultado );
		}
	}

	private static void mostraResultado( String resultado ) {
		JOptionPane.showMessageDialog( null, resultado, "Erro", JOptionPane.OK_CANCEL_OPTION );
	}
}
