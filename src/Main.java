public class Main {
	public static void main(String[] args) {
		//Задание 1
		System.out.println(" Задание 1 ");
		{
			for (int i = 0; i <= 10; i++)
				System.out.println(" Иттерация цикла " + i);
		}
		//Задание 2
		System.out.println(" Задание 2 ");
		{
			for (int i = 10; i >= 0; i--)
				System.out.println(" Иттерация цикла " + i);
		}
		//Задание 3
		System.out.println(" Задание 3 ");
		{
			for (int i = 0; i < 17; i += 2)
				System.out.println(" Иттерация цикла " + i);
		}
		//Задание 4
		System.out.println(" Задание 4 ");
		{
			for (int i = 10; i >= -10; i--)
				System.out.println(" Иттерация цикла " + i);
		}
		//Задание
		System.out.println(" Задание високосный год ");
		{
			for (int i = 2020; i <= 2070; i = i + 4)
				System.out.println(" високосный год " + i);
		}
		//Задание 2.1
		System.out.println(" Задание 2.1 ");
		{
			for (int i = 1904; i <= 2096; i = i + 4)
				System.out.println(i + " год является високосным");
		}
		//Задание 2.2
		System.out.println(" Задание 2.2 ");
		{
			for (int i = 7; i <= 98; i = i + 7)
				System.out.println(i);
		}
		//Задание 2.3
		System.out.println(" Задание 2.3 ");
		{
			for (int i = 1; i <= 512; i = i * 2)
				System.out.println(i);
		}
		//Задание
		System.out.println(" Задание пример ");
		{
			int salary = 65535;
			int total = 0;
			for (int i = 1; i <= 12; i++) {
				total = total + total / 100;
				total = total + salary;
				System.out.println("Месяц " + i + " Итого " + total);
			}
		}
		//Задание 3.1
		System.out.println(" Задание 3.1 ");
		{
			int salary = 29000;
			int total = 0;
			for (int i = 1; i <= 12; i++) {
				total = total + salary;
				System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей. ");
			}
		}
		//Задание 3.2
		System.out.println(" Задание 3.2 ");
		{
			int salary = 29000;
			int total = 0;
			for (int i = 1; i <= 12; i++) {
				total = total + total / 100;
				total = total + salary;
				System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей. ");
			}
		}
		// Циклы 2
		//Задание 1.1
		System.out.println(" Задание 1.1 ");
		{
			int salary = 15000;
			int total = 0;
			int i = 1;
			while (total < 2459000) {
				total = total + total / 100;
				total = total + salary;
				System.out.println("Месяц " + i++ + " , сумма накоплений равна " + total + " рублей. ");
			}
			{
				System.out.println(" Количество месяцев, необходимых для накопления данной суммы " + i++);
			}
		}
		//Задание 2.1
		System.out.println(" Задание 2.1 ");
		{
			int i = 1;
			while (i <= 10) {
				System.out.print(i++ + " ");
			}
			{
				System.out.println("  ");
			}
		}
		{
			for (int i = 10; i >= 1; i--) {
				System.out.print(i + " ");
			}
			{
				System.out.println("  ");
			}
		}
		//Задание 3.1
		System.out.println(" Задание 3.1 ");
		{
			int countryPopulationY = 12_000_000;
			int populationGrowth = 17;
			int mortality = 8;
			for (int i = 1; i <= 10; i++) {
				countryPopulationY = ((populationGrowth - mortality) * 12000) + countryPopulationY;
				System.out.println("Год " + i + " , численность населения составляет  " + countryPopulationY);
			}
		}
		//Задание 1.2
		System.out.println(" Задание 1.2 ");
		{
			int salary = 15000;
			int i = 1;
			for (; salary <= 12_000_000; i++) {
				salary = salary + salary / 100 * 7;
				System.out.println("Месяц " + i + " , сумма накоплений равна " + salary + " рублей. ");
			}
			{
				System.out.println(" Количество месяцев, необходимых для накопления данной суммы " + i);
			}
		}
		//Задание 2.2
		System.out.println(" Задание 2.2 ");
		{
			int salary = 15000;
			int i = 1;
			for (; salary <= 12_000_000; i++) {
				salary = salary + salary / 100 * 7;
				if (i % 6 == 0) {
					System.out.println("Месяц " + i + " , сумма накоплений равна " + salary + " рублей. ");
				}
			}
		}
		//Задание 3.2
		System.out.println(" Задание 3.2 ");
		{
			int salary = 15000;
			int i = 1;
			for (; i <= 12 * 9; i++) {
				salary = salary + salary / 100 * 7;
				if (i % 6 == 0) {
					System.out.println("Месяц " + i + " , сумма накоплений равна " + salary + " рублей. ");
				}
			}
		}
		//Задание 4.2
		System.out.println(" Задание 4.2 ");
		{
			for (int i = 5; i <= 31; i += 7) {
				System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
				if (i % 5 == 5)
					System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
			}
		}
		//Задание 1.3
		System.out.println(" Задание 1.3 ");
		{
			for (int i = 1820; i < 2122; i += 79) {
				System.out.println(i);
			}
		}
		//Задание 2.3
		System.out.println(" Задание 2.3 ");
		{
			int n = 2;
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " * " + i + " = " + n * i);
			}
		}

	}
}