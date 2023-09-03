/*
Creado por Emmanuel Acoltzi Bautista
Fecha de de creacion: 06/08/2023
basedeemma@gmail.com

*/
package EEDT;
public class EEDT{
	

//valores



  
    public double PI=3.141592653589793;//Numero irracional Pi se utiliza para realizar diferentes calculos
	public double e=2.718281828459045;// Numero irracional e se utiliza para realizar diferentes calculos


//Potencias

	private float BASE;
	private float EXPONENTE;
	private float resultado=1;
	public float Potencia(float base,float exponente){

        /*
        *Potencias
        
        *Es el elevar un numero a cierta potencia se utiliza para realizar distintos calculos matematicos
        */
        
            this.BASE=base;
	this.EXPONENTE=exponente;
	for(int i=1;i<=EXPONENTE;i++){
	resultado=(resultado*BASE);
	}
	return resultado;
	}

        //suma
        
        private float sum1;
        private float sum2;
        private float resum;
        public float Suma(float n1,float n2){
        this.sum1=n1;
        this.sum2=n2;
        resum=sum1+sum2;
        return resum;
        }
        
        //resta
        
        private float re1;
        private float re2;
        private float rere=0;
        public float Resta(float n1,float n2){
        this.re1=n1;
        this.re2=n2;
        
        
            for(float i=re2;i<re1;i+=1){
                       
            rere= rere+1;
            }
        
         if(re1>re2){
         return rere;
         }else{
            for(float i=re1;i<re2;i+=1){
                       
            rere= rere+1;
        
                
            }  
            return (rere*-1);
         }  
        }
        
        
        //division
        
        private float div1,div2;
        public float Division(float n1,float n2){
        this.div1=n1;
        this.div2=n2;
        
        return div1/div2;
        }
        
        
        //grad a rad
        float grados,rares;
        public float aRadianes(float gra){
        this.grados=gra;
        rares=(float) (grados*PI/180);
        return rares;
        }
        
        //rad a grad
        float rads,radsre;
        public float aGrados(float rad){
        this.rads=rad;
        radsre=(float) (rads/PI*180);
            
            return radsre;
        }
        
//multiplicacion

	private float n1;
	private float n2;
	private float multiplicacion;
	public float Multiplicacion(float n1,float n2){
	this.n1=n1;
	this.n2=n2;
	if(n2>0){
	for(int i=1;i<=n2;i+=1){
	multiplicacion=(multiplicacion+n1);
	}}
	else if(n2<0){
	for(int i=-1;i>=n2;i--){
	multiplicacion=(multiplicacion+n1);
	}
	}
	return multiplicacion;
	}
	
//absoluto

	private float Valor1;
	private float resultadoAbsolutos;
	public float VAbsoluto(float resultadoAbsoluto){
	this.Valor1=resultadoAbsoluto;

	if(n1>0){
	resultadoAbsolutos=Valor1;
	}else if(n2<0){
	resultadoAbsolutos=Valor1*-1;
	}
	return resultadoAbsolutos;
	}



}
