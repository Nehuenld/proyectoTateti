package proyectoTateti;

public class PruebaTateti {
	
    public static void main(String[] args) {
    	Tateti jugar = new Tateti();
    	jugar.crearYLlenarTablero();
    	jugar.mostrarTablero();
    	Jugador j1=new Jugador("X", "Nehuen", jugar);
    	Jugador j2=new Jugador("O", "Maquina", jugar);
    	
    	
    	boolean ganador=false;
    	while(ganador==false) {
    	j1.jugar();
    	jugar.mostrarTablero();
	    	if(!(ganador=jugar.hayTateti())) {
	    		j2.jugar();
	        	jugar.mostrarTablero();
	        	ganador=jugar.hayTateti();
	    	}
    	
    	}
    	System.out.print("El ganador es: "+ jugar.getFichaGan());
    	
    }
}
