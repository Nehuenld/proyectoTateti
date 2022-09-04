package proyectoTateti;

public class Tateti {
	//attr
	private String Tablero[][] = new String[3][3];
	private String fichaGan;
	/*
	 *    0 1 2
	 * 0  X X X
	 * 1  0 0 0
	 * 2  X X X
	 * 
	 */
	
	// metodos
	
	boolean hayTateti() {
		if((Tablero[0][0]!="-")&&(Tablero[0][0]==Tablero[0][1])&&(Tablero[0][1]==Tablero[0][2])) {
			setFichaGan(Tablero[0][0]);
			return true;
		}
		if((Tablero[1][0]!="-")&&(Tablero[1][0]==Tablero[1][1])&&(Tablero[1][1]==Tablero[1][2])) {
			setFichaGan(Tablero[1][0]);
			return true;
		}
		if((Tablero[2][0]!="-")&&(Tablero[2][0]==Tablero[2][1])&&(Tablero[2][1]==Tablero[2][2])) {
			setFichaGan(Tablero[1][0]);
			return true;
		}
		if((Tablero[0][1]!="-")&&(Tablero[0][1]==Tablero[1][1])&&(Tablero[1][1]==Tablero[2][1])) {
			setFichaGan(Tablero[0][1]);
			return true;
		}
		if((Tablero[0][2]!="-")&&(Tablero[0][2]==Tablero[1][2])&&(Tablero[1][2]==Tablero[2][2])) {
			setFichaGan(Tablero[0][2]);
			return true;
		}
		if((Tablero[0][0]!="-")&&(Tablero[0][0]==Tablero[1][0])&&(Tablero[1][0]==Tablero[2][0])) {
			setFichaGan(Tablero[0][0]);
			return true;
		}
		if((Tablero[0][0]!="-")&&(Tablero[0][0]==Tablero[1][1])&&(Tablero[1][1]==Tablero[2][2])) {
			setFichaGan(Tablero[0][0]);
			return true;
		}
		if((Tablero[0][2]!="-")&&(Tablero[0][2]==Tablero[1][1])&&(Tablero[1][1]==Tablero[2][0])) {
			setFichaGan(Tablero[0][2]);
			return true;
		}
		return false;
	}
	
	boolean ponerFicha(int posF, int posC, String ficha) {
	   if(Tablero[posF][posC]!=null) {
		  if(Tablero[posF][posC]=="-"){
			 Tablero[posF][posC]=ficha; 
			 return true;
		  }
		  else {
			  return false;
		  }
	   }
	   else { 
	       return false; 
	   }
	}
	
	
	void crearYLlenarTablero() {
		for(int f=0;f<Tablero.length;f++) {
			for(int c=0;c<Tablero.length;c++) {
				Tablero[f][c]="-";
			}
		}
	}
	
	void mostrarTablero() {
		System.out.println(" ");
		for(int f=0;f<Tablero.length;f++) {
			for(int c=0;c<Tablero.length;c++) {
				System.out.print(Tablero[f][c]+" ");
			}
			
			System.out.println(" ");
		}
	}

	public String getFichaGan() {
		return(fichaGan);
	}

	public void setFichaGan(String fichaGan) {
		this.fichaGan = fichaGan;
	}
}


