import java.util.*;

public class palindromo {

    public static boolean esPalindromo(String palabra) {
palabra = palabra.toLowerCase(); 
palabra = palabra.replace(" ", ""); //quita los espacios entre palabras
palabra = palabra.replace("á", "a"); //las palabras se les van a quitar los acentos
palabra = palabra.replace("é", "e");
palabra = palabra.replace("í", "i");
palabra = palabra.replace("ó", "o");
palabra = palabra.replace("ú", "u");

int a = 0;
int b = palabra.length() - 1;

for (int i =0; i<palabra.length(); i++){
if (palabra.charAt(a) == palabra.charAt(b)) {
a++;
b--;

}
else 
return false;

}

return true;

    }

public static void main(String[] args) {

Scanner lector = new Scanner (System.in);

String palabra;

System.out.println("Ingrese una palabra o frese:  ");
palabra = lector.nextLine();

if (esPalindromo(palabra))
System.out.println("Lo que usted escribi es palindromo");
else 
System.out.println("Lo que usted escribio no es un palindromo");



}





}
