package net.craigsquire.flow.helloworld;

public class GreeterActivitiesImpl implements GreeterActivities {
   @Override
   public String getName() {
      return "World";
   }

   @Override
   public void say(String what) {
      System.out.println(what);
   }
}
