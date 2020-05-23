import py4j.GatewayServer;

public class Main {

	public static void main(String[] args) {
		GatewayServer gatewayServer = new GatewayServer(new Manager());
		gatewayServer.start();
		System.out.println("Gateway Server Started");
	}
}
