package entitis;

public class Inversor {
	private String str;
	
	public Inversor(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	// Aqui estou invertendo a String, transformando ela em uma array e trocando as posições com outro arrray 
	public String inversoDeString() {
	    char[] frase = str.toCharArray();
	    char[] inv = new char[frase.length];
	    
	    for (int i = frase.length - 1, j = 0; i >= 0; i--, j++) {
	        inv[j] = frase[i];
	    }
	   
	    String inversa = new String(inv);
	    
	    return inversa;
	}
}
