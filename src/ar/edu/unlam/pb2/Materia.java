package ar.edu.unlam.pb2;

public class Materia {
	//Atributos
		private Examen numeroEx1;
		private Examen numeroEx2;
	//Metodos
	public Boolean Evaluar(Integer numeroEx, Integer nota){
	switch(numeroEx){
	case 1: this.numeroEx1 = new Examen();
			return numeroEx1.Calificar(nota);
	case 2: this.numeroEx2 = new Examen();
			return numeroEx2.Calificar(nota);
	default: return false;
		}
	}
	public Integer getExamen(Integer numEx){
		switch(numEx){
		case 1:	return numeroEx1.getNota();
		case 2: return numeroEx2.getNota();
		default: return 0;
		}
	}


}	
		
		

