public Person copyPerson(Person p) {
  Person p2 = new Person();
  p2.name = p.name;
  p2.age = p.age;
  return p2;
}