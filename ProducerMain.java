package InnarThreadComm;

public class ProducerMain {

	public static void main(String[] args) {
		
		Producer pro = new Producer();
		DemandThread dth = new DemandThread(pro);
		SupplyThread sth = new SupplyThread(pro);	
		
		dth.start();
		sth.start();
	}

}
