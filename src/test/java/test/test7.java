package test;
/*Подключение библиотеки. JUnit - это библиотека, позволяющая
 * проводить модульное тестирование Java приложений. Класс Assert 
 * содержит набор утверждений, которые облегачют процесс тестирования. */
import static org.junit.Assert.*;
/*Аннтоация @Test указывает JUnit, что метод является тестовым методом*/
import org.junit.Test;
/*Импортирует из пакета NalogC класс tax*/
import NalogC.tax;
/*Объявляем новый класс test7*/
public class test7 {
	/*Обозначает новую переменную из класса tax*/
	tax tax = new tax();
	/*InterruptedException это проверяемое исключение, генерируемый многими методами стандартной библиотеки, которые блокируют поток исполнения*/
	@Test
	public void testTax() throws InterruptedException
	 {
		/*Подставляет значения в метод calcTax1,
		 * где высчитывают процент налога с дохода*/
	 double res= tax.calcTax(1000, 35);
		/*Заданное полученное значение*/
	 double toch=350.0;
		/*Сравнивают высчитанное методом calcTax и заранее заданное значение */
	 assertEquals(Double.toString(res),Double.toString(toch));
	 }
}
