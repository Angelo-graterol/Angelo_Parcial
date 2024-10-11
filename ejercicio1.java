import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosEnteros= new int[2];
        int numeroEntero1;
        int numeroEntero2;
        boolean validacion= false;
        do {
            System.out.println("Ingrese dos numeros enteros positivos");
            numeroEntero1= scanner.nextInt();
            numeroEntero2= scanner.nextInt();
        if (numeroEntero1>0 && numeroEntero2>0) {
            numerosEnteros[0]=numeroEntero1;
            numerosEnteros[1]=numeroEntero2;
            validacion=true;
        } else {
            System.out.println("Ingresó mal los numeros, deben ser enteros positivos");
        }
        } while (validacion==false);
        int longitudEntreNumeros=0;
        if (numerosEnteros[0]>numerosEnteros[1]) {
            longitudEntreNumeros= numerosEnteros[0]-numerosEnteros[1]-1;
            
        }else if (numerosEnteros[0]<numerosEnteros[1]) {
            longitudEntreNumeros= numerosEnteros[1]-numerosEnteros[0]-1;
            
        }
        
        int[] intervalo= new int[longitudEntreNumeros];
        if(numerosEnteros[0]>numerosEnteros[1]){
            intervalo[0]=numerosEnteros[1]+1;
            
        }else{
            intervalo[0]=numerosEnteros[0]+1;

        }
        //numero que ayuda a llenar el intervalo
        int sumador= intervalo[0];
        for (int i = 0; i < intervalo.length; i++) {
            
            intervalo[i]=sumador;
            sumador ++;
        }
        boolean primo;
        int n = intervalo.length;
        for (int i=intervalo[0]; i<=intervalo[n-1]; i++) {
            primo=true;    
            for (int j = 2; j < intervalo[n-1]; j++) {
                if (intervalo[i]%j==0) {
                    primo=false;
                }
            }
            if (primo==true) {
                System.out.println(intervalo[i]);
                
            }
        }



        // boolean primo= false;
        // double contador=0;
        // for (int i = 0; i < intervalo.length; i++) {
        //     double operacionModulo=0;
        //     for (int j = 0; j < intervalo[j]; j++) {
                
                
        //         operacionModulo=intervalo[i]% intervalo[j];
        //         contador=contador+operacionModulo;
                
        //         if (contador==0) {
        //             primo= true;
                    
                    
        //         }
                
        //     }
        //     if (primo==true) {
                
        //         System.out.println(intervalo[i]);
        //     }
        // }




        scanner.close();
    }
}
