package arrays;

class Person {
	
	private int id;
	private String name;
	private int age;
 
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Person))
                return false;
            Person person = (Person) obj;
            return id == person.id && name.equals(person.name) && age == person.age;
        }

		public Person(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
    }