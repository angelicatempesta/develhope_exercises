public class Student {
    private String name ;
    private Integer age;
    private String city;
    private Double salary;
    private Character initial;



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(Integer age){
        this.age = age;
    }
    public String getAge(){
        if (age <=0 || age > 120){
            return "Insert a valid age!";
        } else
            return String.valueOf(age);
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public String getIsAdult(){
        if (age < 18 && age > 0){
            return "E' minorenne!";
        }  else if (age > 18 && age <120) {
            return "E' maggiorenne!";
        }
        return "Insert a valid age!";
    }

    public void setSalary(Double salary){
        if (salary < 0){
            System.out.println("Impossibile! I've worked so hard!");
        } else this.salary = salary;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void setInitial(Character initial){
        if (initial == name.charAt(0)) {
            this.initial = initial;
        }
    }

    public Character getInitial(){
        return this.initial;
    }


}


