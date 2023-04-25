package com.siddhu.camunda;
import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
@Named
public class DelegateTask implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // TODO Auto-generated method stub

        String name=(String) execution.getVariable("name");
        String status=(String) execution.getVariable("status");
        
        System.out.println("name"+name);
        System.out.println("status"+status);
                
    }
    
}