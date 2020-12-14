package com.company;
import javax.print.DocFlavor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import linear_equation.linear_eq;


/**/

	public class Main {

		public static void main(String[] args)  {
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter the 'a' value for the ax+b = 0 equation");
			int a = in.nextInt();
			System.out.println("Enter the 'b' value for the ax+b = 0 equation");
			int b = in.nextInt();
			linear_eq l1 = new linear_eq();
			l1.solver(a,b);

		}

	}

/*Відповідь на теоретичне питання:
Пакети в джава - це згруповані класи. Їх використання дозволяє уникати певних проблем, наприклад конфліктування імен
класів. Для створення проекту потрібно на початку програми написати "package назва", а для імпортування - import назва*.
Для використання певного класу з пакету потрібно вказати "import назва.назва_класу". Для імплементації методів класу пакету
потрібно спочатку створити об'єкт класу ( назва_класу obj1 = new назва_класу). Статичний імпорт (import static назва_пакету)
дозволяє використання статичних членів класу/інтерфейсу по іменам, не уточнюючи їх назвою класу.
 */





//
/**/