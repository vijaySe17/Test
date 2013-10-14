

/**
 * MyServiceWithModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package userguide.example2;

    /*
     *  MyServiceWithModule java interface
     */

    public interface MyServiceWithModule {
          

        /**
          * Auto generated method signature
          * 
                    * @param echo1
                
             * @throws userguide.example2.MyServiceWithModuleXMLStreamExceptionException : 
         */

         
                     public userguide.example2.EchoResponse echo(

                        userguide.example2.Echo echo1)
                        throws java.rmi.RemoteException
             
          ,userguide.example2.MyServiceWithModuleXMLStreamExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param echo1
            
          */
        public void startecho(

            userguide.example2.Echo echo1,

            final userguide.example2.MyServiceWithModuleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param ping3
                
             * @throws userguide.example2.MyServiceWithModuleXMLStreamExceptionException : 
         */

         
                     public void ping(

                        userguide.example2.Ping ping3)
                        throws java.rmi.RemoteException
             
          ,userguide.example2.MyServiceWithModuleXMLStreamExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param ping3
            
          */
        public void startping(

            userguide.example2.Ping ping3,

            final userguide.example2.MyServiceWithModuleCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    