class Main {
  public static void main(String[] args) {
    String name1 = "Miguel Cayetano";
    String name2 = "Kris Cayetano";
    String name3 = "Angel Cayetano";
    String work1 = "Student";
    String work2 = "Nurse";
    String work3 = "Doctor";
    
    int age1 = 15;
    int age2 = 40;
    int age3 = 48;
    
    System.out.println("Member 1");
    System.out.println("Name: " + name1);
    System.out.println("Age: " + age1);
    System.out.println("Work: " + work1);
    System.out.println("\nMember 2");
    System.out.println("Name: " + name2);
    System.out.println("Age: " + age2);
    System.out.println("Work: " + work2);
    System.out.println("\nMember 3");
    System.out.println("Name: " + name3);
    System.out.println("Age: " + age3);
    System.out.println("Work: " + work3);
    System.out.println("\n\nTotal sum of ages: " + (age1+age2+age3));
    if (age1 > age2 && age1 > age3)
      System.out.println("Oldest: " + age1);
      
    else if (age2 > age3 && age2 > age1)
      System.out.println("Oldest: " + age2);
    
    else
      System.out.println("Oldest: " + age3);

    if (age3 < age2 && age3 < age1)
      System.out.println("Youngest: " + age3);
      
    else if (age2 < age1 && age2 < age1)
      System.out.println("Youngest: " + age2);
    
    else
      System.out.println("Youngest: " + age1);
  }
}