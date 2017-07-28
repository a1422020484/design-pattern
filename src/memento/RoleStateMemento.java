package memento;

/**
 * @author Administrator
 * 角色存储箱
 */
public class RoleStateMemento {
	private int attack;
	private int blood;

	public RoleStateMemento(int attack, int blood) {
		this.attack = attack;
		this.blood = blood;
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
