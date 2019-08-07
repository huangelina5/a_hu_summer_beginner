public class August_4_2019_1{
  public static void main(String[] args){
    author bob = new author("bob", "bob@gmail.com" , 'm');
    System.out.println(bob);
  }
}

class author{
  String name;
  String email;
  char gender;

  public author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;

  }

  public String getName(){
    return this.name;
  }

  public String getEmail(){
    return this.email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public char getGender(){
    return this.gender;
  }

  public String toString(){
    return this.name + "(" + this.gender + ") at " + this.email;
  }
}
