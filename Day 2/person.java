class person {
  private string name;
  private int age;
  public person(string name, int age) {
    this.name = name;
    this.age = age;
    public string getName() {
      return name;
    }
    public void setName(string name) {
      this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age){
    if(age>=0) {
      this.age = age;
    } else{
      system.out.println("Age cannot be negative.");
    }
  }
}
