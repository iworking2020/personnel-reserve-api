package ru.iworking.personnel.reserve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public interface ApplicationContextProvider extends ApplicationContextAware {

    ApplicationContext getApplicationContext();

}
