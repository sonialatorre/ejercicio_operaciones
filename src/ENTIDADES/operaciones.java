package ENTIDADES;
//HACER UNA CLASE LLAMADA OPERACIONES EN DONDE VAMOS A TENER ATRIBUTOS A, B Y RESULTADO
//ASIGNANDO EL VALOR DE A Y B CON SUS RESPECTIVOS VALORES
//CREAR LOS METODOS SUMAR, RESTAR, MULTIPLICAR RETORNANDO RESULTADOS
//EN MAIN INSTANCIAR CLASE OPERACIONES Y CREAMOS UN OBJETO DONDE INVOCAREMOS CADA METODO DE OPERACION
public class operaciones {
    int a = 25;
    int b= 15;
    int resultado=0;

    public int suma (){
        resultado=a+b;
        return resultado;
    }
    public int resta (){
        resultado=a-b;
        return resultado;

    }

      public int multiplicacion(){
        resultado= a*b;
        return resultado;
      }
}