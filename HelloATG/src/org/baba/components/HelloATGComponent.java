package org.baba.components;

import atg.nucleus.GenericService;
import atg.nucleus.ServiceException;

//added DAS/classes.jar and DAS/servlet.jar in userlib ATG9.4
public class HelloATGComponent extends GenericService {

    public String firstStr = "Dummy Value"; /* This value will be overwritten */

    public String getFirstStr() {
        return firstStr;
    }

    public void setFirstStr(String firstStr) {
        this.firstStr = firstStr;
    }

    @Override
    public void doStartService() throws ServiceException {

        super.doStartService();

        System.out.println("Hello ATG Component!");
    }

    @Override
    public void doStopService() throws ServiceException {

        super.doStopService();

        System.out.println("Hello ATG Component! Stops now!");
    }
}

