package it.danilo.pattern.structural.proxy;

public class FolderProxy implements Ifolder {
	
	Folder folder;
	User user;
	
	public FolderProxy(User user) {
		// TODO Auto-generated constructor stub
		this.user=user;
	}

	@Override
	public void performOperations() {
		// TODO Auto-generated method stub
		if(user.getPassword().equalsIgnoreCase("dev")&&
				user.getUsername().equalsIgnoreCase("dev")) {
			folder=new Folder();
			folder.performOperations();
		}
		else {
			System.out.println("forbidden");
		}
	}

}
