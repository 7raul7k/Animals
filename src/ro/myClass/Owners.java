package ro.myClass;

import java.util.ArrayList;

public class Owners implements Animals{
    ArrayList<Animals> animals;

    public Owners(ArrayList<Animals> animals) {
        this.animals = animals;
    }

    @Override
    public void sound() {
        for(int i = 0 ; i < animals.size();i++){
           animals.get(i).sound();
        }
    }

    @Override
    public Animals clone() {
      for (int i = 0 ; i < animals.size();i++){
          return animals.get(i).clone();
      }
      return null;
    }

    @Override
    public void describe() {
        for (int i = 0 ; i < animals.size();i++){
            animals.get(i).describe();
        }

    }
}
