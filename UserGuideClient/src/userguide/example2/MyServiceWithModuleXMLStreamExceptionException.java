
/**
 * MyServiceWithModuleXMLStreamExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package userguide.example2;

public class MyServiceWithModuleXMLStreamExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1345713355673L;
    
    private userguide.example2.MyServiceWithModuleXMLStreamException faultMessage;

    
        public MyServiceWithModuleXMLStreamExceptionException() {
            super("MyServiceWithModuleXMLStreamExceptionException");
        }

        public MyServiceWithModuleXMLStreamExceptionException(java.lang.String s) {
           super(s);
        }

        public MyServiceWithModuleXMLStreamExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MyServiceWithModuleXMLStreamExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(userguide.example2.MyServiceWithModuleXMLStreamException msg){
       faultMessage = msg;
    }
    
    public userguide.example2.MyServiceWithModuleXMLStreamException getFaultMessage(){
       return faultMessage;
    }
}
    