public class Actividad3_3 {
    /**
     * 
     * @param args Este es el parametro utilizado en 
     */
        public static void main (String[] args) {
            //Variables
            String s = "Hola";
            String nombre = "Diego";
            String apellido = "González";
            int edad = 21;
            int a = 2;
            double b = 6.3;
            double resultado2 = 1.5;
            //Punto 1
            System.out.println(s);
            //Punto 2
            System.out.println("Hola " + nombre);
    
            //Punto 3
            System.out.printf("Hola %s %s, tengo: %d años ",nombre,apellido,edad);
            //Punto 4
            System.out.printf("\nNOMBRE: %s %s \nEDAD: %d años ",nombre,apellido,edad);
            //Punto 5
            System.out.printf("\n\"Primero\\Segundo\\Tercero\"");
            //Punto 6
            System.out.printf("\n%.1f\\%s = %.2f", b, a, resultado2);
    
        
        }
        
    }