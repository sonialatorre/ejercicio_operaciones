import ENTIDADES.operaciones;

public class Main {
    public static void main(String[] args) {
      operaciones operaciones1=new operaciones();

      operaciones1.suma();
      operaciones1.resta();
      operaciones1.multiplicacion();

        System.out.println("el resultado de la suma es " + operaciones1.suma());
        System.out.println("el resultado de la resta es " + operaciones1.resta());
        System.out.println("el resultado de la multiplicacion es " + operaciones1.multiplicacion());

    }
}