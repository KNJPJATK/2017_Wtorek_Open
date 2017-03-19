package main;

public class Main {
	public static void main(String[] args) {


		// Komentarz jednolinijkowy

		/*
		 * Komentarz
		 * Wielolinijkowy
		 *
		 */


		// Proste wypisanie
		System.out.println("Hello World");

		// Typy proste zmiennych

		// Deklaracje
		int i;
		char c;
		double d;
		float f;
		boolean b;
		byte a;


		// Inicjalizacje
		i = 10;
		c = 'a'; // char jest również typem liczbowym! - możemy do niego dodawać i odejmować np int
		c = 15;
		d = 2.5;
		f = 2.5f;
		b = true;
		a = 100;

		// wypisywanie zmiennych - odwołujemy się po nadanej im nazwie
		System.out.println(i);

		// modulo - reszta z dzielenia
		System.out.println(13 % 2);

		int z;
		double y;

		// Prosty prosty program dodawjący
	/*
		System.out.println("Wprowadz pierwsza liczbe: ");
		Scanner scanner = new Scanner(System.in);
		z = scanner.nextInt();
		System.out.println("Wprowadz druga liczbe: ");
		y = scanner.nextDouble();

		int wynik = (int) (z + y);
		double wynikD = z + y;
		*/
		//	int wynik2 = Integer.parseInt(wynikD);


		// TABLICE
		// int tablica2[];

		// Dwa sposoby tworzenia tablic
		int[] tablica1 = new int[10];

		int[] tablica3 = {1, 2, 3, 4, 5, 6};


		// Przypisywanie wartości w tablicy
		tablica1[0] = 5; // tablice zaczynamy od indeksu 0! Ostatni znajduje się na length-1
		tablica1[1] = 10;

		System.out.println(tablica1[0]);


		// PĘTLE

		// for z użyciem wartości długości tablicy
		for (int x = 0; x < tablica3.length; x++) {
			System.out.println(tablica3[x]);
		}

		System.out.println("==============================================");


		// foreach - wypisujemy każdy element
		for (int element : tablica3) {
			System.out.println(element);
		}

		System.out.println("==============================================");

		// While - potrzebna wartośc do zliczania iteracji, niewygodne przy wypisywaniu elementów
		int rozmiar = 0;
		while (rozmiar < tablica3.length) {
			System.out.println(tablica3[rozmiar]);
			rozmiar++;
		}

		// Do While - zawsze wykonamy przynajmniej jeden "obrót" pętli.
		int rozmiar2 = 0;
		do {
			System.out.println(tablica3[rozmiar2]);
			rozmiar2++;
		} while (rozmiar2 < tablica3.length);


		// Instrukcje warunkowe
		int warunek = 10;

		// if sprawdzamy zawsze
		if (warunek == 10) {
			System.out.println("Zgadza sie");
		} else if (warunek == 5) {
			// else if sprawdzamy tylko jeśli nie spełnione są wcześniejsze warunki if/else if
			System.out.println("Nie zgadza sie");
		} else {
			// else wykonywane jest tylko jeśli nie spełniony jest żadny warunek if/else if
			System.out.println("Tez blad");
		}


		System.out.println("==============Switch=========================");

		int wybor = 10;

		// Jeśli nie mamy breaków wykonujemy wszystkie linijki kodu poniżej danego break'a.
		switch (wybor) {
			case 5:
				System.out.println(5);
				break;
			case 10:
				System.out.println(10);
				break;
			case 15:
				System.out.println(15);
				break;
			default:
				System.out.println("nic");
		}


		// operator trynarny, działa jak if


		// to so samo co:
		String wyraz;
		wyraz = (5 > 1) ? "tak" : "nie";

		System.out.println(wyraz);
		// zapis tego samego za pomocą ifa
		String wyraz;
		if (5 > 1) {
			wyraz = "tak";
		} else {
			wyraz = "nie";
		}


	}


}


