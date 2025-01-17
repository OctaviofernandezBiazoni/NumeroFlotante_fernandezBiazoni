public class App {
    public static void main(String[] args) throws Exception {
       
        /*declaro una variable float*/
        float numero = 27.56f;
       
       /*declaro una variable de tipo int, realizo el parseo 
        de datos de float a int y le asigno la parte entera*/
       int parteEntera = (int) numero;
       
       /*declaro una variable de tipo float, realizo el parseo 
        de datos de float a float y le asigno la parte decimal*/
       float parteDecimal = numero - parteEntera;
       
       /*imprimo por consola los datos obtenidos*/
       System.out.println("numero:" + numero);
       System.out.println("parteEntera:" + parteEntera);
       System.out.println("parteDecimal:" + parteDecimal);
    }
}
