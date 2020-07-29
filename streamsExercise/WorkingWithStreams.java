package streamsExercise;

import java.util.Arrays;
import java.util.List;



public class WorkingWithStreams {
		
		public static void main(String[] args) {
			
			List<Employee> list=Arrays.asList(new Employee(1, "Abhinava", 10, 2, "PL", "Male"),
					new Employee(2, "Sakshi", 20, 3, "TA", "Female"),
					new Employee(3, "Priyanka", 30, 4, "TA", "Female"),
					new Employee(4, "Anshul", 40, 5, "TA", "Male"),
					new Employee(5, "Anshu", 50, 4, "SE", "Female"),
					new Employee(5, "Shikha", 50, 4, "SE", "Female"));

					  
					System.out.println("---------------Employee id of employees working as TA------------");
					 Department(list);
					 System.out.println("-------------count of female employees----------------");
					 System.out.println(Count(list));
					 System.out.println("-----------------Sorted list of employees-------------");
					 Sort(list);
			
		}
		
		public static void Department(List<Employee> list) {

			list.stream().filter(t->t.getRole().equals("TA"))

			.forEach(t->System.out.println(t.getId()));

			}

			public static long Count(List<Employee> list) {

			return list.stream().filter(t->t.getGender().equals("Female"))

			.count();

			}

			public static void Sort(List<Employee> list) {

			list.stream().sorted((e,t)->e.getName().compareTo(t.getName()))

			.forEach(t->System.out.println(t.getName()));;

			}


}
