
public class SafeHouse extends NormalLoc {

	
	SafeHouse(Player player){
		super(player,"Güvenli Ev");
	}

	@Override
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Canýnýz yenilendi");
		System.out.println("Þu an güvenli evdesiniz");
		return true;
	}
	
	
	
	
}
