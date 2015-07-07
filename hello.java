
class WpromoteEmployee{
    private int age;
    private String name;
    public WpromoteEmployee(){

    }
    public WpromoteEmployee(int age,String name){
      this.age = age;
      this.name = name;
    }
    public String getEmployeeInformation(){
        System.out.println("Age: "+this.age+" Name: "+this.name);
    }
}
