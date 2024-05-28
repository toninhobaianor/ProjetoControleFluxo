import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        try {
            Contar(num1, num2);
        } catch (ParametrosInvalidosExceptions e) {
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
            
        }
        scanner.close();
    }

    static void Contar(int par_um,int par_dois) throws ParametrosInvalidosExceptions{

        int contagem = par_dois - par_um;
        if(contagem > 0){
            for(int i = 1;i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
        else{
            throw new ParametrosInvalidosExceptions();
        }
    }
}


