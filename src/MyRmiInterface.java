import java.rmi.*;
interface MyRmiInterface extends Remote
{
	public int sum(int a,int b) throws RemoteException;
}
