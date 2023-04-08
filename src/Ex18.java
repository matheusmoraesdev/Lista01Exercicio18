import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) throws Exception {
     double arquivo;
     double internet;
     double segundos,mpbs,minutos;
     Scanner reader = new Scanner(System.in);   
        System.out.print("Qual o tamanho do arquivo em (MB) que deseja baixar ? ");
            arquivo = reader.nextDouble();
        System.out.print("Qual a velocidade em (Mpbs) do link de internet ? ");
            internet = reader.nextDouble();
            reader.close();

        mpbs = internet / 8;
        segundos = arquivo / mpbs;
        minutos = segundos / 60;
        
        System.out.println("O tempo de download vai ser: " + minutos + " minutos");

    }
}
