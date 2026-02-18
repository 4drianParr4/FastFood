package FastFood;

import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);
    public ObjFastFood[][] Ingresarpedidos(int n, Scanner sc) {
        ObjFastFood[][]m = new ObjFastFood[n][n];
        metodos M = new metodos();
        int Tipo = 0;
        int Tamano = 0;
        int Cantidad = 0;
        double PrecioUnidad = 0.0;
        double TotalPagar = 0.0;
        String Descripcion = "";
        

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Bienvenido al expendio de comidas rapidas");
                System.out.println("Seleccione el tipo de comida");
                System.out.println("1) Perro");
                System.out.println("2) Perra");
                System.out.println("3) Salchipapa");
                System.out.println("4) Hamburguesa");
                Tipo = sc.nextInt();

                System.out.println("Ingrese Tamaño");
                System.out.println("1) Pequeño");
                System.out.println("2) Mediano");
                System.out.println("3) Grande");
                Tamano = sc.nextInt();

                System.out.println("Ingrese la cantidad");
                Cantidad = sc.nextInt();
                System.out.println("Ingrese el precio");
                PrecioUnidad = sc.nextDouble();
                TotalPagar = Cantidad * PrecioUnidad;
                ObjFastFood o = new ObjFastFood(Tipo,Tamano,Cantidad,PrecioUnidad,TotalPagar);
                m[i][j] = o;
                
                 }
            }
        return m;
    }
}
