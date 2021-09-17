import java.util.Random;
import java.util.Scanner;

public class Matris {

	public static void main(String[] args) {
		Random r = new Random();
		int n = 3, m = 3;
		int A[][] = new int[n][m];
		int B[][] = new int[n][m];
		int toplam[][] = new int[n][m];
		int fark[][] = new int[n][m];
		int carpim[][] = new int[n][m];
		int atranspoz[][] = new int[n][m];
		int btranspoz[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = r.nextInt(10);
				B[i][j] = r.nextInt(10);
			}
		}
		System.out.println("A matrisi");
		for (int k = 0; k < n; k++) {
			for (int c = 0; c < m; c++) {
				System.out.print(A[k][c] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("B matrisi");
		for (int k = 0; k < n; k++) {
			for (int c = 0; c < m; c++) {
				System.out.print(B[k][c] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("1)Toplama 2)Cikarma 3)Carpma 4)Transpoz");
		System.out.println("Bir secim yapiniz: ");
		Scanner s = new Scanner(System.in);
		int secim = s.nextInt();
		switch (secim) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					toplam[i][j] = A[i][j] + B[i][j];
				}
			}
			System.out.println();
			System.out.println("Toplam matrisi");
			for (int k = 0; k < n; k++) {
				for (int c = 0; c < m; c++) {
					System.out.print(toplam[k][c] + "  ");
				}
				System.out.println();
			}
			System.out.println();
			break;

		case 2:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					fark[i][j] = A[i][j] - B[i][j];
				}
			}
			System.out.println();
			System.out.println("Fark matrisi");
			for (int k = 0; k < n; k++) {
				for (int c = 0; c < m; c++) {
					System.out.print(fark[k][c] + "  ");
				}
				System.out.println();
			}
			System.out.println();
			break;

		case 3:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					carpim[i][j] = A[i][j] * B[i][j];
				}
			}
			System.out.println();
			System.out.println("Carpim matrisi");
			for (int k = 0; k < n; k++) {
				for (int c = 0; c < m; c++) {
					System.out.print(carpim[k][c] + "  ");
				}
				System.out.println();
			}
			System.out.println();
			break;

		case 4:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					atranspoz[i][j] = A[j][i];
					btranspoz[i][j] = B[j][i];
				}
			}
			System.out.println();
			System.out.println("A Transpoz matrisi");
			for (int k = 0; k < n; k++) {
				for (int c = 0; c < m; c++) {
					System.out.print(atranspoz[k][c] + "  ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("B Transpoz matrisi");
			for (int k = 0; k < n; k++) {
				for (int c = 0; c < m; c++) {
					System.out.print(btranspoz[k][c] + "  ");
				}
				System.out.println();
			}
			System.out.println();

			break;
		}

	}

}
