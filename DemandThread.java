package InnarThreadComm;

public class DemandThread extends Thread {

private Producer pro ; 
	
	public DemandThread(Producer pro) {
		super();
		this.pro = pro;
	}
	
	public void run()
	{
		pro.demand(2000);
	}
}
