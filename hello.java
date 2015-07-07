
class WpromoteEmployee{
    private int age;
    private String name;
    public WpromoteEmployee(){

    }
    public WpromoteEmployee(int age,String name){
      this.age = age;
      this.name = name;
    }

    public void getEmployeeInformation(){
        System.out.println("Age: "+this.age+" Name: "+this.name);
    }

    public String getFoo(){
        return "foo";
    }
    //addMore
    //addMore

}
