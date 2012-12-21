import java.rmi.Naming;
public class MyClient 
{
	public static void main(String []args) throws Exception
	{
		MyRmiInterface stub = (MyRmiInterface)Naming.lookup("rmi://localhost:1099/proxyobj");
		int result = stub.sum(214,98);
		System.out.println("Result  =  "+result);
	}
	
	
}