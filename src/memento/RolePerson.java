package memento;

/**
 * @author Administrator
 * 游戏角色
 */
public class RolePerson {
	private int attack;
	private int blood;

	public RoleStateMemento saveState() {
		return new RoleStateMemento(attack, blood);
	}

	public void RecoveryState(RoleStateMemento memento){
		this.attack = memento.getAttack();
		this.blood = memento.getBlood();
	}
	
	public void getInstance(){
		this.attack = 100;
		this.blood = 100;
	}
	
	public void fight(){
		this.attack = 0;
		this.blood = 0;
	}
	
	public void show(){
		System.out.println("attack:" + attack + " blood:" + blood);
	}
	
	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

}
