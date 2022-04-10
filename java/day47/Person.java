package day47;

public class Person {//A1

		private String name;
		private int age;
		
		public String getName() {
			return name;
		}
		//TODO
		//if name is empty or null thrpw IllegalArgumentException
		//throw new Exception
		public void setName(String name) {
			if(name == null || name.isEmpty()) {
				throw new IllegalArgumentException("Can not be null or empty");
			}
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		//
		//
		public void setAge(int age) {
			if(age < 0) {
				throw new IllegalArgumentException("Can not be negative age");
			}
			this.age = age;
		}
			
}
