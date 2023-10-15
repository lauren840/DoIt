package com.example.doit_hack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.io.*;

@SpringBootApplication
public class DoItRunner {

    public static final int points = 0; 
    
    public static void main(String[] args) {
        SpringApplication.run(DoItHackApplication.class, args);

        List<Task> personal = new ArrayList<>();
        List<Task> social = new ArrayList<>();
        List<Task> community = new ArrayList<>();
        List<Task> markedDone = new ArrayList<>();
        
        addTask(personal, "personal.txt");
        addTask(social, "social.txt");
        addTask(community, "community.txt");
    }

  public static String chooseTask(List<Task> personal, List<Task> social, List<Task> community), List<Task> markedDone {
        int topic = genRand(3);
        int max = -1;
        int index = -1;
        Task todo = new Task();
        
        if (topic == 0) {
            points +=5;
            max = personal.size();
            index = genRand(max);
            todo = personal.remove(index);
            
        } else if (topic == 1) {
            points +=10;
            max = social.size();
            index = genRand(max);
            todo = social.remove(index);
            
        } else if (topic == 2) {
            points +=15;
            max = community.size();
            index = genRand(max);
            todo = community.remove(index);
        }

        markedDone.add(todo);
        String descr = todo.getDescription();
        return descr;
  }
    
    public static void addTask(List<Task> list, String fileName) throws FileNotFoundException {
    Scanner fileScan = new Scanner(new File(fileName));
    while (fileScan.hasNextLine()) {
      String taskDescrip = fileScan.nextLine(); 
      Task task = new Task(taskDescrip, false);
      list.add(task);
    }
  }

  public static int genRand(int limit) {
    Random rand = new Random();
    int index = rand.nextInt(limit);
    return index;
  }
    
}
