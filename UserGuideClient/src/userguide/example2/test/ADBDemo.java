package userguide.example2.test;

import java.rmi.RemoteException;

import userguide.example2.Echo;
import userguide.example2.EchoResponse;
import userguide.example2.MyServiceWithModuleStub;
import userguide.example2.MyServiceWithModuleXMLStreamExceptionException;

public class ADBDemo
{

	/**
	 * @param args
	 * @throws MyServiceWithModuleXMLStreamExceptionException 
	 */
	public static void main(String[] args)throws RemoteException, MyServiceWithModuleXMLStreamExceptionException
	{
		// TODO Auto-generated method stub
		
		MyServiceWithModuleStub stub=new MyServiceWithModuleStub("http://localhost:8081/axis2a/services/MyServiceWithModule");
		Echo req=new Echo();
		req.setEcho(null);
		EchoResponse res=stub.echo(req);

	}

}
