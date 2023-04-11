import java.util.*;

class TodolistImp implements TodolistInterface
  {
    LinkedList l=new LinkedList();
    Scanner sc=new Scanner(System.in);

    void addTasks()
    {
      System.out.println("Enter How Many Task you want to add");
      int num=sc.nextInt();
      String s;

      for(int i=0;i<num; i++)
      {
        s=sc.next();
        l.add(s);
      }
      ListIterator itr=l.listIterator();
      while(l.hashNext())
        System.out.println(l.next());
    }

    void editTasks()
    {
      int choice;
      System.out.println("Enter task to edit: ");
      String editTasks=sc.next();
      System.out.println("1. add first");
      System.out.println("2. add last");

      System.out.println("Enter your choice");
      choice=s.nextInt();

      switch(choice)
        {
            case 1: t.addTasks();
                break;
            case 2: t.editTasks(); 
                break;
          default: System.out.println("Invalid Option!");
        }
      ListIterator itr=l.listIterator();
      while(l.hasNext())
        {
          System.out.println(l.next());
        }
    }

    void deleteTasks()
    {
      System.out.println("Enter the Task to be removed");
      String task=sc.next();
      l.remove(task);

      ListIterator it=l.listIterator();
      while(l.hasNext())
        System.out.println(l.next());
    }
    
  }