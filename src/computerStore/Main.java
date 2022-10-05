package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1=new GraphicCard();
		gk1.name="Nvidia rtx 3060";
		gk1.memory=16;
		gk1.bit=256;
		gk1.hdmi=false;
		GraphicCard gk2=new GraphicCard();
		gk2.name="GeForce gtx 1050";
		gk2.memory=32;
		gk2.bit=384;
		gk2.hdmi=false;
		gk1.printInfo();
		gk2.printInfo();
		gk2.printHdmi();
	}

}
