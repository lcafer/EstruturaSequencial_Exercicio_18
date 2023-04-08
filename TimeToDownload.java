package EstruturaSequencial_Exercicio_18;
import java.util.Scanner;

public class TimeToDownload {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float downloadSpeed = 0.0f;
		float archiveSize = 0.0f;
		try {
			System.out.println("Insira a velocidade de download do link usado (Megabits por segundo):");
			downloadSpeed = userInput.nextFloat();
		} catch (Exception e1) {
			downloadSpeed = Float.parseFloat(userInput.nextLine());
		}
		try {
			System.out.println("Insira o tamanho do arquivo (Megabytes):");
			archiveSize = userInput.nextFloat();
		} catch (Exception e2) {
			archiveSize = Float.parseFloat(userInput.nextLine());
		}
		final float timeToDownloadInMinutes = archiveSize / ((downloadSpeed/8)*60);
		System.out.print("O tempo aproximado de download usando este link é de: " + timeToDownloadInMinutes + " minutos.");
		userInput.close();
	}
}
