package entities;



public class Tabuleiro {
	public String[][] mat = new String[4][4];
	public String result = " ";
	
	public void criarTabuleiro() {
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat.length;j++) {
				if(i==0 && j==0) {
					mat[i][j] = " ";
				}
				else if (i==0 && j==0) {
					mat[i][j] = " ";
				}
				else if (i==1 && j==0) {
					mat[i][j] = " ";
				}
				else if (i==2 && j==0) {
					mat[i][j] = " ";
				}
				else if (i==3 && j==0) {
					mat[i][j] = " ";
				}
				else if (i==0 && j==1) {
					mat[i][j] = " ";
				}
				else if (i==0 && j==2) {
					mat[i][j] = " ";
				}
				else if (i==0 && j==3) {
					mat[i][j] = " \n";
				}
				else if (i==1 && j==3) {
					mat[i][j] = " -\n";
				}
				else if (i==2 && j==3) {
					mat[i][j] = " -\n";
				}
				else if (i==3 && j==3) {
					mat[i][j] = " -\n";
				}
				else {
					mat[i][j] = " - ";
				}
			}
		}
	}

	public void mostrarTabuleiro() {
        for (String[] mostrarx:mat) {
        	for (String mostrary:mostrarx) {
        		System.out.print(mostrary);
        	}
        }
	}
	public void jogada(int x,int y) {
		if (x==1 && y==3) {
			mat[x][y] = Jogador.simbolo+" \n";
		}
		else if (x==2 && y==3) {
			mat[x][y] = Jogador.simbolo+" \n";
		}
		else if (x==3 && y==3) {
			mat[x][y] = Jogador.simbolo+" \n";
		}
		else {
		this.mat[x][y] = Jogador.simbolo;
		}
	}
	
	public String check() {
		if (mat[1][1]==Jogador.simbolo&&mat[2][2]==Jogador.simbolo&&mat[3][3].equals(Jogador.simbolo+" \n")) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else if(mat[1][3].equals(Jogador.simbolo+" \n")&&mat[2][2]==Jogador.simbolo&&mat[3][1]==Jogador.simbolo) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else if(mat[1][1]==Jogador.simbolo&&mat[1][2]==Jogador.simbolo&&mat[1][3].equals(Jogador.simbolo+" \n") ) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else if(mat[2][1]==Jogador.simbolo&&mat[2][2]==Jogador.simbolo&&mat[2][3].equals(Jogador.simbolo+" \n")) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else if(mat[3][1]==Jogador.simbolo&&mat[3][2]==Jogador.simbolo&&mat[3][3].equals(Jogador.simbolo+" \n")) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else if(mat[1][1]==Jogador.simbolo&&mat[2][1]==Jogador.simbolo&&mat[3][1]==Jogador.simbolo) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else if(mat[1][2]==Jogador.simbolo&&mat[2][2]==Jogador.simbolo&&mat[3][2]==Jogador.simbolo) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else if(mat[1][3].equals(Jogador.simbolo+" \n")&&mat[2][3].equals(Jogador.simbolo+" \n")&&mat[3][3].equals(Jogador.simbolo+" \n")) {
			result = Jogador.jogador+" Vencedor!!";
		}
		else {
			int z=0;
			for (int i=1;i<4;i++) {
				for (int j=1;j<4;j++) {
					if (mat[i][j]==" - "||mat[i][j]==" -\n") {
						z++;
					}
				}
			}
			if (z==0) {
				result = "Empate!!";
			}
		}
		return result;
	}
}

