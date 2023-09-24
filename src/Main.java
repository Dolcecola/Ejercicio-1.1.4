import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        double[] array = new double[10];
        double suma=0;

        for(int i=0;i<array.length;i++)
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce un numero: ");
                String cad = sc.next();
                double n = Double.parseDouble(cad);
                array[i]=n;
                if(array[i]<0)
                {
                    array[i]=0;
                    break;
                }
            }

            catch(Exception e)
            {
                break;
            }

        }

        for(int i=0;i<array.length;i++)
        {
            suma+=array[i];
        }

        System.out.println("La suma es: " + suma);
    }
}