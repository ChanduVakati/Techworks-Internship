//To-do List: Create a class called ToDoList that stores a collection of tasks in a LinkedList. The class should have methods to add, edit, and delete tasks, as well as to mark a task as complete and display all incomplete tasks.

import java.util.*;

class TodolistMain
  {
    public static void main(String arg[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      TodolistImp tm=new TodolistImp();
      System.out.println("1.Add Tasks");
      System.out.println("2.Edit Tasks");
      System.out.println("3.Delete Tasks");

      do
        {
          System.out.println("Enter your choice: ");
          choice=sc.nextInt();
          switch(choice)
            {
              case 1: tm.addTasks();
                break;
              case 2: tm.editTasks(); 
                break;
              case 3: tm.deleteTasks();
                break;
              default: System.out.println(" Invalid Option!");
            }
      System.out.println(" Do you want to continue one more operation: ");
          ch=sc.next().charAt(0);
        }
    while(ch!='n');
    }
  }