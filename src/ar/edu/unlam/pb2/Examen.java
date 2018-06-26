package ar.edu.unlam.pb2;

public class Examen {
	//Atributos
	private Integer nota;
	//Metodos
	public Boolean Calificar(Integer nota){
		if(nota>0&&nota<=10){
			this.nota=nota;
			return true;
		}
		else{
			return false;
		}
	}
	public Integer getNota(){
		return nota;
	}
}
