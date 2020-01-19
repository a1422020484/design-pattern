package listener;

public class PlayerLevelUp implements ListenerEvent {

	@Override
	public void event() {
		System.out.println("PlayerLevelUp");
	}

	@Override
	public void putIntoListener() {
		EventManager.getEventManager().addEvent(EventEnum.PLAYER_LEVELUP.getId(), this);
	}

}
