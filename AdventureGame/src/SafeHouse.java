
public class SafeHouse extends NormalLoc {

	
	SafeHouse(Player player){
		super(player,"G�venli Ev");
	}

	@Override
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Can�n�z yenilendi");
		System.out.println("�u an g�venli evdesiniz");
		return true;
	}
	
	
	
	
}
