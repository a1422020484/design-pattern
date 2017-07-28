package memento;

/**
 * @author Administrator
 * 备忘录模式
 * 总共分三种类型：1、角色（发起人）2、角色存储箱（因为存储箱可能不是存储角色的所有信息）3、角色存储箱管理者
 * 
 * 核心：角色存储和管理
 */
public class Client {

	public static void main(String[] args) {
		RolePerson rolePerson = new RolePerson();
		rolePerson.getInstance();
		rolePerson.show();
		
		RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
		RoleStateMemento roleStateMemento = rolePerson.saveState();
		roleStateCaretaker.setMemento(roleStateMemento);
		
		rolePerson.fight();
		rolePerson.show();
		
		rolePerson.RecoveryState(roleStateCaretaker.getMemento());
		rolePerson.show();
		
	}

}
