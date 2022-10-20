package InnarThreadComm;

public class SupplyThread extends Thread {
      
private Producer pro; 
	
	public SupplyThread(Producer pro) {
		super();
		this.pro = pro;
	}

	public void run()
	{
		pro.supply(3000);
	}
	
}
