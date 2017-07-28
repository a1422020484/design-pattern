package memento;

/**
 * @author Administrator
 * 存储箱管理者
 */
public class RoleStateCaretaker {
	private RoleStateMemento memento;

	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}

}
