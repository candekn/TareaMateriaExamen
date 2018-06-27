package ar.edu.unlam.pb2;

public class Materia {
	//Atributos
		private Examen numeroEx1;
		private Examen numeroEx2;
	//Metodos
	public void Evaluar(Integer numeroEx, Integer nota) throws Exception{

		if(numeroEx!=1&&numeroEx!=2){
			throw new Exception("Examen Incorrecto");
		}
		else {
			if(numeroEx==1) {
					numeroEx1 = new Examen();
					this.numeroEx1.Calificar(nota);
			}
			else {
				numeroEx1 = new Examen();
				this.numeroEx2.Calificar(nota);
			}
		}
	}
	public Integer getExamen(Integer numEx)throws Exception{

		if(numEx==1||numEx==2){
			if(numEx==1) {
				return this.numeroEx1.getNota();
			}
			else {
				return this.numeroEx2.getNota();
			}
		}
		else {
			throw new Exception("Numero de examen Incorrecto");
		}
	}
}

	
		
		

