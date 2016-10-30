package net.craigsquire.flow.helloworld;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;

@Activities(version = "1.0")
@ActivityRegistrationOptions(
        defaultTaskScheduleToStartTimeoutSeconds = -1L,
        defaultTaskStartToCloseTimeoutSeconds = -1L)
public interface GreeterActivities {
   public String getName();
   public void say(String what);
}
