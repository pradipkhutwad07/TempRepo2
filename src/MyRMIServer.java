import java.rmi.*;
import java.rmi.server.*;

class MyRMIServer extends UnicastRemoteObject implements MyRmiInterface
{
	public MyRMIServer() throws RemoteException
	{
		System.out.println("Object created !!!");
	}

	public int sum(int a,int b) throws RemoteException
	{
		return (a+b);
	}

	public static void main(String args[])
	{
		try
		{
			MyRMIServer real_obj = new MyRMIServer();
			Naming.rebind("proxyobj",real_obj);
			System.out.println("Proxy Object created !!!");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}